package abc;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class DecendingWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int integer=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        ArrayList<Integer> brr[]=new ArrayList[integer];
        for(int i=0;i<integer;i++)
        {
            brr[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<size;i++)
        {
            int wt=arr[i]%integer;
            brr[wt].add(arr[i]);
        }
        for(int i=integer-1;i>=0;i--)
        {
            Collections.sort(brr[i]);
            for(int j=0;j<brr[i].size();j++)
            {
                System.out.print(brr[i].get(j)+" ");
            }
        }
        scan.close();
    }
}
