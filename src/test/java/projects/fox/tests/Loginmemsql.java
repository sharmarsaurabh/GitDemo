package projects.fox.tests;

public class Loginmemsql {

	// Connection con =DriverManager.getConnection(url, user, password);

	String url = "jdbc:mysql://svc-2c2023e1-4245-4bf5-b2c9-1b9e4b825957-dml.aws-oregon-1.db.memsql.com:3306/fox_ai_instrumentation";
	String user = "rdusr_serelium";
	String pass = "f9HFA3zqcAkh";
	
	float a[];
	char asr[];
	
	String url2 = "jdbc:mysql://svc-2c2023e1-4245-4bf5-b2c9-1b9e4b825957-dml.aws-oregon-1.db.memsql.com:3306/fox_ai_instrumentation";
	String user2 = "rdusr_serelium";
	String pass3 = "f9HFA3zqcAkh";
	
	public void  returnurl2()
	{
		System.out.println(url2);
	}
	public void  returnurl1()
	{
		System.out.println(url);
	}
	public void  returnuser()
	{
		System.out.println(user);
	}
	public void  returnuser2()
	{
		System.out.println(user2);
	}
}