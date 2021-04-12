/*
 * Assignment 4
 * Course: CE1002
 * Name: 蘇柏瑜
 * Student ID:107201522 
 */
package CE1002.A4.S107201522;

import java.util.Scanner;
public class A4_107201522 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);//使用者輸入令為sc
	      int n = sc.nextInt(); //宣告整數變數
	      
	      String[][] inputArray = new String[n][n];//宣告輸入陣列
	      String[][] outputArray = new String[n][n];//宣告輸出陣列
	      sc.nextLine().split("/n");
	      
	      for(int i=0;i<n;i++){//使用迴圈將輸入資料進行處理
	         inputArray[i] = sc.nextLine().split("");
	      }

	      for(int j=0;j<n;j++){//使用迴圈將n*n的陣列中每筆資料處理
	         for(int k=0;k<n;k++){
	            if(inputArray[j][k].equals("*")){//輸入*，判斷為地雷，輸出*
	               outputArray[j][k]="*";}
	            else{
	               int mineAround=0;//將原始地雷設定為0顆
	               if(j>0 & k>0){
	                  if(inputArray[j-1][k-1].equals("*")){//判斷左下是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(j>0 ){
	                  if(inputArray[j-1][k].equals("*")){//判斷左邊是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(j>0 & k+1<n){
	                  if(inputArray[j-1][k+1].equals("*")){//判斷左上是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(k+1<n){
	                  if(inputArray[j][k+1].equals("*")){//判斷上方是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(j+1<n & k+1<n){
	                  if(inputArray[j+1][k+1].equals("*")){//判斷右上是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(j+1<n){
	                  if(inputArray[j+1][k].equals("*")){//判斷右邊是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(j+1<n & k>0 ){
	                  if(inputArray[j+1][k-1].equals("*")){//判斷右下是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(k>0 ){
	                  if(inputArray[j][k-1].equals("*")){//判斷下方是否有地雷
	                     mineAround++;//有地雷則將地雷數+1
	                  }
	               }
	               if(mineAround==0){//若地雷數合計為0顆，則輸出0
	                  outputArray[j][k]="0";
	               }else{
	                  outputArray[j][k]=String.valueOf(mineAround);//其餘則將地雷數加總並輸出
	               }
	           }
	       }
	    }

	    for(int i=0;i<n;i++){//用迴圈將輸出陣列印出
	       for(int j=0;j<n;j++){
	           System.out.print(outputArray[i][j]);
	       }
	       System.out.println();
	    }
	   }
	  }
