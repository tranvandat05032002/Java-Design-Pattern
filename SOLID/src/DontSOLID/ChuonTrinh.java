package DontSOLID;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ChuonTrinh {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		lst.add(5);
		lst.add(11);
		lst.add(10);
		lst.add(0);
		lst.add(3);
		
		MyDateStructure x;
		x = new MyDataStructure2(lst);
		x.printData();
		
		x.sapXepGiamDan();
		
		x.printData();

	}

}
