import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KiemTraThuVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Date date = new Date(System.currentTimeMillis());
//		Calendar ca = Calendar.getInstance();
//		
//		System.out.println(ca.get(ca.DATE) + "/" + (ca.get(ca.MONTH)+1) + "/" + ca.get(ca.YEAR));
//		

//		
//		System.out.println(date.toString());
//		
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		
//		System.out.println(df.format(date));
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		
//		System.out.println(sdf.format(date));
		
		try {
			FileInputStream fis = new FileInputStream("E:\\T1.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while(line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			
			System.out.println(sb.toString());
			
			br.close();
			isr.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
