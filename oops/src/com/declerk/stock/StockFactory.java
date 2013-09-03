package com.declerk.stock;


public final class StockFactory {

	private static Stock cStock = null;
	
	private StockFactory() {}
	
	public static Stock getStock() {
		if(cStock == null)
			cStock = new Stock();
		return cStock;
	}
}
