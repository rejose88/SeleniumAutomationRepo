package constant;

public class Constant {

	public static final String VALIDCREDENTIALERROR = "User is unable to login with valid credentials";
	public static final String INVALIDUSERNAMEERROR = "User was able to login with invalid username";
	public static final String INVALIDPASSWORDERROR = "User was able to login with invalid password";
	public static final String INVALIDCREDENTIALERROR = "User was able to login with invalid username and invalid password";

	public static final String LOGOUTERROR = "User was not able to logout successfully";

	public static final String NEWSCREATIONERROR = "News creaton was not successful";
	public static final String NEWSSEARCHERROR = "News search was not successful";
	public static final String NEWSRESETERROR = "News reset was not successful";

	public static final String USERCREATIONERROR = "User creaton was not successful";
	public static final String USERSEARCHERROR = "User search was not successful";
	public static final String USERRESETERROR = "User reset was not successful";

	public static final String TESTDATAFILEPATH = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\TestData.xlsx";
	public static final String CONFIGFILE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\config.properties";
}
