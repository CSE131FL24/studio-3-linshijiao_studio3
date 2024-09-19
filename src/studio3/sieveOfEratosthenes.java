package studio3;

import java.util.Scanner;

public class sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Sieve up to (inclusive):");
		int n = in.nextInt();
		
		int[] sieve_numbers = new int[n+1];
		
		for (int i=0; i < n+1; i++) {
			sieve_numbers[i] = i;
		}
		sieve_numbers[1] = 0;
	
		for (int a=2; a < sieve_numbers.length/2; a++) {
			int b = 2;
			int x = 0;
			while (x <= sieve_numbers.length-1) {
				b *= a;
				sieve_numbers[b] = 0;
				b /= a;
				b++;
				x = b * a;
			}
		}
		
		int count = 0;
		for (int c=0; c < sieve_numbers.length; c++) {
			if (sieve_numbers[c] != 0) {
				count += 1;
			}
		}

		int[] isPrime = new int[count];
		int ind = 0;
		for (int c=0; c < sieve_numbers.length; c++) {
			if (sieve_numbers[c] != 0) {
				isPrime[ind] = sieve_numbers[c];
				ind +=1;
			}
		}
		
		for (int value : isPrime) {
			System.out.println(value);
		}		
	}
}