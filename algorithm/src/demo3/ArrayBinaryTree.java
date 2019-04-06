package demo3;
//Ë³Ğò´æ´¢¶ş²æÊ÷
public class ArrayBinaryTree {
	int[] data;
	public ArrayBinaryTree(int[] data){
		this.data=data;
	}
	public void frontShow(int index){
		if(data==null||data.length==0){
			return;
		}
		System.out.print(data[index]+" ");
		//×ó×ÓÊ÷
		if(2*index+1<data.length){
			frontShow(2*index+1);
		}
		//ÓÒ×ÓÊ÷
		if(2*index+2<data.length){
			frontShow(2*index+2);
		}
	}
}
