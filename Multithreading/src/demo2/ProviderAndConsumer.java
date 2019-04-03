//原始生产者消费者，产生不同步，重复数据
//syschronized解决同步问题
//wait()和notify()等待和唤醒解决重复
package demo2;
/*
class Provider implements Runnable{
	private Data data;
	public Provider(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			if(x%2==0){
				this.data.setTitle("苹果");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.data.setNote("15元");
			}else{
				this.data.setTitle("香蕉");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.data.setNote("20元");
			}
		}
	}
}
class Consumer implements Runnable{
	private Data data;
	public Consumer(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.data.getTitle()+"="+this.data.getNote());
		}
	}
}
class Data{
	private String title;
	private String note;
		System.out.println(this.title+"="+this.note);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
public class ProviderAndConsumer {
	public static void main(String args[]){
		Data data=new Data();
		new Thread(new Provider(data)).start();
		new Thread(new Consumer(data)).start();
	}
}
*/
/*
class Provider implements Runnable{
	private Data data;
	public Provider(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			if(x%2==0){
				this.data.set("苹果","15元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}else{
				this.data.set("香蕉","20元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class Consumer implements Runnable{
	private Data data;
	public Consumer(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.data.get();
		}
	}
}
class Data{
	private String title;
	private String note;
	public synchronized void set(String title,String note){
		this.title=title;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.note=note;
	}
	public synchronized void get(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.title+"="+this.note);
	}
}
public class ProviderAndConsumer {
	public static void main(String args[]){
		Data data=new Data();
		new Thread(new Provider(data)).start();
		new Thread(new Consumer(data)).start();
	}
}
*/
class Provider implements Runnable{
	private Data data;
	public Provider(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			if(x%2==0){
				this.data.set("苹果","15元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}else{
				this.data.set("香蕉","20元");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class Consumer implements Runnable{
	private Data data;
	public Consumer(Data data){
		this.data=data;
	}
	@Override
	public void run() {
		for(int x=0;x<50;x++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.data.get();
		}
	}
}
class Data{
	private String title;
	private String note;
	/*
	 * flag=true,允许生产，但不允许消费
	 * flag=false,允许消费，但不允许生产
	 */
	private boolean flag=true;
	public synchronized void set(String title,String note){
		if(this.flag==false){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.title=title;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.note=note;
		this.flag=false;
		super.notify();
	}
	public synchronized void get(){
		if(this.flag==true){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.title+"="+this.note);
		this.flag=true;
		super.notify();
	}
}
public class ProviderAndConsumer {
	public static void main(String args[]){
		Data data=new Data();
		new Thread(new Provider(data)).start();
		new Thread(new Consumer(data)).start();
	}
}
