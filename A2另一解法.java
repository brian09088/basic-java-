package A2的另一種解法;

import java.util.Scanner; 

public class A2另一解法 {

       public static void main(String[] args) {
	   // TODO Auto-generated method stub
    	  int n  ; //宣告變數整數n
    	  Scanner scan1 = new Scanner(System.in); //取得使用者所輸入之物件1
				
		  char a ; //宣告字元 a
	      char b ; //宣告字元 b
   	      Scanner scan2 = new Scanner(System.in); //取得使用者所輸入之物件2
		  Scanner scan3 = new Scanner(System.in); //取得使用者所輸入之物件3

		  String c = new String(); //宣告建立空字串
			
		  String.valueOf(a);  //將 char 變數 a 轉換成字串
	      String.valueOf(b);  //將 char 變數 b 轉換成字串
			
    	  n = scan1.nextInt(); //將使用者輸入的物件存取為整數
			
		  for (int x=0 ; x<=2*n-2 ; x+=2) {
               System.out.print(\n) ;
               System.out.printf("%S%S%S",a,b*x,a)
			   }
		}
}



		