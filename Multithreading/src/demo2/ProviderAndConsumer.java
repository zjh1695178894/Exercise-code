//ԭʼ�����������ߣ�������ͬ�����ظ�����
//syschronized���ͬ������
//wait()��notify()�ȴ��ͻ��ѽ���ظ�
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
				this.data.setTitle("ƻ��");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.data.setNote("15Ԫ");
			}else{
				this.data.setTitle("�㽶");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.data.setNote("20Ԫ");
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
				this.data.set("ƻ��","15Ԫ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}else{
				this.data.set("�㽶","20Ԫ");
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
				this.data.set("ƻ��","15Ԫ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}else{
				this.data.set("�㽶","20Ԫ");
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
	 * flag=true,����������������������
	 * flag=false,�������ѣ�������������
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
