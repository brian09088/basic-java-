/*
 * Assignment 3
 * Course: CE1002
 * Name: Ĭ�f��
 * Student ID:107201522 
 */
package CE1002.a3.s107201522; 
import java.util.Scanner;  //�ޤJ�ϥΪ̿�J�M��
public class A3_107201522 { 
	public static void main(String[] args) {
		   Scanner type_in = new Scanner(System.in); //�سy�@�ӨϥΪ̿�J 
		   do {
		   String a = type_in.nextLine();//�ϥΪ̿�J�ϥΦr��榡�x�s
		   if(a.equals("STOP")) {//�p�G��JSTOP
			   break;//�h�ߧY�����j��
		   }
		   String[] buff = a.split(" "); //�Na�������j����ର�r��buff
		   
		       {for (int x=0; x < buff.length; x++)  //�}�l�~���j��
		             for (int y=x ; y < buff.length; y++)//�}�l�����j��
		             { 
			         int bb = Integer.parseInt(buff[x]);  //�ର���
			         int k1  = Integer.parseInt(buff[y]); //�ର���
			         if (bb > k1)
			         {}
			         else 
			         {String p =  buff[x];//�s�W�@�Ӧr��p�Ψӽմ���m
			         buff[x]=buff[y];
			         buff[y]= p;}
		             }  
		       for (int i=1 ; i<buff.length; i++) //�ϥΰj��ӧ�X��2�j���Ʀr
		           {
		            int buffer = Integer.parseInt(buff[0]);//�ର���
		            int buffer1  = Integer.parseInt(buff[i]);//�ର���
		            if  (buffer == buffer1)//�Y�̤j�Ʀ�2��
		            {continue;}  //���������ʧ@�A�����i�J�U�@�Ӱj��
		            else 
		            {System.out.println(buff[i]);}//�Y����L���ΡA�h�L�X��2�j���Ʀr
		            break;}
		       	   
		       }
	}while(true);
		
		   }
  }


int n;
Scanner input = new Scanner(System.in);
while (true){
  n = input.nextInt();
  String a;
  String[][] inputArray=new String[n][n];
  String[][] outputArray=new String[n][n];

  for(int i=0;i<n+1;i++)
  {inputArray[i]=input.nextLine().split(" ");}    

  for(int j=0;j<n+1;j++) {
	  for(int k=0;k<n+1;k++)   
	  {if (inputArray[n][n].equals("*"))
	      {outputArray[n][n]="*";}
	  else{
		  int bomb=0;
		  if (j>=0 && k>=1-n) {if(inputArray[j-1][k-1].equals("*"))
		  {bomb++;}}
		  if (j>=0) {if(inputArray[j-1][k].equals("*"))
          {bomb++;}}
		  if (j>=0 && k<=0) {if(inputArray[j-1][k+1].equals("*"))
          {bomb++;}}
		  if(k<=0) {if(inputArray[j][k+1].equals("*"))
          {bomb++;}}
		  if (j<=n-1 && k<=0){if(inputArray[j+1][k+1].equals("*"))
          {bomb++;}}
		  if (j<=n-1){if(inputArray[j+1][k].equals("*"))
          {bomb++;}}
		  if(j<=n-1 && k>=1-n) {if(inputArray[j+1][k-1].equals("*"))
          {bomb++;}}
		  if(k>=1-n) {if(inputArray[j][k-1].equals("*"))
          {bomb++;}}
		  if (bomb==0)
    	  {outputArray[j][k]=("0");}
		  else
          {outputArray[j][k]=String.valueOf(bomb);}
            } 
          }
       }
  for(int j=0;j<n+1;j++){
	  for(int k=0;k<n+1;k++){			   
		  System.out.print(outputArray[j][k]);}
	  System.out.println(); }		   
}
}
}




    	
 


