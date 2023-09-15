package threadpack;

class Thread2 extends Thread
//extending the thread class
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread using thread class");
		}
		
	}
		
}


class Thread3 implements Runnable
//implementing the runnable interface
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread using Runnable interface");
		}
		
	}	
}


public class ExtendRunnableThread {

	public static void main(String[] args) {
		
				
		Thread2 t2=new Thread2();//creating the object  
		t2.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main method"+i);
		}

		Thread3 t3=new Thread3();
		t3.run();
		for(int i=1;i<=5;i++) {
			System.out.println("main method"+i);
		}		
	}
}
