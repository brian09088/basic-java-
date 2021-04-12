/*
 * Assignment 1
 * Course: CE1002
 * Name: 蘇柏瑜
 * Student ID:107201522 
 */
package CE1002.a1.s107201522;

import java.util.Scanner;
public class A1_107201522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int num1, num2, num3;
	        Scanner scanner = new Scanner(System.in);
	        
	        //輸入三個成績,用整數格式儲存,並印出
	        num1 = scanner.nextInt();
	        num2 = scanner.nextInt();
	        num3 = scanner.nextInt();
	        
	        //計算三個成績的平均,並印出平均
	        System.out.println( (num1 + num2 +num3)/3 );

	        //將平均分數儲存成整數變數:score
	        int score = (num1 + num2 +num3)/3;
	        		
	        //判斷平均分數的範圍，印出平均分數位在哪一個分數級距
	        if (score >= 90.0)
	        	System.out.print("A") ;
	        else if (score >= 80.0)
	        	System.out.print("B") ;
	        else if (score >= 70.0)
	        	System.out.print("C") ;
	        else if (score >= 60.0)
	        	System.out.print("D") ;
	        else
	        	System.out.print("F") ;		
	        scanner.close();
	}

}


	   