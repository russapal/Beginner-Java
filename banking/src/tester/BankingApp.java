package tester;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_exceptions.BankingException;

import static com.banking.AcType.*;
import static com.banking.BankAccount.sdf;
import static utils.BankValidations.validateBalance;
import static com.banking.AcType.*;

public class BankingApp 
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable D.S , to ensure const time performace for CRUD : HashMap
			HashMap<Integer, BankAccount> bank = new HashMap<>();// size=0, init capa=16 , load factor=0.75
			// populating map with sample data
			System.out.println(bank.put(101,
					new BankAccount(101, "Rama", SAVING, sdf.parse("20-3-2021"), validateBalance(10000))));

			System.out.println(
					bank.put(50, new BankAccount(50, "Salil", SAVING, sdf.parse("2-3-2021"), validateBalance(9000))));

			System.out.println(
					bank.put(10, new BankAccount(10, "Raj", CURRENT, sdf.parse("20-12-2021"), validateBalance(6000))));

			System.out.println(
					bank.put(65, new BankAccount(65, "Riya", FD, sdf.parse("20-6-2021"), validateBalance(500000))));

			System.out.println(
					bank.put(35, new BankAccount(35, "Kiran", SAVING, sdf.parse("15-5-2020"), validateBalance(7000))));

			System.out.println("size of the map " + bank.size());// 4
			System.out.println(bank);
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Open A/C 2. Get A/C Summary 3.Funds Transfer "
						+ "4. Close A/c  5.Display all Accounts 10.Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1: // open new bank a/c
						System.out.println("Enter a/c no");
						int acNo = sc.nextInt();
						if (bank.containsKey(acNo))// int --> Integer --> Object
							throw new BankingException("Dup A/C No!!!!!!!!!!!!!!!");
						// => new a/c no
						System.out.println(
								"Enter bank a/c details : customerName,  acctType,  creationDate(day-mon-yr),  balance");
						BankAccount acct = new BankAccount(acNo, sc.next(), valueOf(sc.next().toUpperCase()),
								sdf.parse(sc.next()), validateBalance(sc.nextDouble()));
						bank.put(acNo, acct);
						System.out.println("A/C created....");

						break;
					case 2:
						System.out.println("Enter your a/c no");
						acct = bank.get(sc.nextInt());
						if (acct == null)
							throw new BankingException("Invalid A/C No!!!!!!!!!!!!!!!");
						System.out.println(acct);
						break;
						
					case 3 : //funds transfer
						System.out.println("Enter src a/c no , dest a/c no , amount ");
						BankAccount src=bank.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid Src A/C No!!!!!!!!!!!!!!!");
					//src a/c found
						BankAccount dest=bank.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid Dest A/C No!!!!!!!!!!!!!!!");
				//=> dest a/c is also found
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("Funds transferred......");
						break;
					case 4 : //close a/c : delete a/c details
						System.out.println("Enter a/c no , to close a/c");
						//remove
						acct=bank.remove(sc.nextInt());
						if(acct == null)
							throw new BankingException("Invalid  A/C No: Can't close A/C!!!!!!");
						System.out.println("Closed A/C : "+acct);
						break;
					case 5: 
						System.out.println("All Bank Accounts");
						for(BankAccount a : bank.values())
							System.out.println(a);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off the pendig tokens from scanner
				sc.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
