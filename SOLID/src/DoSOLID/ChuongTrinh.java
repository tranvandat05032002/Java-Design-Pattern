package DoSOLID;

import java.util.ArrayList;
import java.util.List;



public class ChuongTrinh {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(5);
		lst.add(11);
		lst.add(10);
		lst.add(0);
		lst.add(3);
		
		MyDataStructure x;
		
		x = new MyDataStructure(lst);
		x.setSapXepEngine(new EngineSapXep1());
		x.printData();
		x.xapXepGiamDan();
		x.printData();
	}

}
