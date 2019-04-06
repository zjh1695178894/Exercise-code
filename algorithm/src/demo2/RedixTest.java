package demo2;
//基数排序
import java.util.Arrays;

public class RedixTest {
	public static void main(String args[]){
		int[] arr={23,99,888,4,6,25,47,65,597,45};
		System.out.println(Arrays.toString(arr));
		redixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void redixSort(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int maxLength=(max+"").length();
		//临时存储数据的数组
		int[][] temp=new int[10][arr.length];
		//用于标识temp对应位置中存放数字的数量
		int[] count=new int[10];
		for(int i=0,n=1;i<maxLength;i++,n*=10){
			for(int j=0;j<arr.length;j++){
				int ys=arr[j]/n%10;
				temp[ys][count[ys]]=arr[j];
				count[ys]++;
			}
			int index=0;
			for(int k=0;k<count.length;k++){
				if(count[k]!=0){
					for(int l=0;l<count[k];l++){
						arr[index]=temp[k][l];
						index++;
					}
					count[k]=0;
				}
			}
		}
		
	}
}
