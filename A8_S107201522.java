package CE1002_A8_S107201522;

import java.util.Scanner;
public class A8_S107201522 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //使用者輸入
		int m=input.nextInt();                //給定整數變數
		int n=input.nextInt();                
		int number=input.nextInt();           
		String[][] map=new String[m][n];      //設定字串
		int[][] xy=new int[number][2];        
		int c=0;                              //整數變數從0開始
		int t=0;                              //整數變數從0開始
		int[] as=new int[number];             
		for(int j=0;j<m;j++) {                
			String s=input.next();
			for(int i=0;i<n;i++) {
				map[j][i]=s.charAt(i)+"";     //輸入要判斷的長方形
			}
		}
		for(int j=0;j<number;j++) {           //輸入要判斷的座標
			xy[j][0]=input.nextInt();         
			xy[j][1]=input.nextInt();
		}
		for(int p=0;p<number;p++) {
			int y=xy[p][0];
			int x=xy[p][1];
			c=0;
			t=0;
			do {
				for(int j=-1;j<2;j++) {
					for(int i=-1;i<2;i++) {
						int y1=y+j*t;//平移
						int x1=x+j*t;//平移
						if(-1<x1&&x1<n&&-1<y1&&y1<m) {//是否超過範圍
						}
						else {
							c=1;
							break;
						}
						if(map[y][x].equals(map[y1][x1])) {//判斷是否相同
							
						}
						else {
							c=1;
							break;
						}
					}
					if(c==1) {
						break;
					}
				}
				if(c==1) {
					break;
				}
				else {
					t+=1;
				}
			}while(true);
			as[p]=t;
		}
		for(int i=0;i<number;i++) {
			System.out.println(2*as[i]-1);
		}
	}
}


