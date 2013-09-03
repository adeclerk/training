package com.declerk.stock;


public class Stock implements Exchange {
	private double quote;
	
	public Stock() {
		this(0);
	}
	
	public Stock(double quote) {
		this.quote = quote;
	}
	
	@Override
	public double getQuote() {
		return quote;
	}

	@Override
	public void viewQuote() {
		System.out.println("Value: " + quote);
	}

	@Override
	public void setQuote(double quote) {
		this.quote = quote;

	}

}
