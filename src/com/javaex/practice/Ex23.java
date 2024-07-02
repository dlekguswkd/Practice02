package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		/*
		 아래의 조건과 같이 출력되도록 프로그램을 작성하세요
		⚫ 태어난 년도를 입력받습니다.
		⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
		⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
		(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.)
		⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도: "); 
		
		int year=sc.nextInt();		// year은 태어난 년도
		System.out.println("올해:2023");
		System.out.println("태어난해:"+year);
		int age= (2023-year);		//age는 나이
		System.out.println("나이:"+age);
		
		if (age<20) {
			System.out.println("============================");
			System.out.println("20살미만 건강검진대상이 아님");
		}else if (age>=20){
			System.out.println("============================");
			System.out.println("20살이상");
			if (year%2==0) {
				System.out.println("건강검진해 아님");
			}else if (year%2!=0) {
				if(age>=40) {
					System.out.println("건강검진해");	
					System.out.println("암 검사");
				}else {
					System.out.println("건강검진해");
					System.out.println("암 검사X");
				}
			}
		}
		sc.close();
		
		/*
		 int thisYear = 2023;
		int year;
		int age;
		boolean isTest;
		
		//태어난 년도를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		year = sc.nextInt();

		//나이를 계산합니다.
		age = thisYear-year;
		
		//홀수해, 짝수해로 검사대상인지 판단
		isTest = age%2 == 0;// 이면 검사대상
	    /////계산방법
	     	올해짝수해, 태어난해 짝수해일때
	     	2024(올해) - 1994(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	올해짝수해, 태어난해 홀수해일때
	     	2024(올해) - 1993(태어난해) = 31(나이)
	     	31 % 2==>1  나머지1
	     	
	     	올해홀수해, 태어난해 홀수해일때
	     	2021(올해) - 1993(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	올해홀수해, 태어난해 짝수해일때
	     	2021(올해) - 1994(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	
	     	결론: 나머지가0이면 검사받고 True
	     	     나머지가1이면 검사못받고 False
	    /////
		                  
		System.out.println("올해:" + thisYear);
		System.out.println("태어난해:" + year);
		System.out.println("나이:" + age);
		System.out.println("==============================");				
		//조건식을 비교합니다.
		if( age >= 20) { //20살이상, 올해건강검진해, 
			System.out.println("20살이상");
			if(isTest) {
				System.out.println("건강검진해");
				
				if(age >= 40) {
					System.out.println("암 검사");
				}else {
					System.out.println("암 검사X");
	
				}
				
			}else {
				System.out.println("건강검진해 아님");
			}
			

		}else {  //20살미만
			System.out.println("20살미만 건강검진대상이 아님");
		}
		 */
	}

}
