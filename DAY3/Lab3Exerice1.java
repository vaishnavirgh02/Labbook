package DAY3;

import java.util.Arrays;

public class Lab3Exerice1 {
	
	public static void main(String []args) {
		int array[]= {1,5,3,2,7,8,0,10};
		System.out.print(getSecondSmallest(array));
	}
	static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
}
