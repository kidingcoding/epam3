package abc;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.*;

class GlowingBulbs
{
	static ArrayList<Integer> numbers;
	
	static long length;
	
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
		    String g=br.readLine();
	        
		    int n = Integer.parseInt(g);
	        
		    while(n-->0)
	        {
	             String line= br.readLine();
	             
	             String ip=br.readLine();
	             
	             long k = Long.parseLong(ip);
	             
	             numbers=new ArrayList<Integer>();
	             
	             int i;
	             
	             for(i=0;i<40;i++)
	             {
	                 if(line.charAt(i)=='1')
	                 {
	                	 numbers.add(i+1);
	                 }
	             }
	             length=numbers.size();
	             
	             long t=bin2(k);
	             
	             System.out.println(t);
	        }
	}
	static long bin1(long limit)
    {
        int y; long t=0;
        
        for(y=1;y<(int)Math.pow(2,length);y++)
        {
        	long m1=1; int no1=0,ind=0;
            
        	int c0=y;
            
        	while(c0!=0)
            {
                if((c0&1)>0)
                {
                    m1*=(long)numbers.get(ind); no1++;
                }
                
                ind++; c0=c0>>1;
            }
            
        	if(no1%2==0)
            {
                t-=limit/m1;
            }
            
        	else
            t+=limit/m1;
        }
        return t;
    }
	
	static long bin2(long k)
    {
        long l=1; long h=(long)Math.pow(10,15); h*=37; long f=0;
        
        while(l<=h)
        {
            long mid=(l+h)/2;
            
            long c1=bin1( mid);
            
            if(c1<k)
            {
                l=mid+1;
            }
            
            else {f=mid;h=mid-1;}
        }
        return f;
    }

}
