package com.erveryDayUse.domain;

/**
 * Consume entity. @author MyEclipse Persistence Tools
 */

public class Consume implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String consumeTime;
	private String consumeType;
	private Double singltonPayment;
	
	private Double consumeEvryDay;
	private Double consumeEvryMonth;
	private Double consumeEvryYear;
	private Double consumeTotal;
	private Double consumePlan;
	private Double consumeCapital;
	private ConsumePlan consumePlanEveryMonth;
	private double beyongMoney; //����
	private double residueMoney;//����
	private double consumeQueryByDefinite;
	private String startTime;
	private String endTime;
	
	//private Double totalPaymentEveryMonth;
	//private Double totalPayment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getConsumeTime() {
		return consumeTime;
	}
	public void setConsumeTime(String consumeTime) {
		this.consumeTime = consumeTime;
	}
	public String getConsumeType() {
		return consumeType;
	}
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}
	public Double getSingltonPayment() {
		return singltonPayment;
	}
	public void setSingltonPayment(Double singltonPayment) {
		this.singltonPayment = singltonPayment;
	}
	public Double getConsumeEvryDay() {
		return consumeEvryDay;
	}
	public void setConsumeEvryDay(Double consumeEvryDay) {
		this.consumeEvryDay = consumeEvryDay;
	}
	public Double getConsumeEvryMonth() {
		return consumeEvryMonth;
	}
	public void setConsumeEvryMonth(Double consumeEvryMonth) {
		this.consumeEvryMonth = consumeEvryMonth;
	}
	public Double getConsumeEvryYear() {
		return consumeEvryYear;
	}
	public void setConsumeEvryYear(Double consumeEvryYear) {
		this.consumeEvryYear = consumeEvryYear;
	}
	public Double getConsumeTotal() {
		return consumeTotal;
	}
	public void setConsumeTotal(Double consumeTotal) {
		this.consumeTotal = consumeTotal;
	}
	public Double getConsumePlan() {
		return consumePlan;
	}
	public void setConsumePlan(Double consumePlan) {
		this.consumePlan = consumePlan;
	}
	public Double getConsumeCapital() {
		return consumeCapital;
	}
	public void setConsumeCapital(Double consumeCapital) {
		this.consumeCapital = consumeCapital;
	}
	public ConsumePlan getConsumePlanEveryMonth() {
		return consumePlanEveryMonth;
	}
	public void setConsumePlanEveryMonth(ConsumePlan consumePlanEveryMonth) {
		this.consumePlanEveryMonth = consumePlanEveryMonth;
	}
	public double getBeyongMoney() {
		return beyongMoney;
	}
	public void setBeyongMoney(double beyongMoney) {
		this.beyongMoney = beyongMoney;
	}
	public double getResidueMoney() {
		return residueMoney;
	}
	public void setResidueMoney(double residueMoney) {
		this.residueMoney = residueMoney;
	}
	public double getConsumeQueryByDefinite() {
		return consumeQueryByDefinite;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public void setConsumeQueryByDefinite(double consumeQueryByDefinite) {
		this.consumeQueryByDefinite = consumeQueryByDefinite;
	}
	
}