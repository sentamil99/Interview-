package com.demo;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interview in = new Interview();
		//in.primeorNo();
		//in.reverseNumber();
		in.factorial(5);
	}
	private int factorial(int fact) {
		int count=1;
		while(0<fact) {
			count=count*fact;
			fact=fact-1;
		}
		System.out.println(count);
		return count;
	}

	private void reverseNumber() {
		// TODO Auto-generated method stub
		int num = 2345;
		while(0<num) {
			int rem=num%10;
			System.out.print(rem);		
			num=num/10;
		}
		
		//System.out.println();
	}

	private void primeorNo() {
		// TODO Auto-generated method stub
		int number= 12 ;
		int div =2;
		int count=0;
		while(number>div){
			if(number%div==0) {
				count=count+1;
			}	
			div=div+1;
		}
		if(count==0) {
			System.out.println(number+" prime number");
		}
		else
			System.out.println(number+" not prime number");
	}

}
