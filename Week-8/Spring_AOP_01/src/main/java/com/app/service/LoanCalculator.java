package com.app.service;

public class LoanCalculator {
	public float calculateInterestRateAmt(float pamt,float rate,float time) {
		return(pamt*rate*time)/100.0f;
	}
}
