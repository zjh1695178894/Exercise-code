package demo3;
//˳��洢������
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
		//������
		if(2*index+1<data.length){
			frontShow(2*index+1);
		}
		//������
		if(2*index+2<data.length){
			frontShow(2*index+2);
		}
	}
}
