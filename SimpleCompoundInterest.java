package hometask4;
import java.util.Scanner;
public class SimpleCompoundInterest  {
	public void calculate()
	{
		double principalamount = 0.0, simpleinterest = 0.0,compoundinterest = 0.0;
		int numberoftimes = 0,rateofinterest = 0, time = 0;
	    Scanner sc=new Scanner (System. in);
	    System.out.printf("Enter the principal amount:");
	    principalamount = sc.nextDouble();
	    System. out. printf("Enter the time(in years):");
	    time = sc.nextInt();
	    System. out. printf("Enter the Rate of  interest:");
	    rateofinterest=sc.nextInt();
	    System.out.printf("Enter the number of times:");
	    numberoftimes=sc.nextInt();
		simpleinterest=(principalamount * time * rateofinterest)/100;
		compoundinterest=principalamount * Math.pow(1.0 + rateofinterest / numberoftimes,(numberoftimes * time)) - principalamount;
		System.out.printf("Simple Interest=%f\n",simpleinterest);
		System.out. printf("Compound Interest=%f\n",compoundinterest);
		sc.close();
	}
}

