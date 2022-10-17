package ki.berehovskyi.lab6;

import java.io.*;
import java.util.*;


public class FioApp {

	public static void main(String[] args) throws IOException {
			boolean IsCatched = true; 
		 	CalcWFio obj = new CalcWFio();
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter data: ");
	        double data = s.nextDouble();
	        try
			{
	        	obj.calculate(data);
			}
			catch (CalcException ex)
			{
				IsCatched = false;																							                
				System.out.println(ex.getMessage());
			}
	      
	        if(IsCatched) {
		        System.out.println("Result is: " + obj.getResult());
		        obj.writeResTxt("textRes.txt");
		        obj.writeResBin("BinRes.bin");
	
		        obj.readResBin("BinRes.bin");
		        System.out.println("Result is: " + obj.getResult());
		        obj.readResTxt("textRes.txt");
		        System.out.println("Result is: " + obj.getResult());
	        }

	}
}
