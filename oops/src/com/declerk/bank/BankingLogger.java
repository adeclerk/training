package com.declerk.bank;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class BankingLogger {
	private static BankingLogger logger = null;
	private String fileName;
	private BufferedWriter fileWriter = null;
	
	private BankingLogger() throws IOException {
		this.fileName = BankingLogger.generateFilename();
		this.fileWriter = new BufferedWriter(new FileWriter(fileName,true));
		
	}
	
	public void close() {
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void finalize() {
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String generateFilename() {
		Calendar cal = new GregorianCalendar();
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		String weekdayStr = null;
		switch(weekday) {
		case 1:
			weekdayStr = "Sun";
			break;
		case 2:
			weekdayStr = "Mon";
			break;
		case 3:
			weekdayStr = "Tue";
			break;
		case 4:
			weekdayStr = "Wed";
			break;
		case 5:
			weekdayStr = "Thu";
			break;
		case 6:
			weekdayStr = "Fri";
			break;
		case 7:
			weekdayStr = "Sat";
			break;
		}
		Integer month = cal.get(Calendar.MONTH);
		month++;
		Integer day	= cal.get(Calendar.DAY_OF_MONTH);
		Integer year = cal.get(Calendar.YEAR);
		
		String ret = "C:/Users/Alex/" + weekdayStr + month.toString() + 
		day.toString() + year.toString();
		
		return ret;
	}
	public static BankingLogger getInstance() {
		if(BankingLogger.logger == null) {
			try {
				BankingLogger.logger = new BankingLogger();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return BankingLogger.logger;
	}
	public void log(int acntNo,String txnType,double amount) throws IOException {
		Integer account = acntNo;
		Double amt = amount;
		fileWriter.write(System.currentTimeMillis() + "\t" + account.toString() + "\t" + txnType + "\t" + amt.toString());
		fileWriter.newLine();
		fileWriter.flush();
		
	}
}
