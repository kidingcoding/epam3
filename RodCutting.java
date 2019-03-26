package abc;

import java.util.Scanner;

class Calculate
{
	public int cutting(int Rod_len)
	{
		if(Rod_len == 0 || Rod_len == 1)
			
			return 0;
		
		return 1 + cutting(Rod_len>>=1);
	}
}
public class RodCutting {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int testcase, Rod_len;
		
		testcase = s.nextInt();
		
		while (testcase != 0)
		{
			
			Rod_len = s.nextInt();
			
			Rod_len++;
			
			Calculate t = new Calculate();
			
			int steps = t.cutting(Rod_len);
			
			System.out.println(steps-1);
			
			testcase--;
		}
		
		s.close();
	}

}
