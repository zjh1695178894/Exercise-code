package demo2;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
		System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Test1 {
	public static void main(String[] args){
		MyThread t=new MyThread();
		new Thread(t).start();
		t.run();
		new Thread(t,"有名字的线程").start();
	}
}
