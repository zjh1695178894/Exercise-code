package demo2;

import java.util.Arrays;

public class MergeTest {

	public static void main(String[] args) {
			int[] arr={1,3,5,2,4,6,8,10};
			System.out.println(Arrays.toString(arr));
			mergeSort(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort(int[] arr,int low,int high){
		int middle=(low+high)/2;
		if(low<high){
		mergeSort(arr,low,middle);
		mergeSort(arr,middle+1,high);
		merge(arr,low,middle,high);
		}
	}
	public static void merge(int[] arr,int low,int middle,int high){
		//������ʱ����
		int[] temp=new int[high-low+1];
		//��һ������ı����±�
		int i=low;
		//�ڶ�������ı����±�
		int j=middle+1;
		//��ʱ�������±�
		int index=0;
		while(i<=middle&&j<=high){
			if(arr[i]<=arr[j]){
				temp[index]=arr[i];
				i++;
			}else{
				temp[index]=arr[j];
				j++;
			}
			index++;
		}
		while(i<=middle){
			temp[index]=arr[i];
			i++;
			index++;
		}
		while(j<=high){
			temp[index]=arr[j];
			j++;
			index++;
		}
		for(int k=0;k<temp.length;k++){
			arr[k+low]=temp[k];
		}
	}

}
