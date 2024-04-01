package DontSOLID;

import java.util.List;

public class MyDateStructure {
	protected List<Integer>lst;
	
	public MyDateStructure(List<Integer>lst) {
		this.lst = lst;
	}
	public void printData() {
		for(int i = 0; i < this.lst.size(); i++) {
			System.out.printf("%d ", this.lst.get(i));
		}
		System.out.println();
	}
	public void sapXepGiamDan() {
		for(int i = 0; i < lst.size(); i++) {
			for(int j = i + 1; j < lst.size() - 1; j++) {
				if(lst.get(j) > lst.get(i)) {
					Integer x = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, x);
				}
			}
		}
	}
}
