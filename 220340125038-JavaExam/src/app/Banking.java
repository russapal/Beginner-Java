package app;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Banking implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private int serialno;
	private TransactionType narration;
	private LocalDate TransactionDate;
	private double Withdrawl_amount;
	private double Deposit_amount;

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}


	public Banking(int serialno, LocalDate TransactionDate,TransactionType narration, double Withdrawl_amount , double Deposit_amount) {
		super();
		this.serialno = serialno;
		this.narration= narration;
		this.TransactionDate = TransactionDate;
		this.Withdrawl_amount = Withdrawl_amount;
		this.Deposit_amount= Deposit_amount;
	}

	
	@Override
	public String toString() {
		return "Content of the File \n [id=" + serialno +  ", Transaction Date =" + TransactionDate + ", Narration="
				+ narration + ", Withdrawl Amount=" + Withdrawl_amount + ", Deposit Amount=" + Deposit_amount + "]";
	}

	public TransactionType getNarration() {
		return narration;
	}

	public LocalDate getTransactionDate() {
		return TransactionDate;
	}

	public double getWithdrawlAmount() {
		return Withdrawl_amount;
	}
	
	public double getDepositAmount() {
		return Deposit_amount;
	}

	public void setWithdrawal(double Withdrawl_amount) {
		this.Withdrawl_amount = Withdrawl_amount;
	}
	
	public void setDeposit(double Deposit_amount) {
		this.Deposit_amount = Deposit_amount;
	}


	public int getId() {
		return serialno;
	}
	
	

}
