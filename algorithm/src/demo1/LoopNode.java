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
	//删除节点
	public void removeNext(){
		this.next=next.next;
	}
	//插入节点
	public void insertAfter(LoopNode node){
		LoopNode nextNext=next;
		this.next=node;
		node.next=nextNext;
	}
}