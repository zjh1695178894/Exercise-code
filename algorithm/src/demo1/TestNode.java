package demo1;

public class TestNode {
	public static void main(String args[]){
	Node n1=new Node(1);
	Node n2=new Node(2);
	Node n3=new Node(3);
	n1.append(n2);
	n1.append(n3);
	System.out.println(n1.next.next.getData());
	n1.show();
	n1.next.removeNext();
	n1.show();
	n2.insertAfter(new Node(4));
	n1.show();
	}	
}
