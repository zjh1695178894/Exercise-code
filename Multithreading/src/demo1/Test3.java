package demo1;

public class Test3 {
	public static void main(String[] args){
		new Thread(new Runnable(){
			public void run(){
				System.out.println("hello world");
			}
		}).start();
		new Thread(()->System.out.println("hello,world")).start();
	}
}
