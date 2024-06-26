package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 저체중, 표준, 과체중을 구분하여 출력하 프로그램을 작성하세요.
		표준체중 = (키 − 100) × 0. 9
		 */
		Scanner sc = new Scanner(System.in);
		
		int weight;		// weight는 몸무게
		int height;		//height는 키
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		height = sc.nextInt();
		System.out.print("몸무게: ");					
		weight = sc.nextInt();	
		
		double bmi = (double)(height-100)*0.9 ;		//bmi는 표준체중
		
		if(weight>bmi) {
			System.out.println("과체중 입니다.");
		}else if (weight<bmi) {
			System.out.println("저체중 입니다.");
		}else {
			System.out.println("표준 입니다");
		}
		System.out.println("표준체중: " + bmi);
		sc.close();
	}

}
