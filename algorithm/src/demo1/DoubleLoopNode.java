package demo1;

public class DoubleLoopNode {
	 DoubleLoopNode pre=this;
	 DoubleLoopNode next=this;
	 int data;
	 public DoubleLoopNode(int data){
		 this.data=data;
	 }
	 public void insert(DoubleLoopNode node){
		 DoubleLoopNode nextNext=next;
		 this.next=node;
		 node.pre=this;
		 nextNext.pre=node;
		 node.next=nextNext;
	 }
	 public DoubleLoopNode next(){
		 return this.next;
	 }
	 public DoubleLoopNode pre(){
		 return this.pre;
	 }
}
