/*
 * Assignment 2
 * Course: CE1002
 * Name: 蘇柏瑜
 * Student ID:107201522 
 */
package CE1002.a2.s107201522;

import java.util.Scanner;  

public class A2_107201522 {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in); //取得使用者所輸入之物件    
	
	int n = scanner.nextInt();  //將輸入的第一個物件,宣告整數變數n
	String  a = scanner.next(); //將輸入的第二個物件,宣告字串 a
   
	char k1 = a.charAt(0); //將字串的第1個位數取出，存放成為字元k1
	char k2 = a.charAt(1); //將字串的第2個位數取出，存放成為字元k2
	
	for (int y=0 ; y>=-n+1 ; y=y-1 ) {    //將迴圈由外圈變數y開始，設定起始點並規範遞迴關係
		for (int x=0 ; x<=2*n-1 ; x=x+1) {//將迴圈由內圈變數x繼續，設定起始點並規範遞迴關係
	         if  (x-y==n-1){     //訂定4條判斷式，由此判斷應該輸出的物件  
	  		      System.out.print(k1);
	      		  }
	         else if (x+y==n){
	              System.out.print(k1);
	              }
			 else if (x-y>n-1 && x+y<n && y>1-n){
                  System.out.print(k2);	        		  
	      		  }
			 else if (y==1-n){
				  System.out.print(k1);
			      }
	         else{
	        	  System.out.print(" ");
	        	  }
	    		  }
		System.out.println();   //每一輪內層遞迴結束後，需要換行執行外層迴圈的下一個遞迴
	  }
	}
}


