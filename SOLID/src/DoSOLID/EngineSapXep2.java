package DoSOLID;

import java.util.Collections;
import java.util.List;

public class EngineSapXep2 implements ISapXep {
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
	@Override
	public void sapXepGiam(List<Integer> lst) {
		this.quickSort(lst, 0, lst.size() - 1);
	}
}
