//Q4.Write a program for Merge sort. Repeat the experiment for different values of n, the number of elements.
import java.util.Scanner;
class ExpFourMergeSort
{
	void merge(int arr[], int low, int mid, int high)
	{
		 int n1 = mid - low + 1; 
		 int n2 = high - mid;
 
		 int L[] = new int [n1];
		 int R[] = new int [n2];

		for (int i=0; i<n1; ++i)
			L[i] = arr[low + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[mid + 1+ j];

		int i = 0, j = 0;

		int k = low;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			} 
			else
			{
				arr[k] = R[j];
				j++;
			}
				k++;
		}
		while (i < n1)
		{
			arr[k] = L[i];
			 i++;
			 k++;
		}
		while (j < n2)
		{
			 arr[k] = R[j];
			 j++;
			 k++;
		}
	} 
	void sort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int mid = (low+high)/2;

			 sort(arr, low, mid);
			 sort(arr , mid+1, high);

			merge(arr, low, mid, high);
		}
	}
	public void printArray(int arr[])
	{
		int n = arr.length;

		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println(); 
	}
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of Elements to be Sorted: ");

			 int s = sc.nextInt();
			 int arr1[] = new int[s];
				System.out.println("Enter " + s + " integers:-");

			for (int i = 0; i < s; i++)
				arr1[i] = sc.nextInt();
			ExpFourMergeSort ob = new ExpFourMergeSort();
			System.out.print("Before sorting: ");
			ob.printArray(arr1);

			ob.sort(arr1, 0, arr1.length-1);
 
			System.out.print("After sorting: ");
			ob.printArray(arr1);
	}
}