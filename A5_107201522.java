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
			if(p==1||p==2) {//判別否輸入還是查詢
				Scanner input1=new Scanner(System.in);
				String name=input1.next();
				if(namel<(""+name).length()) {//找出最長的名字
					namel=name.length();
					}
				int number=input1.nextInt();
				Transaction k=new Transaction(name);
				if(p==1) {//判別是收入還是支出
					k.setIncome(number);
					k.setPay(0);
					total+=number;
					if(incomel<(""+number).length()) {//找出最長的收入
						incomel=(""+number).length();
						}
				}
				else {
					k.setPay(number);
					k.setIncome(0);
					total-=number;
					if(payl<(""+number).length()) {//找出最長的支出
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