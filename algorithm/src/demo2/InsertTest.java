package demo2;
//��������
import java.util.Arrays;

public class InsertTest {
	public static void main(String args[]){
		int[] arr={9,8,6,3,4,5};
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int temp=arr[i];
				int j;
				for(j=i-1;j>=0&&temp<arr[j];j--){
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}
	}
}
