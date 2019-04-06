package demo1;

public class LoopNode {
	int data;
	LoopNode next=this;
	public LoopNode(int data){
		this.data=data;
	}
	public LoopNode next(){
		return this.next;
	}
	public int getData() {
		return data;
	}
	//ɾ���ڵ�
	public void removeNext(){
		this.next=next.next;
	}
	//����ڵ�
	public void insertAfter(LoopNode node){
		LoopNode nextNext=next;
		this.next=node;
		node.next=nextNext;
	}
}