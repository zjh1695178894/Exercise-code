package demo3;

public class TestBinaryTree {
	public static void main(String args[]){
	//二叉树创建
	BinaryTree binTree=new BinaryTree();
	TreeNode root=new TreeNode(1);
	binTree.setRoot(root);
	TreeNode rootLeft=new TreeNode(2);
	TreeNode rootright=new TreeNode(2);
	root.setlNode(rootLeft);
	root.setrNode(rootright);
	rootLeft.setlNode(new TreeNode(4));
	rootLeft.setrNode(new TreeNode(5));
	rootright.setlNode(new TreeNode(6));
	rootright.setrNode(new TreeNode(7));
	//二叉树遍历
	binTree.frontShow();
	System.out.println();
	binTree.middleShow();
	System.out.println();
	binTree.afterShow();
	//二叉树查找
	System.out.println();
	TreeNode result1=root.search(5);
	TreeNode result2=root.search(9);
	System.out.println(result1+" "+result2);
	//删除子树
	binTree.delete(5);
	binTree.frontShow();
	}
}
