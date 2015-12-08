package com.bhn.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Transaction {
@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	private String merchant;
	 
	private double amount;
	
	private String currency;
	
	private String product;
	
	private String accountNumber;
	
	public enum TxnType {ACTIVATION, FUNDTRANSFER};
	
	private TxnType type;
	
	
	@ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="TxnAttributes")
    Map<String, String> attributes = new HashMap<String, String>();

	
	

	public Transaction() {
		super();
	}

	public Transaction(String merchant, double amount, String currency, String product, String accountNumber, TxnType type) {
		super();
		this.merchant = merchant;
		this.amount = amount;
		this.currency = currency;
		this.product = product;
		this.accountNumber = accountNumber;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}
	

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(String name, String value) {
		if (!attributes.containsKey(name)) {
			attributes.put(name, value);
		}
	}
}
