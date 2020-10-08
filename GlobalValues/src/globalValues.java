import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\M LOK NATH REDDY\\eclipse-workspacePUVI\\GlobalValues\\src\\data.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		//System.out.println(p.getProperty("Name"));
		p.setProperty("Name","AnushaPrudvinathMulinti");
		System.out.println(p.getProperty("Name"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\M LOK NATH REDDY\\eclipse-workspacePUVI\\GlobalValues\\src\\data.properties");
		p.store(fos,"changingthename");

	}

}
