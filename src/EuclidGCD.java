
public class EuclidGCD {

	public static void main(String[] args) {
		
		EuclidGCD myEuclidGCD = new EuclidGCD();
		double x = myEuclidGCD.euclidGCD(15,20);
		System.out.println(x);
	}
	
	double euclidGCD(double x, double y)
	{
		double gdc = y%x;
		if(gdc == 0)
		{return x;}
		else {return euclidGCD(gdc,x);}
	}
}
