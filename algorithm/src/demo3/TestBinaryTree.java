package demo3;

public class TestBinaryTree {
	public static void main(String args[]){
	//����������
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
	//����������
	binTree.frontShow();
	System.out.println();
	binTree.middleShow();
	System.out.println();
	binTree.afterShow();
	//����������
	System.out.println();
	TreeNode result1=root.search(5);
	TreeNode result2=root.search(9);
	System.out.println(result1+" "+result2);
	//ɾ������
	binTree.delete(5);
	binTree.frontShow();
	}
}
