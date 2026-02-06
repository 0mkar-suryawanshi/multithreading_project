package codewithdurgesh;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Valu of i = " + i);
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		Thread thr = new Thread(t1);
		
		thr.start();
		
		AnotherThread t2 = new AnotherThread();
		
		t2.start();

	}

}
