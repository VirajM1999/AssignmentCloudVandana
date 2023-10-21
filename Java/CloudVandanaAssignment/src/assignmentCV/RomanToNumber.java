package assignmentCV;

import java.util.Scanner;

public class RomanToNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the roman number");
		String roman=sc.next().toUpperCase();
		
		
		int result=romanToNumberconvert(roman);
		
		System.out.println("The number is->"+result);

	}

	public static int romanToNumberconvert(String roman) {
		int length=roman.length();
		roman=roman+" ";
		int result=0;
		for(int i=0;i<length;i++) {
			char ch=roman.charAt(i);
			char nextch=roman.charAt(i+1);
			
			//for larger roman numbers like  eg."MCMXCIV"
			if (ch == 'M') {
				result += 1000;
			} else if (ch == 'C') {
				if (nextch == 'M') {
					result += 900;
					i++;
				} else if (nextch == 'D') {
					result += 400;
					i++;
				} else
					result += 100;
			
			} else if (ch == 'D') {  //for 3 digit roman numbers
				result += 500;
			} else if (ch == 'X') {
				if (nextch == 'C') {
					result += 90;
					i++;
				} else if (nextch == 'L') {
					result += 40;
					i++;
				} else {
					result += 10;
				}
			} else if (ch == 'L') {    //for smaller 2 digit roman numbers
				result += 50;
			} else if (ch == 'I') {
				if (nextch == 'X') {
					result += 9;
					i++;
				} else if (nextch == 'V') {
					result += 4;
					i++;
				} else {
					result++;
				}
			} else {
				result += 5;
			}

		}
		
		return result;
	}

}
