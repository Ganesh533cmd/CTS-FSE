package one;

public enum Day {
	SUNDAY("today is holiday",1),
	MONDAY("today is monday",2),
	TUESDAY("today is holiday",3),
	WEDNSDAY("today is wednsday",4),
	THURSDAY("today is holiday",5),
	FRIDAY("today is friday",6),
	SATURDAY("today is holiday",7);
	
	private final String day;
	private final int number;
	
	private day(String s,int g)
	{
		day=s;
		number=g;
	}
	public String getday() {
	return day;
	}
	public int getnumber() {
	return number;
	}


