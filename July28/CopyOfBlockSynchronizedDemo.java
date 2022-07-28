package multithreading_new;

/*class Board {

	synchronized void printTable(int n) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
//Thread 1
class MyThread3 extends Thread {
	Board t;

	MyThread3(Board t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}
//Thread 2
class MyThread4 extends Thread {
	Board t;

	MyThread4(Board t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class CopyOfBlockSynchronizedDemo {
	public static void main(String args[]) {
		Board obj = new Board();// only one object
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		t1.start();
		t2.start();
	}
}
*/