package demo2;

class Pen{
	public synchronized void get(Note note){
		System.out.println("为了本子");
		note.result();
	}
	public synchronized void result(){
		System.out.println("我需要本子");
	}
}
class Note{
	public synchronized void get(Pen pen){
		System.out.println("为了笔");
		pen.result();
	}
	public synchronized void result(){
		System.out.println("我需要笔");
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
