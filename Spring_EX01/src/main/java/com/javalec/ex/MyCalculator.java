package com.javalec.ex;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void add() {
		calculator.add(firstNum, secondNum);
	}
	public void sub() {
		calculator.sub(firstNum, secondNum);
	}
	public void multi() {
		calculator.multi(firstNum, secondNum);
	}
	public void div() {
		calculator.div(firstNum, secondNum);
	}
}
