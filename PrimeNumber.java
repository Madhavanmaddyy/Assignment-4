package week2.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int i=2;
		boolean flag=false;
		for(int a=13; i<a;i++) {
			if (a%i==0)
			  flag=true;
			
				
			
		}
	    if(flag==false) {
	    
			System.out.println("13 is a prime number");
	    }	
        else {
			System.out.println("13 is not prime number");
	    
        }
		
			
		
	}

}
