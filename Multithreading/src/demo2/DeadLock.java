package demo2;

class Pen{
	public synchronized void get(Note note){
		System.out.println("Ϊ�˱���");
		note.result();
	}
	public synchronized void result(){
		System.out.println("����Ҫ����");
	}
}
class Note{
	public synchronized void get(Pen pen){
		System.out.println("Ϊ�˱�");
		pen.result();
	}
	public synchronized void result(){
		System.out.println("����Ҫ��");
	}
}

public class DeadLock implements Runnable{
	private static Pen pen=new Pen();
	private static Note note=new Note();
	public static void main(String args[]){
		new DeadLock();
	}
	public DeadLock(){
		new Thread(this).start();
		pen.get(note);
	}
	@Override
	public void run() {
		note.get(pen);
	}
	
}
