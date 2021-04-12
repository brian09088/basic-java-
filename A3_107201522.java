/*
 * Assignment 3
 * Course: CE1002
 * Name: 蘇柏瑜
 * Student ID:107201522 
 */
package CE1002.a3.s107201522; 
import java.util.Scanner;  //引入使用者輸入套件
public class A3_107201522 { 
	public static void main(String[] args) {
		   Scanner type_in = new Scanner(System.in); //建造一個使用者輸入 
		   do {
		   String a = type_in.nextLine();//使用者輸入使用字串格式儲存
		   if(a.equals("STOP")) {//如果輸入STOP
			   break;//則立即結束迴圈
		   }
		   String[] buff = a.split(" "); //將a取消分隔後並轉為字串buff
		   
		       {for (int x=0; x < buff.length; x++)  //開始外部迴圈
		             for (int y=x ; y < buff.length; y++)//開始內部迴圈
		             { 
			         int bb = Integer.parseInt(buff[x]);  //轉為整數
			         int k1  = Integer.parseInt(buff[y]); //轉為整數
			         if (bb > k1)
			         {}
			         else 
			         {String p =  buff[x];//新增一個字串p用來調換位置
			         buff[x]=buff[y];
			         buff[y]= p;}
		             }  
		       for (int i=1 ; i<buff.length; i++) //使用迴圈來找出第2大的數字
		           {
		            int buffer = Integer.parseInt(buff[0]);//轉為整數
		            int buffer1  = Integer.parseInt(buff[i]);//轉為整數
		            if  (buffer == buffer1)//若最大數有2個
		            {continue;}  //不執行任何動作，直接進入下一個迴圈
		            else 
		            {System.out.println(buff[i]);}//若有其他情形，則印出第2大的數字
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




    	
 


