package com.erveryDayUse.domain;

public class ConsumePlan {

	  private Integer id;
	  private double everyDayPay;
	  private double electricPay;
	  private double costumePay;
	  private double gongingOutPay;
	  private double toiletryPay;
	  private double momAndBabyPay;
	  private double otherPay;
	  private double totalPlanPay;
	  private User user;
	  private String planTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getEveryDayPay() {
		return everyDayPay;
	}
	public void setEveryDayPay(double everyDayPay) {
		this.everyDayPay = everyDayPay;
	}
	public double getElectricPay() {
		return electricPay;
	}
	public void setElectricPay(double electricPay) {
		this.electricPay = electricPay;
	}
	public double getCostumePay() {
		return costumePay;
	}
	public void setCostumePay(double costumePay) {
		this.costumePay = costumePay;
	}
	public double getGongingOutPay() {
		return gongingOutPay;
	}
	public void setGongingOutPay(double gongingOutPay) {
		this.gongingOutPay = gongingOutPay;
	}
	public double getToiletryPay() {
		return toiletryPay;
	}
	public void setToiletryPay(double toiletryPay) {
		this.toiletryPay = toiletryPay;
	}
	public double getMomAndBabyPay() {
		return momAndBabyPay;
	}
	public void setMomAndBabyPay(double momAndBabyPay) {
		this.momAndBabyPay = momAndBabyPay;
	}
	public double getOtherPay() {
		return otherPay;
	}
	public void setOtherPay(double otherPay) {
		this.otherPay = otherPay;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getPlanTime() {
		return planTime;
	}
	public void setPlanTime(String planTime) {
		this.planTime = planTime;
	}
	public double getTotalPlanPay() {
		return totalPlanPay;
	}
	public void setTotalPlanPay(double totalPlanPay) {
		this.totalPlanPay = totalPlanPay;
	}
	  
	

}
