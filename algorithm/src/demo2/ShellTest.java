package demo2;
//Ï£¶ûÅÅĞò
import java.util.Arrays;

public class ShellTest {
	public static void main(String arg[]){
		int[] arr={9,8,6,3,4,5};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void shellSort(int[] arr){
		for(int d=arr.length/2;d>0;d/=2){
			for(int i=d;i<arr.length;i++){
				for(int j=i-d;j>=0;j-=d){
					if(arr[j]>arr[j+d]){
						int temp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
					}
				}
			}
		}
	}
}
