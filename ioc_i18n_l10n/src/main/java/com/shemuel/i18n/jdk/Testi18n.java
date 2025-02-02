package com.shemuel.i18n.jdk;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Testi18n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale l = new Locale("en","UG");
		
		// get number format
		NumberFormat nf = NumberFormat.getInstance(l);
		
		// get date format
		DateFormat df = DateFormat.getDateInstance();
		
		// get messages from properties files
		ResourceBundle rb = ResourceBundle.getBundle("greetings_en_UG");
		
		System.out.println("Message: "+rb.getString("welcome"));
		
		System.out.println("Date: "+df.format(new Date()));
		
		System.out.println("Number: "+nf.format(1234567.23456));

	}

}
