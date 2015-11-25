package com.myorg.javacourse;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.google.appengine.api.appidentity.AppIdentityServicePb.GetServiceAccountNameRequest;

public class Stock {
	
	private String symbol;
	private Float ask, bid;
	private Date date;
	SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyyy");
	
		
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Float getAsk() {
		return ask;
	}

	public void setAsk(Float ask) {
		this.ask = ask;
	}

	public Float getBid() {
		return bid;
	}

	public void setBid(Float bid) {
		this.bid = bid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHtmlDescription(){
		return "<b> Stock symbol</b>:" + getSymbol() +
				", <b> ask</b>:" + getAsk() + 
				", <b> bid</b>:" + getBid() +
				", <b> date</b>:" + simpleDF.format(getDate()) +
				"<br>";
	}
}
