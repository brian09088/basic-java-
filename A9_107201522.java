package CE1002_A9_S107201522;
import java.util.Scanner;

public class A9_107201522 {
	public static void main(String[] args) {
    Scanner imput = new Scanner(System.in); //���o��J
    String a = imput.nextLine();//���X�r��
    String [] buff = a.split(" ");//�N�r����j�}�U�ۨ����r��
    int buffer =0;
    for (int i=0;i<buff.length;i++) {
         for(int k=i+1;k<buff.length;k++) {
        	 
        	 int transi = Integer.parseInt(buff[i]);//�r������
        	 int transk = Integer.parseInt(buff[k]);//�r������
        	 int height = Math.min(transi,transk);//���ް��׬�����M�����̤p��
        	 
        	 int area   = Math.abs(i-k)*height;//���n����(�ܼƬ۴�)���H��
        	 
        	 
        	 if (area > buffer) //�Y��X����buffer�Ȥj�̡A�N��մ��è��N
        	 {buffer = area ;}
        	
        	
        	 }	 
         } System.out.println(buffer);//�C�L�X�̲׼ƭ�
   	   
     } 
}