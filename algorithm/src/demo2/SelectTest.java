package demo2;

import java.util.Arrays;

public class SelectTest {
	public static void main(String arg[]){
		int[] arr={9,8,6,3,4,5};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			if(min!=i){
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}
}
