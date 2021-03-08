//Q6.Write a program for Gready 0/1 Knapsack Problem. Repeat the experiment for different values.
class ExpSixKnapsackProblem 
{ 
	static int max(int a, int b)  
    {  
      return (a > b) ? a : b;  
    } 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
		if (n == 0 || W == 0) 
            return 0; 
        if (wt[n - 1] > W) 
            return knapSack(W, wt, val, n - 1);  
        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt,val, n - 1),knapSack(W, wt, val, n - 1)); 
    } 
	public static void main(String args[]) 
    { 
		int x,z;
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
		for (x = 0; x < val.length; x++) 
		{ 
			System.out.println("Given Value's are-:"+val[x]);
		}
			System.out.println("");
		for (z = 0; z < wt.length; z++) 
		{ 
			System.out.println("Given Weight's are-:"+wt[z]);
		}
		System.out.println("Knapsack Capacity is-:"+W);
		System.out.println("");
        int n = val.length; 
        System.out.println(knapSack(W, wt, val, n)); 
    } 
} 