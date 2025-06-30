package prog;

public class primeCheck {

	public static void main(String[] args) {
		
		//program for checking number is prime or not
		
		int num=17;
		boolean isPrime=true;
		
		if(num<=1) {
			
			isPrime=false;
		}
		else {
			
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println("number is prime number");
		}
		else {
			System.out.println("number is not prime number");
		}

	}

}
