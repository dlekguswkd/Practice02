package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		/*
		 알파벳을 입력받아 자음 모음을 구분하세요.
		⚫ if~else문을 사용합니다.
		⚫ 영문 소문자 이외의 입력값은 고려하지 않습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: "); 
		char al =sc.next().charAt(0);	// al은 알파벳
		
		/*
		 if (al='a' || al='e' || al='i' || al='o' || al='u') {
		 
			System.out.println("모음입니다.");
		}else {
			System.out.println("자음입니다.");
		}
		
		sc.close();
		*/
	}

}
