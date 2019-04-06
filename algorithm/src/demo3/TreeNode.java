package demo3;

public class TreeNode {
	int value;
	TreeNode lNode;
	TreeNode rNode;
	public TreeNode(int value){
		this.value=value;
	}
	public void setlNode(TreeNode lNode) {
		this.lNode = lNode;
	}
	public void setrNode(TreeNode rNode) {
		this.rNode = rNode;
	}
	//前序遍历
	public void frontShow(){
		System.out.print(this.value+" ");
		if(lNode!=null){
			lNode.frontShow();
		}
		if(rNode!=null){
			rNode.frontShow();
		}
	}
	//中序遍历
		public void middleShow(){
			if(lNode!=null){
				lNode.middleShow();
			}
			System.out.print(this.value+" ");
			if(rNode!=null){
				rNode.middleShow();
			}
		}
		//后序遍历
		public void afterShow(){	
			if(lNode!=null){
				lNode.afterShow();
			}
			if(rNode!=null){
				rNode.afterShow();
			}
			System.out.print(this.value+" ");
		}
		//查找
		public TreeNode search(int num){
			TreeNode temp=null;
			if(this.value==num){
				return this;
			}else{
				if(lNode!=null){
					temp=lNode.search(num);
				}
				if(temp!=null){
					return temp;
				}
				if(rNode!=null){
					temp=rNode.search(num);
				}
				if(temp!=null){
					return temp;
				}
			}
			return temp;
		}
		//删除一颗子树
		public void delete(int num) {
			TreeNode parent=this;
			if(parent.lNode!=null&&parent.lNode.value==num){
				parent.lNode=null;
				return;
			}
			if(parent.rNode!=null&&parent.rNode.value==num){
				parent.rNode=null;
				return;
			}
			parent=lNode;
			if(parent!=null){
				parent.delete(num);
			}
			parent=rNode;
			if(parent!=null){
				parent.delete(num);
			}
		}
}
