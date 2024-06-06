package com.tvdat.dp.composite.folder;

import lombok.*;
@AllArgsConstructor
@Data
public class File implements Component {
	private String name;
	private int size;
	@Override
	public long getTotalSize() {
		return this.size;
	}

	@Override
	public void print() {
		System.out.println(this.name + "/");
	}

}
