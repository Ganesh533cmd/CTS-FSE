package Exceptiondemo;

public class Password {
	private String password;
	public Password(String password) {
		super();
		this.password=password;
	}
	public String getpassword()
	return password;
	
public void setpassword(String password) {
	this.password=password;
	
}
public static void main(String[]args)throws passwordException{
	Password p=new Password(args[0]);
			char[] x=new char[15];
			for(int i=0;i<args[0].length();i++) {
			c[i]=args[0].charAt(i);
			System.out.println(c[i]);
			}
			for(int k=0;k<c.length;k++)
			{
				if(c[k]=char)(a+l)||(c[k]=(char)('a+i')||(c[k]<=9)&&c[k]>=0){
					System.out.println(c[l]);
					throw new passwordException("incorrect password");
				}
			}
			
			System.out.println(args[0]);

}
{
	 
	
}
}
