package com.demo;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interview in = new Interview();
		in.primeorNo();
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
