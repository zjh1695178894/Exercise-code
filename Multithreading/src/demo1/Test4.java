
package demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<String>{
	private String str;

	@Override
	public String call() throws Exception {
		for(int x=0;x<20;x++){
			System.out.println("ÂòÆ±£¬x="+x);
		}
		return "Æ±ÂôÍêÁË";
	}
	

	}
public class Test4 {
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		FutureTask<String> task=new FutureTask<String>(new MyThread3()); 
		new Thread(task).start();
		System.out.println(task.get());
	}
}