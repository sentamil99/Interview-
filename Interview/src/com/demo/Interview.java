package com.demo;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interview in = new Interview();
		//in.primeorNo();
		//in.reverseNumber();
		//in.factorial(5);
		//in.multiple3and5();
		//in. multiple3or5();
		in.divide100();
	}
	private void divide100() {
		// TODO Auto-generated method stub
		int number=100;
		int div=2;
		while(number>div) { 
			if(number%div==0) {
				System.out.print(div+" ");
			}
			div=div+1;
		}
		System.out.println();
	}
	private static void multiple3or5() {
		// TODO Auto-generated method stub
		int strat=3;
		while(strat<=30) {
			if(strat%3==0 || strat%5==0) {
				System.out.print(strat+" ");
			}strat=strat+1;
		}
		System.out.println();
	}
	private void multiple3and5() {
		// TODO Auto-generated method stub
		int strat=3;
		while(strat<=30) {
			if(strat%3==0 && strat%5==0) {
				System.out.print(strat+" ");
			}
			strat=strat+1;
		}
		System.out.println();
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
