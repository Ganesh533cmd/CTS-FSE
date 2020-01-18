import java.io.File;

public class DirectoryInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("create new directory");
		String fileName ="temp";
		File fn=new File(fileName);
		fn.mkdir();
	}

}
