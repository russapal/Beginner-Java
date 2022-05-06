package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.Banking;

import static app.TransactionType.*;
import static java.time.LocalDate.*;

public interface CollectionUtils 
{
	 static List<Banking> populateList() {
			ArrayList<Banking> transactions = new ArrayList<>();
			transactions.add(new Banking(01, parse("2022-03-01"),SalaryCredit, 0.0,5000.0));
			transactions.add(new Banking(02, parse("2022-03-01"),MobileRecharge, 300.0,0.0));
			transactions.add(new Banking(03, parse("2022-03-02"),DTHRecharge, 1000.0,0.0));
			transactions.add(new Banking(04, parse("2022-03-02"),RentTransfer, 11000,0.0));
			transactions.add(new Banking(05, parse("2022-03-02"),CashbackPaytm, 0.0,1000.0));
			transactions.add(new Banking(06, parse("2022-03-05"),Shopping, 5000.0,0.0));
			transactions.add(new Banking(07, parse("2022-03-10"),Shopping, 7000.0,0.0));
			transactions.add(new Banking(06, parse("2022-03-15"),Cashback, 0.0,3000.0));
			transactions.add(new Banking(06, parse("2022-03-25"),MobilePurchase, 10000.0,0.0));
			transactions.add(new Banking(06, parse("2022-03-31"),Dining, 1200.0,0.0));
			return transactions;
		}
		
		static Map<Integer,Banking> populateMapFromList(List<Banking> transactions)
		{
			Map<Integer,Banking> map=new HashMap<>();//up casting
			
			transactions.forEach(p -> map.put(p.getId(), p));
			return map;
				
		}

}
