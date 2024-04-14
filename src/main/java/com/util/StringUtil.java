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
	
	public static String INSERT_USER = "INSERT INTO USERS"+
										"(user_name, first_name, last_name, dob, gender, email, phone_number,password, address)"
										+ "VALUES(?,?,?,?,?,?,?,?,?)";
	
	public static final String GET_LOGIN_INFO = "SELECT * from user where user_name = ? AND password = ?";
	
	
	
	public static final String SUCCESS_REGISTER_MESSAGE = "Successfully Registered";
	public static final String REGISTER_ERROR_MESSAGE	= "Please correct the form data";
	public static final String SERVER_ERROR_MESSAGE		= "An unexpected server error occurred";
	public static final String SUCCESS_MESSAGE			= "successMessage";
	public static final String ERROR_MESSAGE			= "errorMessage";
}
