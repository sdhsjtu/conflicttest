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

	public static void main(String[] args) throws InterruptedException {
		RandomNum randomNum = new RandomNum();
		Thread thread1 = new Thread(randomNum);
		Thread thread2 = new Thread(randomNum);
		Thread thread3 = new Thread(randomNum);
		Thread thread4 = new Thread(randomNum);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		for (String str : randomNum.getList()) {
			System.out.println(str);
		}

	}

}
