package CE1002.A5.S107201522;

import java.util.Scanner;
import java.util.ArrayList;


public class A5_107201522 {

	public static void main(String[] args) {
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		int total=0;
		int namel = 0;
		int incomel=0;
		int payl=0;
		do {
			Scanner input=new Scanner(System.in);
			int p=input.nextInt();
			if(p==1||p==2) {//�P�O�_��J�٬O�d��
				Scanner input1=new Scanner(System.in);
				String name=input1.next();
				if(namel<(""+name).length()) {//��X�̪����W�r
					namel=name.length();
					}
				int number=input1.nextInt();
				Transaction k=new Transaction(name);
				if(p==1) {//�P�O�O���J�٬O��X
					k.setIncome(number);
					k.setPay(0);
					total+=number;
					if(incomel<(""+number).length()) {//��X�̪������J
						incomel=(""+number).length();
						}
				}
				else {
					k.setPay(number);
					k.setIncome(0);
					total-=number;
					if(payl<(""+number).length()) {//��X�̪�����X
						payl=+(""+number).length();
						}
					}
				list.add(k);
			}
			else if(p==3) {
				for(int i=0;i<list.size();i++) {
					Transaction t=list.get(i);
					
					System.out.printf("%-"+namel+"s"+"  ",t.getName());
					System.out.printf("%-"+incomel+"d"+"  ",t.getIncome());
					System.out.print(t.getPay());
					System.out.println();
				}
				System.out.println("total:"+total);
			}
			else if(p==4) {
				break;
			}
			else {
				System.out.println("Invalid Operation");
			}
			
		}while(true);
	}
}