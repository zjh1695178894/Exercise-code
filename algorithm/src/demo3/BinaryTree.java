package demo3;

public class BinaryTree {
	TreeNode root;
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public void frontShow(){
		if(root!=null)
		root.frontShow();
	}
	public void middleShow(){
		if(root!=null)
		root.middleShow();
	}
	public void afterShow(){
		if(root!=null)
		root.afterShow();
	}
	public TreeNode search(int num){
		return root.search(num);
	}
	public void delete(int num){
		if(root.value==num){
			root=null;
		}else{
			root.delete(num);
		}
	}
}
