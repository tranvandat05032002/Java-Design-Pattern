// Lớp lá
package com.tvdat.dp.MODELS;
import lombok.*;
@AllArgsConstructor
public class File implements Component {
	@Getter 
	@Setter
	private String name;
	
	private long size;
	@Override
	public long getTotalSize() {
		return this.size;
	}
	@Override
    public void display(String path) {
        System.out.println("Kích thước của file " + name + " → " + size + " kb");
    }
}
