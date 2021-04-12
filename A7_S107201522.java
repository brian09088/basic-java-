package CE1002_A7_S107201522;

import java.util.Scanner;  //引入輸入套件
public class A7_S107201522 {

public static void main(String[] args) {
       Scanner input = new Scanner(System.in); //輸入套件input
	   int n = input.nextInt();  //取得使用者輸入
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();
       int k=0;
  
       while (n>=0) {    
   	      if (c>0)       
    	     {c=c-1;     //當有10塊錢，則先投入，找一個五塊，兩個一塊
    	      b=b+1;
    	      a=a+2;  
    	      n=n-1;     //目標杯數-1
    	      k=k+1;}    //投幣次數+1
   	      else if (c==0 && b!=0)  
   	      	 {b=b-1;     //當沒有10塊錢，則先投入5元，五元個數-1，找兩個一塊
   	      	  a=a+2;
   	      	  n=n-1;     //目標杯數-1
   	      	  k=k+1;}    //投幣次數+1
   	      else if (c==0 && b==0 && a>=3 && n!=0)
   	      	 {a=a-3;     //當沒有5塊錢，則投入1元，1元個數-3
   	      	  n=n-1;     //目標杯數-1
   	      	  k=k+3;}    //投幣次數+3
   	      else if(n==0)
   	    	  break;   	  
       } 
       System.out.println(k);
   }
}
