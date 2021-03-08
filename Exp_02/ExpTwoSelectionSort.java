//Q2.Write a program for Selection sort.Repeat the experiment for different values of n, the number of elements.
import java.util.*;
import java.util.InputMismatchException;
public class ExpTwoSelectionSort
{
	void selectionSort()
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
					int len = array.length;
				for(i=0; i<len-1; i++)
				{
					int min = i;
					for(j=i+1; j<len; j++)
					{
						if(array[j]<array[min])
							min = j;
					}
					if(min != i)
					{
						int temp = array[i];
						array[i] = array[min];
						array[min] = temp;
					}
				}
					int n = array.length;
				System.out.print("After Selection Sorting-: ");
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
		ExpTwoSelectionSort s = new ExpTwoSelectionSort();
						s.selectionSort();
	}
} 