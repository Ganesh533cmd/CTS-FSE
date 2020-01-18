import java.awt.Checkbox;

public class UserMainCode {
	private String password;
	private boolean checkp=false;
	
	public String getpassword() {
		return password;
		{
			public void setPassword(string password) {
				this.password=password;
				
			}
			public boolean ischeckp()
			{
				this.checkp=checkp;
			}
			
			public static boolean CheckPassword(String Password) {
				if(password.length()<8)
					System.out.println("Incorrect password");
			}       checkp=false;
		}
		char []c=new char[15];
		for(int i=0;i<password.length();i++) {
			c[i]=password.charAt[i];
			System.out.println(c[i]);
			
		}
		System.out.println("----------");
		
		for(int k=0;k<c.length;k++){
			if(c[k]>=(char)('a')||(c[k]<=(char)('z')){
				boolean p=true;
				break;
			}
			else if(c[k]>=(char)('A'))||(c[k]<=(char)('z')){
				check p=true;
				break;
			}
			else if(c[k]<=9||(c[k]>=0))
			{
				check p=true;
				continue;
			}
		} return false; 
		 if(c[k]=='!'||c[k]=='@'||c[k]=='#'||c[k]=='$'||c[k]=='%'||c[k]=='*') {
			check p=true;
		}
		System.out.println(+passowrd+"");
		
	}
}
