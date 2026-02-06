package codewithdurgesh;

public class AnotherThread extends Thread {
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("Another Thread  = "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				
			}
		}
	}

}
