package CE1002_A7_S107201522;

import java.util.Scanner;  //�ޤJ��J�M��
public class A7_S107201522 {

public static void main(String[] args) {
       Scanner input = new Scanner(System.in); //��J�M��input
	   int n = input.nextInt();  //���o�ϥΪ̿�J
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();
       int k=0;
  
       while (n>=0) {    
   	      if (c>0)       
    	     {c=c-1;     //��10�����A�h����J�A��@�Ӥ����A��Ӥ@��
    	      b=b+1;
    	      a=a+2;  
    	      n=n-1;     //�ؼЪM��-1
    	      k=k+1;}    //�������+1
   	      else if (c==0 && b!=0)  
   	      	 {b=b-1;     //��S��10�����A�h����J5���A�����Ӽ�-1�A���Ӥ@��
   	      	  a=a+2;
   	      	  n=n-1;     //�ؼЪM��-1
   	      	  k=k+1;}    //�������+1
   	      else if (c==0 && b==0 && a>=3 && n!=0)
   	      	 {a=a-3;     //��S��5�����A�h��J1���A1���Ӽ�-3
   	      	  n=n-1;     //�ؼЪM��-1
   	      	  k=k+3;}    //�������+3
   	      else if(n==0)
   	    	  break;   	  
       } 
       System.out.println(k);
   }
}
