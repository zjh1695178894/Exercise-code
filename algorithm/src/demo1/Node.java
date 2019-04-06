package demo1;

public class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
	}
	//���ӽڵ�
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
	//�жϽڵ��Ƿ�����һ���ڵ�
	public boolean isLast(){
		return next==null;
	}
	//ɾ���ڵ�
	public void removeNext(){
		this.next=next.next;
	}
	//����ڵ�
	public void insertAfter(Node node){
		Node nextNext=next;
		this.next=node;
		node.next=nextNext;
	}
	//��ӡ���нڵ�
	public void show(){
		Node currentNode=this;
		do{
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}while(currentNode!=null);
		System.out.println();
	}
}