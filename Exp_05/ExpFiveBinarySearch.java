//Q5.Write a program for Binary Search (with recursion & without recursion both). Repeat the experiment for different values of n, the number of elements.
import java.util.Scanner;
public class ExpFiveBinarySearch
{
	int binarySearchRecursion(int arr[], int l, int r, int x)
	{
		if (r >= l) 
		{
			int mid = l + (r - l) / 2; 

			 if (arr[mid] == x)
			 return mid;

			 if (arr[mid] > x)
			 return binarySearchRecursion(arr, l, mid - 1, x);

			 return binarySearchRecursion(arr, mid + 1, r, x);
		}
			return -1;
	}

	int binarySearchIterative(int arr[], int x)
	{
		 int l = 0, r = arr.length - 1;
		 while (l <= r) 
		 {
			 int m = l + (r - l) / 2;

			 if (arr[m] == x)
				return m; 
			 if (arr[m] < x)
				l = m + 1;
		
			 else
				r = m - 1;
		}

		return -1;
	}	

	void printArray(int arr[])
	{
		int n = arr.length;

		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + "\t");

		System.out.println();
	} 

	public static void main(String args[])
	{
		System.out.println("\n**Binary Search for sorted array of integers**");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1. Binary Search using Recursion \n2. Binary Search using Iteration \n3. Exit\nPlease enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter Number of Elements you want-: ");
						int s = sc.nextInt();
						int arr1[] = new int[s];
						System.out.println("Enter " + s + " integers");

						for (int i = 0; i < s; i++)
							arr1[i] = sc.nextInt();

						System.out.println("Enter the number to be searched:");
						int x = sc.nextInt();

						ExpFiveBinarySearch ob = new ExpFiveBinarySearch ();
						System.out.print("Entered Array: ");
						ob.printArray(arr1);
						int result = ob.binarySearchRecursion(arr1, 0, s - 1, x);
						if (result == -1)
							throw new RuntimeException("No such element present");
						else
							System.out.println("Element found at index: " + result);

						break;

				case 2 : System.out.println("Enter number of elements to be stored: ");
						int s1 = sc.nextInt();
						int arr2[] = new int[s1];
						System.out.println("Enter " + s1 + " integers");

						for (int i = 0; i < s1; i++)
						arr2[i] = sc.nextInt();

						 System.out.println("Enter the number to be searched:");
						 int x1 = sc.nextInt();

						ExpFiveBinarySearch ob1 = new ExpFiveBinarySearch (); 
						 System.out.print("Entered Array: ");
						 ob1.printArray(arr2);
						 int result1 = ob1.binarySearchIterative(arr2, x1);
						 if (result1 == -1)
						 throw new RuntimeException("No such element present");
						 else
						 System.out.println("Element found at index: " +
						 result1);
						 break;
			
				case 3: sc.close();
						 System.exit(0);
						 default : System.out.println("Wrong Choice");

			}

		}
	}
}