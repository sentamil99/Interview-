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
		//in.divide100();
		//in.countiof100();
		//in.addof_n_num();
		//in.polinrome("amma");
		 in.vowels("senthamil");
		
	}
	private void vowels(String tr) {
		// TODO Auto-generated method stub
		for(int i=0;i<tr.length();i++) {
			if(tr.charAt(i)=='a'||tr.charAt(i)=='e'||tr.charAt(i)=='i'||tr.charAt(i)=='o'||tr.charAt(i)=='u') {
				System.out.println(tr.charAt(i));
			}

		}
		
	}
	private void polinrome(String str) {
		// TODO Auto-generated method stub
		String name="";
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
			name=name+str.charAt(i);
		}
		if(str.equals(name)){
			System.out.println("polinrome");
		}
		else {
			System.out.println("not polinrome");
		}
	}
	private void addof_n_num() {
		// TODO Auto-generated method stub
		int start=1;
		int end=10;
		int total=0;
		while(start<=end) {
			total=total+start;
			start=start+1;
		}
		System.out.println("addof_n_number:"+total);
	}
	private void countiof100() {
		// TODO Auto-generated method stub
		int num=100;
		int div=2;
		int count=0;
		while(num>div) {
			if(num%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		System.out.println("count of 100:"+count);
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
		int num = 12345;//12345%10=1234.5=5
		while(0<num) {//12345/10=1234.5=1234
			int rem=num%10;
			System.out.print(rem);		
			num=num/10;
		}
		
		System.out.println();
	}

	private void primeorNo() {
		// TODO Auto-generated method stub
		int number=17;
		int div=2;
		int count=0;
		while(div<number) {
			if(number%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		if (count==0) {
			System.out.println("prime number = 17");
		}
		else {
			System.out.println("not prime number = 17");
		}
	
		}

}
