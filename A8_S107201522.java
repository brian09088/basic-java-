package CE1002_A8_S107201522;

import java.util.Scanner;
public class A8_S107201522 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //�ϥΪ̿�J
		int m=input.nextInt();                //���w����ܼ�
		int n=input.nextInt();                
		int number=input.nextInt();           
		String[][] map=new String[m][n];      //�]�w�r��
		int[][] xy=new int[number][2];        
		int c=0;                              //����ܼƱq0�}�l
		int t=0;                              //����ܼƱq0�}�l
		int[] as=new int[number];             
		for(int j=0;j<m;j++) {                
			String s=input.next();
			for(int i=0;i<n;i++) {
				map[j][i]=s.charAt(i)+"";     //��J�n�P�_�������
			}
		}
		for(int j=0;j<number;j++) {           //��J�n�P�_���y��
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
						int y1=y+j*t;//����
						int x1=x+j*t;//����
						if(-1<x1&&x1<n&&-1<y1&&y1<m) {//�O�_�W�L�d��
						}
						else {
							c=1;
							break;
						}
						if(map[y][x].equals(map[y1][x1])) {//�P�_�O�_�ۦP
							
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


