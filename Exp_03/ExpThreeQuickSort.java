//3.Write a program for Quick sort. Repeat the experiment for different values of n, the number of elements.
import java.util.*;
class ExpThreeQuickSort
{
	int partition(int array[], int low, int high)
	{
		int pivot = array[high];
		int i = (low-1);
		for (int j=low; j<high; j++)
		{
			if (array[j] < pivot)
			{
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		} 
			int temp = array[i+1];
			array[i+1] = array[high];
			array[high] = temp;

			return i+1;
	}
	void sort(int array[], int low, int high)
	{
		if (low < high)
		{
			 int pi = partition(array, low, high);
			 sort(array, low, pi-1);
			 sort(array, pi+1, high);
		}
	}
	static void printArray(int array[])
	{
		int n = array.length;
		for (int i=0; i<n; ++i)
			System.out.print(array[i]+" "); 
		System.out.println();
	}
	public static void main(String args[])
	{
		int i,j,size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array-:");
		size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the " +size+" Elements in Array-:");

		for(i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
			int n = array.length;

		ExpThreeQuickSort ob = new ExpThreeQuickSort();
					ob.sort(array, 0, n-1); 

		System.out.println("Sorted array");
		printArray(array);
	}
}