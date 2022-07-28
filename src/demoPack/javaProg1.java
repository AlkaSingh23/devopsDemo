package demoPack;

public class javaProg1 {

	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		System.out.println("This is the simple java program");
		
		int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
		// TODO Auto-generated method stub

	}

