package demo2;

import java.util.Arrays;

//������
/*������Ļ���˼���ǣ������������й����һ���󶥶ѣ�
��ʱ���������е����ֵ���ǶѶ��ĸ��ڵ㡣������ĩβԪ�ؽ��н�����
��ʱĩβ��Ϊ���ֵ��Ȼ��ʣ��n-1��Ԫ�����¹����һ���ѣ�������õ�n��Ԫ�صĴ�Сֵ��
��˷���ִ�У����ܵõ�һ������������*/
public class HeapTest {
	public static void main(String args[]){
		int[] arr={9,6,8,7,0,1,10,4,2};
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr){
		//����Ϊ�󶥶ѵĿ�ʼλ�������һ����Ҷ�ӽ�㣬Ҳ�������һ��Ҷ�ӽڵ�ĸ��ڵ�
		int start=(arr.length-1)/2;
		for(int i=start;i>=0;i--){
			maxHeap(arr,arr.length,i);
		}
		//�Ȱ������һ�������һ��������λ�ã��ٽ�ǰ�沿���ٴ�ת��Ϊ�󶥶�
		for(int i=arr.length-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeap(arr,i,0);
		}
	}
	//����������ɴ󶥶�
	public static void maxHeap(int[] arr,int size,int index){
		//�����ӽڵ�
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

