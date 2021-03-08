//Q7.Write a program for Gready Job Sequencing Problem. Repeat the experiment for different values.
import java.util.*; 
  
class ExpSevenJobSequencingProblem  
{ 
	char id; 
    int deadline, profit; 
    public ExpSevenJobSequencingProblem() {} 
    public ExpSevenJobSequencingProblem(char id, int deadline, int profit) 
    { 
        this.id = id; 
        this.deadline = deadline; 
        this.profit = profit; 
    } 
    void printJobScheduling(ArrayList<ExpSevenJobSequencingProblem> arr, int t) 
    { 
		int n = arr.size(); 
        Collections.sort(arr,(a, b) -> b.profit - a.profit); 
		boolean result[] = new boolean[t]; 
		char job[] = new char[t]; 
		for (int i = 0; i < n; i++)  
        { 
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1);j >= 0; j--) 
			{ 
				if (result[j] == false)  
                { 
                    result[j] = true; 
                    job[j] = arr.get(i).id; 
                    break; 
                } 
            } 
        } 
		for (char jb : job)  
        { 
            System.out.print(jb + " "); 
        } 
        System.out.println(); 
    } 
	public static void main(String args[]) 
    { 
        ArrayList<ExpSevenJobSequencingProblem> arr = new ArrayList<ExpSevenJobSequencingProblem>(); 
  
        arr.add(new ExpSevenJobSequencingProblem('a', 2, 100)); 
        arr.add(new ExpSevenJobSequencingProblem('b', 1, 19)); 
        arr.add(new ExpSevenJobSequencingProblem('c', 2, 27)); 
        arr.add(new ExpSevenJobSequencingProblem('d', 1, 25)); 
        arr.add(new ExpSevenJobSequencingProblem('e', 3, 15)); 
        System.out.println("Following is maximum " + "profit sequence of jobs"); 
		ExpSevenJobSequencingProblem job = new ExpSevenJobSequencingProblem(); 
		job.printJobScheduling(arr, 3); 
    } 
} 