
public class Prime {
	String PrimeValidation(int n) {
		 int remainder;
		 boolean isPrime=true;
		 for(int i=2;i<=n/2;i++)
		 {
		 
		   remainder=n%i;
		           
		    if(remainder==0)
		    {
		       isPrime=false;
		       break;
		    }
		 }
		 if(isPrime==true)
		 return(n+"is a prime number");
		 else
		 return(n+"is not a prime number");
		}

}
