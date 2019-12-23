package edu.hana.controllers;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calc")
public class MBCalculator {
	int n1;
	int n2;
	int result;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String add() {
		result = n1 + n2;
		return null;
	}

	public String sub() {
		result = n1 - n2;
		return null;
	}
}
