package demo2;

import java.util.Arrays;

//堆排序
/*堆排序的基本思想是：将待排序序列构造成一个大顶堆，
此时，整个序列的最大值就是堆顶的根节点。将其与末尾元素进行交换，
此时末尾就为最大值。然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。
如此反复执行，便能得到一个有序序列了*/
public class HeapTest {
	public static void main(String args[]){
		int[] arr={9,6,8,7,0,1,10,4,2};
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr){
		//调整为大顶堆的开始位置是最后一个非叶子结点，也就是最后一个叶子节点的父节点
		int start=(arr.length-1)/2;
		for(int i=start;i>=0;i--){
			maxHeap(arr,arr.length,i);
		}
		//先把数组第一个和最后一个数交换位置，再将前面部分再次转化为大顶堆
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeap(arr,i,0);
		}
	}
	//把数组调整成大顶堆
	public static void maxHeap(int[] arr,int size,int index){
		//左右子节点
		int leftNode=2*index+1;
		int rightNode=2*index+2;
		int max=index;
		if(leftNode<size&&arr[max]<arr[leftNode]){
			max=leftNode;
		}
		if(rightNode<size&&arr[max]<arr[rightNode]){
			max=rightNode;
		}
		if(max!=index){
			int temp=arr[max];
			arr[max]=arr[index];
			arr[index]=temp;
			maxHeap(arr,size,max);
		}
	}
}

