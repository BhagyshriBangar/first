package LOGICALPROGRAM;

public class PALINDROMENUMBER {

	public static void main(String[] args) {
		
		int i, n = 121,N,rem,rev=0;
		
		N=n;
		for(rev=0;N>0;N=N/10) {
			
			rem=N%10;
			rev=rev*10+rem;
			
		}
		if(n==rev) {
		System.out.println("Number is palindrome");	
		}else {
			System.out.println("Number is not palindrome");
		}
		
		
		
		
		

	}

}
