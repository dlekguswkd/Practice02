package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
		⚫ 세금계산법
		⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
		⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
		⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: "); 
		double num =sc.nextDouble();		// num은 수익
		
		if(num>=0 && num <=1000) {
			System.out.println("소득세는 " + (double)(num*0.09)+ " 입니다.");
		}else if(num>1000 && num <=4000) {
			System.out.println("소득세는 " + ((double)(1000*0.09)+(double)0.18*(num-1000))+ " 입니다.");
		}else if(num>4000 && num <8000) {
			System.out.println("소득세는 " + ((double)(1000*0.09)+(double)(3000*0.18) +(double)0.27*(num-4000))+ " 입니다.");
		}else if(num>=8000) {
			System.out.println("소득세는 " + ((double)(1000*0.09)+(double)(3000*0.18)+(double)(4000*0.27) +(double)0.36*(num-8000))+ " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();

	}

}
