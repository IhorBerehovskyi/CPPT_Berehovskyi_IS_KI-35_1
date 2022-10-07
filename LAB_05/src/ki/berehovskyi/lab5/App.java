package ki.berehovskyi.lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		   try
	        {
	            out.print("Enter file name: ");
	            Scanner in = new Scanner(System.in);
	            String fName = in.nextLine();
	            PrintWriter fout = new PrintWriter(new File(fName));
	          
				try
				{
					Realization eq = new Realization();
					out.print("Enter X: ");
					fout.print(eq.calculate(in.nextInt()));
				}
				catch (CalcException ex)
				{
																												                
					out.print(ex.getMessage());
				}
				finally
				{
																											      
					fout.flush();
					fout.close();
				}
	         
	        }
	        catch (FileNotFoundException ex)
	        {
	            out.print("Exception reason: Perhaps wrong file path");
	        }

	}

}
