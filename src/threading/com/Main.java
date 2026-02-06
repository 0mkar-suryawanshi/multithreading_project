package threading.com;

class NumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Number Thread : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class AlphabetThread extends Thread {
	public void run() {
		for (char c = 'A'; c <= 'E'; c++) {
			System.out.println("Alphabet Thread: " + c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		NumberThread t1 = new NumberThread();
		t1.start();
		AlphabetThread t2 = new AlphabetThread();
		t2.start();

	}

}
