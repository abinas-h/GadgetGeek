package com.util;

public class StringUtil {
	public static String FIRST_NAME = "firstName";
	public static String LAST_NAME = "lastName";
	public static String USER_NAME = "userName";
	public static String EMAIL  = "email";
	public static String GENDER  = "gender";
	public static String DOB = "dob";
	public static String PHONE = "phoneNumber";
	public static String PASSWORD  = "password";
	public static String ADDRESS  = "address";
	
	public static String INSERT_USER = "INSERT INTO TABLE USERS "+
										"(user_name, first_name, last_name, dob, gender, email, phone_number,password, address)"
										+ "VALUES(?,?,?,?,?,?,?,?,?)";
	
	
}
