package com.netanel.coupons.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.netanel.coupons.dao.CompanyDBDAO;
import com.netanel.coupons.dao.DB;
import com.netanel.coupons.jbeans.Company;
import com.netanel.coupons.jbeans.Coupon;
import com.netanel.coupons.jbeans.CouponType;

public class Test {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Company a = new Company("CompA", "1234", "compa@compa.com");
		Company b = new Company("CompB", "1234", "compa@compa.com");
		Company c = new Company("CompC", "1234", "compa@compa.com");
		
		Coupon c1 = new Coupon("Coupon1",new Date(),sdf.parse("29.7.2018"), 10, CouponType.CARS, "Car Coupon", 19.90, "files/cars.jpg");
		Coupon c2 = new Coupon("Coupon2",new Date(),sdf.parse("15.05.2017"), 10, CouponType.ELECTRONICS, "Electronics Coupon", 89.90, "files/electronics.jpg");
		Coupon c3 = new Coupon("Coupon3",new Date(),sdf.parse("32.7.2018"), 10, CouponType.FOOD, "Food Coupon", 12.90, "files/food.jpg");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		CompanyDBDAO db1 = new CompanyDBDAO();
		db1.createCompany(a);
		
	}
}
