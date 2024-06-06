package com.tvdat.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//abstract factory import
//import com.tvdat.AbstractFactory.AbstractFactory;
import com.tvdat.AbstractFactory.DongVatAnCo;
import com.tvdat.AbstractFactory.DongVatAnThit;
import com.tvdat.AbstractFactory.DongVatStyle1;
import com.tvdat.dp.Builder.Banh;
import com.tvdat.dp.Decorator.Cafe;
import com.tvdat.dp.Decorator.CafeRangXay;
import com.tvdat.dp.Decorator.LayerDuongOfCafe;
import com.tvdat.dp.Decorator.LayerOfCafe;
import com.tvdat.dp.Decorator.LayerSuaOfCafe;
import com.tvdat.dp.Prototype.SinhVien;
import com.tvdat.dp.Prototype.SinhVienNuocNgoai;
import com.tvdat.dp.State.Phone;
import com.tvdat.dp.State.StateChuan;
import com.tvdat.dp.State.StateImLang;
import com.tvdat.dp.State.StateNgoaiTroi;
import com.tvdat.dp.composite.folder.Component;
import com.tvdat.dp.composite.folder.File;
import com.tvdat.dp.composite.folder.Folder;
import com.tvdat.dpComposite.Boss;
import com.tvdat.dpComposite.BusinessAnalyst;
import com.tvdat.dpComposite.Developer;
import com.tvdat.dpComposite.Leader;

//factory method import
//import com.tvdat.dp.FactoryMethod.ConChoFactory;
//import com.tvdat.dp.FactoryMethod.ConMeoFactory;
//import com.tvdat.dp.FactoryMethod.ConVatFactory;
//import com.tvdat.dp.FactoryMethod.ConVatMethod;

// simple factory import
//import com.tvdat.dp.SimpleFactory.ConVatFactory;
//import com.tvdat.dp.SimpleFactory.ConVatMethod;

public class Client {
	public static void testDontPrototype() {
		// Khởi tạo danh sách
		ArrayList<SinhVien> lst1 = new ArrayList<>();

		lst1.add(new SinhVien("sv1", "Nguyễn Văn Trung"));
		lst1.add(new SinhVienNuocNgoai("sv2", "Trần Văn", "Công ty ABC"));
		lst1.add(new SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new SinhVien("sv100", "John Smith"));
		System.out.println("DANH SÁCH GỐC");
		for (int i = 0; i < lst1.size(); i++)
				System.out.println(lst1.get(i).toString());
		ArrayList<SinhVien> lst2 = new ArrayList<>();
		for (int i = 0; i < lst1.size(); i++) {
				SinhVien x = lst1.get(i);
				if(x instanceof SinhVienNuocNgoai) {
					lst2.add(new SinhVienNuocNgoai((SinhVienNuocNgoai) x));
				}
				else {
					lst2.add(new SinhVien(x));
				}
		}
		for (int i = 0; i < lst2.size(); i++)
			System.out.println(lst2.get(i).toString());
	}
	public static void testPrototype() {
		ArrayList<SinhVien> lst1 = new ArrayList<>();

		lst1.add(new SinhVien("sv1", "Nguyễn Văn Trung"));
		lst1.add(new SinhVienNuocNgoai("sv2", "Trần Văn", "Công ty ABC"));
		lst1.add(new SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new SinhVien("sv100", "John Smith"));
		System.out.println("DANH SÁCH GỐC");
		for (int i = 0; i < lst1.size(); i++)
				System.out.println(lst1.get(i).toString());
		ArrayList<SinhVien> lst2 = new ArrayList<>();
		for (int i = 0; i < lst1.size(); i++) {
				SinhVien x = lst1.get(i);
				lst2.add(x.taoBanSao());
		}
		System.out.println("Danh sach copy");
		for (int i = 0; i < lst2.size(); i++)
			System.out.println(lst2.get(i).toString());
	}
	public static void main(String[] args) {
		// Test simple factory
//		ConVatMethod ConVat = (new ConVatFactory()).getConVatFactory("Cho");
//		ConVat.keu();
		
		// Test Factory Method
//		ConVatMethod convat;
//		ConVatFactory f;
//		
//		f = new ConMeoFactory();
//		convat = f.getConVat();
//		convat.Keu();
//		
//		f = new ConChoFactory();
//		convat = f.getConVat();
//		convat.Keu();
		
		// Test abstract factory
//		AbstractFactory f;
//		f = new DongVatStyle1();
//		DongVatAnCo dvac = f.taoDongVatAnCo();
//		DongVatAnThit dvat = f.taoDongVatAnThit();
//		dvat.duoi(dvac);
		
//		Banh x = new Banh.Builder(12.1, 4.2).build();
//		System.out.println(x.getBot());
		// Test prototype
//		testDontPrototype();
//		testPrototype();
		// test decorator
//		Cafe cafe;
//		cafe = new CafeRangXay();
//		cafe = new LayerSuaOfCafe(cafe);
//		System.out.println(cafe.getMota() + "     " + cafe.getGia());
		// test state
//		Phone dt = new Phone();
//		
//		dt.setProfile(new StateChuan());
//		dt.onCalling();
//		dt.onSMSReceived();
//		dt.onSysNotification();
//		
//		System.out.println("----------------------------------------");
//		
//		dt.setProfile(new StateNgoaiTroi());
//		dt.onCalling();
//		dt.onSMSReceived();
//		dt.onSysNotification();
//		
//		System.out.println("----------------------------------------");
//		
//		dt.setProfile(new StateImLang());
//		dt.onCalling();
//		dt.onSMSReceived();
//		dt.onSysNotification();
		// test composite employee
//		Boss boss = new Boss("Tran Van Dat", 22, 20000000);
//		Leader leader = new Leader("Hoang Anh", 21, 12000000);
//		
//		BusinessAnalyst bs = new BusinessAnalyst("Business Analyst 1 ", 21, 10000000);
//		Developer dv1 = new Developer("Develop1", 25, 500000);
//		Developer dv2 = new Developer("Develop2", 28, 700000);
//		
//		boss.add(leader);
//		boss.add(bs);
//		leader.add(dv1);
//		leader.add(dv2);
//		
//		boss.print();
		// test composite Folder
		Component baitap01 	= new File("baitap01", 5);
		Component baitap02 	= new File("baitap02", 3);
		Component abc 		  = new File("abc", 12);
		Component test 		  = new File("test", 1);
		
		Component LYTHUYET 	= new Folder("LY THUYET", Arrays.asList(abc));
		
		Component JAVA 		  = new Folder("JAVA", Arrays.asList(baitap01, baitap02, LYTHUYET));
		Component CSHARP 	  = new Folder("C#", Arrays.asList());
		Component LAPTRINH = new Folder("LAP TRINH", Arrays.asList(JAVA, CSHARP, test));
		
		System.out.println("Kich thuoc cua CSHARP la: " + CSHARP.getTotalSize());
		System.out.println("Kich thuoc cua LAPTRINH la: " + LAPTRINH.getTotalSize());
		System.out.println("Kich thuoc cua abc la: " + abc.getTotalSize());
		
//		LAPTRINH.print();
//		CSHARP.print();
		baitap01.print();
	}

}
