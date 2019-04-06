package demo1;

public class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
	}
	//连接节点
	public void append(Node node){
		Node currentNode=this;
		while(true){
			Node nextNode=currentNode.next;
			if(nextNode==null){
				break;
			}
			currentNode=nextNode;
		}
		currentNode.next=node;
	}
	public Node next(){
		return this.next;
	}
	public int getData() {
		return data;
	}
	//判断节点是否有下一个节点
	public boolean isLast(){
		return next==null;
	}
	//删除节点
	public void removeNext(){
		this.next=next.next;
	}
	//插入节点
	public void insertAfter(Node node){
		Node nextNext=next;
		this.next=node;
		node.next=nextNext;
	}
	//打印所有节点
	public void show(){
		Node currentNode=this;
		do{
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}while(currentNode!=null);
		System.out.println();
	}
}