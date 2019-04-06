package demo2;

import java.util.Arrays;

//ц╟ещеепР
public class BubbleTest {
	public static void main(String arg[]){
		int[] arr={9,8,6,3,4,5};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
	}
	public static void bubbleSort(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}