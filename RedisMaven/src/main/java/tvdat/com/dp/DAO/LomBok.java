package tvdat.com.dp.DAO;
import lombok.*;
@Getter
@Setter
public class LomBok {
	private String name;
	private String dateOfBirth;
	private String address;
	
	
	public static void testLombok() {
		LomBok lb = new LomBok();
		
		lb.getAddress();
	}
	
//	
//	public LomBok(String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void printName() {
//		LomBok lombok = new LomBok("tranvandat", "05-03-2002", "4/8 TX");
////		System.out.println(lombok.get);
//	}
}