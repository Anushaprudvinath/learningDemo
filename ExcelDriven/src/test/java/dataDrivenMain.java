import java.io.IOException;
import java.util.ArrayList;

public class dataDrivenMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		dataDriven dd=new dataDriven();
		ArrayList print=dd.getExceldata("Practice1");
		//Store everything in ArrayLIst
		System.out.println(print.get(0));
		
	}

}
