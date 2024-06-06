package com.tvdat.dp.UI;

import java.util.Arrays;

import com.tvdat.dp.MODELS.Component;
import com.tvdat.dp.MODELS.File;
import com.tvdat.dp.MODELS.Folder;

public class Client {

	public static void main(String[] args) {
		Component baitap01 	= new File("baitap01", 5);
		Component baitap02 	= new File("baitap02", 3);
		Component abc 		  = new File("abc", 12);
		Component test 		  = new File("test", 1);
		
		Component LYTHUYET 	= new Folder("LY THUYET", Arrays.asList(abc));
		Component JAVA 		  = new Folder("JAVA", Arrays.asList(baitap01, baitap02, LYTHUYET)); 
		Component CSHARP 	  = new Folder("C#", Arrays.asList());		
		Component LAPTRINH 	= new Folder("LAP TRINH", Arrays.asList(JAVA, CSHARP, test));
		
		System.out.println("Kich thuoc cua CSHARP la: " + CSHARP.getTotalSize());
		System.out.println("Kich thuoc cua LAPTRINH la: " + LAPTRINH.getTotalSize());
		System.out.println("Kich thuoc cua abc la: " + abc.getTotalSize());
		System.out.println("Kich thuoc cua baitap02 la: " + baitap02.getTotalSize());
		
		System.out.println("Duong Dan Cac Fie va Folder: ");
		System.out.println("--------------------------------");
		CSHARP.display("");
		System.out.println("--------------------------------");
		LAPTRINH.display("");
		System.out.println("--------------------------------");
		abc.display("");
		System.out.println("--------------------------------");
		baitap02.display("");
	}

}
