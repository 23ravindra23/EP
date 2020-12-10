import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Primetest {

	@Test
	public void test() {
	Prime prime=new Prime();
	int n=3;
	assertEquals(n+"is a prime number",prime.PrimeValidation(n));
	}
	@Test
	public void test1() {
	Prime prime=new Prime();
	int n=6;
	assertEquals(n+"is not a prime number",prime.PrimeValidation(n));
	}
	@Test
	public void test3() {
	Prime prime=new Prime();
	int n=2;
	assertEquals(n+"is a prime number",prime.PrimeValidation(n));
	}
	@Test
	public void test4() {
	Prime prime=new Prime();
	int n=87;
	assertEquals(n+"is not a prime number",prime.PrimeValidation(n));
	}
	@Test
	public void test5() {
	Prime prime=new Prime();
	int n=19;
	assertEquals(n+"is a prime number",prime.PrimeValidation(n));
	}
	

}
