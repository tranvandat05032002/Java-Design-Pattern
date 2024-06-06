package com.tvdat.dp.composite.folder;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
@AllArgsConstructor
public class Folder implements Component {
	@Getter	@Setter
	private String name;
	private List<Component> lstFile = new ArrayList<>();	
	@Override
	public long getTotalSize() {
		long kq = 0;
		for (Component component : lstFile) {
			kq += component.getTotalSize();
		}
		return kq;
	}

	@Override
	public void print() {
		System.out.println(this.name + "/");
		for (Component component : lstFile) {
			component.print();
		}
		
	}
	
}
	