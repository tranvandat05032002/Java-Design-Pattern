package DoSOLID;

import java.util.List;

public class EngineSapXep1 implements ISapXep {
	@Override
	public void sapXepGiam(List<Integer>lst) {
		for(int i = 0; i < lst.size(); i++) {
			for(int j = i + 1; j < lst.size() - 1; j++) {
				if(lst.get(j) > lst.get(i)) {
					Integer x = lst.get(i);
					lst.set(i, lst.get(j));
					lst.set(j, x);
				}
			}
		}
	}
}
