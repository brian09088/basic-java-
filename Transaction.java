package CE1002.A5.S107201522;

public class Transaction {
	private String name;
	private int income;
	private int pay;
	public Transaction(String name) {
		this.name=name;
	}
	public String getName() {//���o�W�r
		return name;
	}
	public int getIncome() {//���o���J���B
		return income;
	}
	public int getPay() {//���o���O���B
		return pay;
	}
	public void setIncome(int income) {//�]�w���J���B
		this.income=income;
	}
	public void setPay(int pay) {//�]�w���O���B
		this.pay=pay;
	}
}