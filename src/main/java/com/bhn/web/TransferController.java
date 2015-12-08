package com.bhn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhn.domain.Transaction;
import com.bhn.domain.TransactionRepository;
import com.bhn.domain.Transaction.TxnType;

/**
 * Web controller class to simulate business process logics.
 * @author sdu0000
 *
 */
@Controller
@RequestMapping("/transfer")
public class TransferController{
	
	@Autowired
	TransactionRepository txnRepository; 
	
	
	@RequestMapping(method = RequestMethod.GET) 
	public @ResponseBody Page<Transaction> transfer(
			@RequestParam(value = "merchant", required = false, defaultValue = "foo") String merchant,
			@RequestParam(value = "product", required = false, defaultValue = "upc") String product,
			@RequestParam(value = "amount", required = false, defaultValue = "100.00") double amount,
			@RequestParam(value = "currency", required = false, defaultValue = "USD") String currency,
			@RequestParam(value = "from", required = false) String fromAccountNumber,
			@RequestParam(value = "to", required = false) String toAccountNumber

	) {
		 
		Transaction t1 = new Transaction(merchant, amount*(-1), currency, product, fromAccountNumber, TxnType.FUNDTRANSFER);
		Transaction t2 = new Transaction(merchant, amount, currency, product, toAccountNumber, TxnType.FUNDTRANSFER);
		txnRepository.save(t1);
		txnRepository.save(t2);
		Pageable page = new PageRequest(0, 10);
		return txnRepository.findAll(page); 
	}
}

