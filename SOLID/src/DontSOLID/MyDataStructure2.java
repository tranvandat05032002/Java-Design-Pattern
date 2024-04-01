package DontSOLID;
import java.util.*;
import java.util.List;

public class MyDataStructure2 extends MyDateStructure {
	
	
	public MyDataStructure2(List<Integer>lst) {
		super(lst);
	}
	public void printData() {
		for(int i = 0; i < this.lst.size(); i++) {
			System.out.printf("%d ", this.lst.get(i));
		}
		System.out.println();
	}
	public int partition(List<Integer> lst, int low, int high)
	{
	   
	  int pivot = lst.get(high);
	  int i = (low - 1);
	   
	  for(int j = low; j <= high; j++)
	  {
	    if(lst.get(j) > pivot)
	    {
	      i++;
	      Collections.swap(lst, i, j);
	    }
	  }
	  Collections.swap(lst, i+1, high);
	  return (i + 1);
	}
	 
	            
	public void quickSort(List<Integer> lst,int low,int high)
	{
	  if(low < high)
	  {
	     
	    int pi = this.partition(lst,low,high);
	    quickSort(lst, low, pi-1);
	    quickSort(lst, pi+1, high);
	  }
	}
	public void sapXepGiamDan() {
		System.out.printf("Xap xep giam theo quicksort...");
		this.quickSort(this.lst, 0, this.lst.size() - 1);
	}
}

