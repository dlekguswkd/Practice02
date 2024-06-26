package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		/*
		 다음과 같이 정의되는 함수의 함수값을 계산해보자

		f(x) = {x^3 − 9x + 2 , x ≤ 0 (x가 0보다 작거나 같으면 이식을 사용)
				7x + 2 , x > 0 (x가 0보다 크면 이식을 사용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: "); 
		double num =sc.nextDouble();		// num은 숫자
		
		if(num<=0) {
			System.out.println("계산결과는 "+((double)(num*num*num)-(double)(9*num)+(double)2)+" 입니다.");
		}else {
			System.out.println("계산결과는 "+((double)(7*num)+(double)2)+" 입니다.");
		}
		
		sc.close();
	}

}
