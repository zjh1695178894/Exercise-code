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
	//ǰ�����
	public void frontShow(){
		System.out.print(this.value+" ");
		if(lNode!=null){
			lNode.frontShow();
		}
		if(rNode!=null){
			rNode.frontShow();
		}
	}
	//�������
		public void middleShow(){
			if(lNode!=null){
				lNode.middleShow();
			}
			System.out.print(this.value+" ");
			if(rNode!=null){
				rNode.middleShow();
			}
		}
		//�������
		public void afterShow(){	
			if(lNode!=null){
				lNode.afterShow();
			}
			if(rNode!=null){
				rNode.afterShow();
			}
			System.out.print(this.value+" ");
		}
		//����
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
		//ɾ��һ������
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
