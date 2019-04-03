
package demo1;

class MyThread2 implements Runnable{
	private String str;
	public MyThread2(String str){
		this.str=str;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(this.str+",i="+i);
		}
	}
}
public class Test2 {
	public static void main(String args[]){
		MyThread2 t1=new MyThread2("�߳�A");
		MyThread2 t2=new MyThread2("�߳�B");
		MyThread2 t3=new MyThread2("�߳�C");
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
	}
}