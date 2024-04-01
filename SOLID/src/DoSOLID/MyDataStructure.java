package DoSOLID;

import java.util.List;

public class MyDataStructure {
	protected List<Integer>lst; 
	private ISapXep sapXepEngine;
	
	public MyDataStructure(List<Integer>lst) {
		this.lst = lst;
	}
	public void setSapXepEngine(ISapXep obj) {
		this.sapXepEngine = obj;
	}
	public void printData() {
		for(int i = 0; i < this.lst.size(); i++) {
			System.out.printf("%d ", this.lst.get(i));
		}
		System.out.println();
	}
	public void xapXepGiamDan() {
		this.sapXepEngine.sapXepGiam(this.lst);
	}
}
