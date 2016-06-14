package com.netanel.coupons.jbeans;

import java.util.Date;

public class Coupon {

	//
	// Attributes
	//
	private static long idCount = 1;
	private long id;
	private String title;
	private Date startDate;
	private Date endDate;
	private int amount;
	private CouponType type;
	private String message;
	private double price;
	private String image;
	
	//
	// Constructor
	//
	
	public Coupon(String title, Date startDate, Date endDate, int amount, CouponType type, String message,
			double price, String image) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.type = type;
		this.message = message;
		this.price = price;
		this.image = image;
	}

	//
	// Functions
	//
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public int getAmount() {
		return amount;
	}

	public CouponType getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}

	public double getPrice() {
		return price;
	}

	public String getImage() {
		return image;
	}

//	public void setId(long id) {
//		this.id = id;
//	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setType(CouponType type) {
		this.type = type;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", type=" + type + ", message=" + message + ", price=" + price + ", image="
				+ image + "]";
	}
	
	
}
