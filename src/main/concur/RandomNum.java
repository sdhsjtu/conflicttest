package concur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class RandomNum implements Runnable {
	private List<String> list = new ArrayList<String>();

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list =list;
	}

	public void run() {
		Random random = new Random();
		list.add(Thread.currentThread().getName() + "----------------" + random.nextInt(100));
	}


}
