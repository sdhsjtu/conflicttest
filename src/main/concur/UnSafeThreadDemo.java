package concur;
/* гаЪБ:
 * 0 th2
0 th1
 */
public class UnSafeThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		final UserStat us = new UnSafeThreadDemo().new UserStat();
		Thread th1 = new Thread("th1") {
			@Override
			public void run() {
				System.out.println(us.getUserCount() + " " + super.getName());
			}
		};
		Thread th2 = new Thread("th2") {
			@Override
			public void run() {
				System.out.println(us.getUserCount() + " " + super.getName());
			}
		};
		th1.start();
//		Thread.sleep(1000);
		th2.start();
	}

	class UserStat {
		int userCount;

		public int getUserCount() {
			return userCount++;
		}
	}
}