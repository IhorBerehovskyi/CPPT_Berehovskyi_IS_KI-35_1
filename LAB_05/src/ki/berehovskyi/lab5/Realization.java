package ki.berehovskyi.lab5;

public class Realization {
	public double calculate(double x) throws CalcException{
		double y, convToRad;
		
		convToRad = Math.toRadians(2*x);
		
		try {
			y = Math.tan(convToRad);
			
			
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x*2==90 || x*2== -90)
                throw new ArithmeticException();
		}
		catch(ArithmeticException ex){
			if (convToRad == Math.PI/2.0 || convToRad == -Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
		}

		System.out.println(convToRad);
		System.out.println( Math.tan(convToRad));
		return y;
	}
}
