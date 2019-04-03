package demo1;

class MyThread extends Thread{
	private String str;
	public MyThread(String str){
		this.str=str;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(this.str+",i="+i);
		}
	}
}
public class Test1 {
	public static void main(String args[]){
		Thread t1=new MyThread("�߳�A");
		Thread t2=new MyThread("�߳�B");
		Thread t3=new MyThread("�߳�C");
		t1.start();
		t2.start();
		t3.start();
	}
}
