//Q1.Write a program for Insertion sort. Repeat the experiment for different values of n, the number of elements.
import java.util.*;
import java.util.InputMismatchException;
public class ExpOneInsertionSort
{
	void insertionSort()
	{
		while(true)
		{
			try
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
				for (i = 1;i<array.length;i++)
				{
					int temp = array[i];
					j = i-1;
					while (j>=0 && array[j]>temp)
					{
						array[j+1] = array[j];
						j--;
					}
						array[j+1] = temp;
				}
				int n = array.length;
				System.out.print("After Insertion Sorting-: ");
				for (i=0;i<n;++i) 
				{
					System.out.print(array[i] + " ");
				}
					System.out.println();
					break;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input, Please Enter Int Value only!");
				continue;
			}
		}
	}
	public static void main(String args[])
	{
		ExpOneInsertionSort s = new ExpOneInsertionSort();
		s.insertionSort();
	}	
} 