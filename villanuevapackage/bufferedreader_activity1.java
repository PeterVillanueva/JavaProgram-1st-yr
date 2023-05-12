package villanuevapackage;
import java.io.*;


public class bufferedreader_activity1 {

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		 
		 String msg=" ";   
		 
		 
		 try {   System.out.print("Enter first and last name: "); 
		 msg = br.readLine(); 
		 System.out.print("Hello" +"  " + msg  +"!");  
		 }
		 catch (IOException e) {
		 System.out.print("error");

		 }
	     }
}
