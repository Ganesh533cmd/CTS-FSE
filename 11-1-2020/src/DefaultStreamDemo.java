import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DefaultStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Your Name- ");
			String str=br.readLine();
			System.out.format("Name of the person %s", str);
			System.out.print("person's Age- %n ");
			int age=Integer.parseInt(br.readLine().toString());
			System.out.printf("Age %d",age );
		} catch (IOException e) {
			
			System.err.println("i/o exception popped"
					+ ""
					+ "");
		}
		catch(NumberFormatException numberformatexception)
		{
			System.err.println("number format exception occured");
		}

	}

}
