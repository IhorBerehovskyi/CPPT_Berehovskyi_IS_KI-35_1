package ki.berehovskyi.lab6;


import java.io.*;
import java.util.*;


public class CalcWFio {
	private double result, convToRad;
	
	public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }

    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }

    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    public void calculate(double x) throws CalcException
    {
    	convToRad = Math.toRadians(2*x);
		
		try {
			result = Math.tan(convToRad);
			
			
            if (result==Double.NaN || result==Double.NEGATIVE_INFINITY || result==Double.POSITIVE_INFINITY || x*2==90 || x*2== -90)
                throw new ArithmeticException();
		}
		catch(ArithmeticException ex){
			if (convToRad == Math.PI/2.0 || convToRad == -Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
		}

    }

    public double getResult()
    {
        return result;
    }
   
}
