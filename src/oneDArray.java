import java.util.*;

/*
Task
Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
Reads n integers corresponding to a0,a1,a2..., an-1 from stdin and saves each integer ai to a variable, val.
Attempts to print each element of an array of integers named a.


Write the following code:
Create an array, a, capable of holding n integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
For example, the first value must be stored in a0, the second value must be stored in a1, and so on.


Input Format
The first line contains a single integer, n, denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element ai.

Output Format
You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.


Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50
*/


public class oneDArray {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        int iter = 0;
        while(scan.hasNext())
        {
            a[iter] = scan.nextInt();
            iter++;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}

// Better solution
/*
int n = scan.nextInt();
int[] a = new int[n];
for(int i = 0; i < n; i++)
{
    a[i] = scan.nextInt();
}
*/
