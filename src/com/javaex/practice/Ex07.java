package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		나이를 입력받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
		0세~7세 취학전아동/무료 입니다.
		8세~13세 초등학생/2000원 입니다.
		14세~16세 중학생/3000원 입니다.
		17세~19세 고등학생/4000원 입니다.
		20세~ 성인/5000원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int age; 
		
		System.out.println("나이를 입력해주세요");		
		System.out.print("나이: ");					
		age = sc.nextInt();	
		
		if (0<=age && 7>=age) {
			System.out.println("취학전아동/무료 입니다.");
		}else if (8<=age && 13>=age) {
			System.out.println("초등학생/2000원 입니다.");
		}else if (14<=age && 16>=age) {
			System.out.println("중학생/3000원 입니다.");
		}else if (17<=age && 19>=age) {
			System.out.println("고등학생/4000원 입니다.");
		}else if(20<=age) {
			System.out.println("성인/5000원 입니다.");		
		}
		sc.close();
	}
}
