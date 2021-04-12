package CE1002.A5.S107201522;

public class Transaction {
	private String name;
	private int income;
	private int pay;
	public Transaction(String name) {
		this.name=name;
	}
	public String getName() {//取得名字
		return name;
	}
	public int getIncome() {//取得收入金額
		return income;
	}
	public int getPay() {//取得消費金額
		return pay;
	}
	public void setIncome(int income) {//設定收入金額
		this.income=income;
	}
	public void setPay(int pay) {//設定消費金額
		this.pay=pay;
	}
}