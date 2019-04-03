package demo2;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = {4,5,3,6,2,1};
		
		fastSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void fastSort(int[] arr,int low,int high){
		if(low>=high){
			return;
		}
		
		int i = low;
		int j = high;
		int key = arr[low];
		int temp;
		
		while(i<j){
			while(i<j && arr[j]>=key){
				j--;
			}
			while(i<j && arr[i]<=key){
				i++;
			}
			

				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			
		}
		
		arr[low] = arr[i];
		arr[i] = key;
		
		System.out.println(i);
		
		fastSort(arr,low,i-1);
		fastSort(arr,i+1,arr.length-1);
	}

}
