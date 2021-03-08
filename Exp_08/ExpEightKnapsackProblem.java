//Q8.Implement 0/1 Knapsack problem using Dynamic Programming. 
class ExpEightKnapsackProblem 
{  
	static int max(int a, int b)  
	{ 
		return (a > b) ? a : b; 
	} 
		static int knapSackProblem(int W, int weight[], int value[], int n) 
		{ 
			int i, j; 
			int K[][] = new int[n + 1][W + 1]; 
			for (i = 0; i<= n; i++) 
			{ 
				for (j = 0; j<= W; j++) 
				{ 
					if (i == 0 || j == 0) 
						K[i][j] = 0; 
					else if (weight[i - 1]<= j) 
						K[i][j] = max(value[i - 1] + K[i - 1][j - weight[i - 1]], K[i - 1][j]); 
					else
						K[i][j] = K[i - 1][j]; 
				} 
			}  
				System.out.print("Answer is-:");
				return K[n][W]; 
		} 
			public static void main(String args[]) 
			{ 
				int x,z;
				int value[] = new int[] { 80, 180, 140 }; 
				int weight[] = new int[] { 10, 20, 30 }; 
				int W = 60;//Knapsack Capacity 
				
				for (x = 0; x < value.length; x++) 
				{ 
					System.out.println("Given Value's are-:"+value[x]);
				}
					System.out.println("");
				for (z = 0; z < weight.length; z++) 
				{ 
					System.out.println("Given Weight's are-:"+weight[z]);
				}
				System.out.println("Knapsack Capacity is-:"+W);
				System.out.println("");
				int n = value.length; 
				System.out.println(knapSackProblem(W, weight, value, n)); 
			} 
} 