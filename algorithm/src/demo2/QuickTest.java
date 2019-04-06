package demo2;
//¿ìËÙÅÅÐò
import java.util.Arrays;

public class QuickTest {
	public static void main(String args[]){
		int[] arr1={4,6,2,9,8,7,3};
		int[] arr2={4,6,2,9,8,7,3};
		fastSort(arr1,0,arr1.length-1);
		System.out.println(Arrays.toString(arr1));
		quickSort(arr2,0,arr2.length-1);
		System.out.println(Arrays.toString(arr2));
	}
	public static void fastSort(int[] arr,int low,int high){
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
		
		fastSort(arr,low,i-1);
		fastSort(arr,i+1,high);
	}
	
	public static void quickSort(int []arr,int start,int end){
		if(start>end){
			return;
		}
		int low=start;
		int high=end;
		int stard=arr[low];
		while(low<high){
			while(low<high&&stard<=arr[high]){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&stard>=arr[low]){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=stard;
		quickSort(arr,start,low-1);
		quickSort(arr,low+1,end);
	}
}