// Lớp phức
package com.tvdat.dp.MODELS;
import java.util.ArrayList;
import java.util.List;
import lombok.*;
@AllArgsConstructor
public class Folder implements Component {
	@Getter 
	@Setter
	private String name;
	
	private List<Component> lstItem = new ArrayList<>();
	
	@Override
	public long getTotalSize() {
			long kq = 0;
			for (Component x : this.lstItem)
					kq += x.getTotalSize();
			return kq;
	}
	@Override
    public void display(String path) {
        System.out.println("Đường dẫn đầy đủ của thư mục " + name + " → " + path + "/" + name);
        System.out.println("Kích thước của thư mục " + name + " → " + getTotalSize() + " kb");
    }
//	@Override
//	public String getName() {
//		String kq = "";
//		for (Component x : this.lstItem)
//				kq += this.name() + "/";
//		return kq;
//}

}
