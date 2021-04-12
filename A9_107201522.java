package CE1002_A9_S107201522;
import java.util.Scanner;

public class A9_107201522 {
	public static void main(String[] args) {
    Scanner imput = new Scanner(System.in); //取得輸入
    String a = imput.nextLine();//取出字串
    String [] buff = a.split(" ");//將字串分隔開各自取為字元
    int buffer =0;
    for (int i=0;i<buff.length;i++) {
         for(int k=i+1;k<buff.length;k++) {
        	 
        	 int transi = Integer.parseInt(buff[i]);//字元轉整數
        	 int transk = Integer.parseInt(buff[k]);//字元轉整數
        	 int height = Math.min(transi,transk);//水管高度為兩邊杯壁取最小值
        	 
        	 int area   = Math.abs(i-k)*height;//面積為底(變數相減)乘以高
        	 
        	 
        	 if (area > buffer) //若找出比原先buffer值大者，將其調換並取代
        	 {buffer = area ;}
        	
        	
        	 }	 
         } System.out.println(buffer);//列印出最終數值
   	   
     } 
}