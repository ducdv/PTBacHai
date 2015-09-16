package uet.donv;

import java.util.Scanner;
import java.util.Vector;

public class GiaiPhuongTrinh {

	double a, b, c;
	private static Scanner scan;
	
	public double tinhDelta(double a, double b, double c)
	{
		double delta = b*b - 4*a*c;
		return delta;
	}
	
	public Vector<Float> tinhNghiem(double a,double b,double c)
	{
		Vector<Float> nghiem = new Vector<Float>();
		double delta = tinhDelta(a, b, c);
		if(delta > 0)
		{
			nghiem.add((float)((-b + Math.sqrt(delta)) / (2*a)));
			nghiem.add((float) ((-b - Math.sqrt(delta)) / (2* a)));
		}
		else if(delta == 0)
		{
			nghiem.add((float)(-b/(2*a)));
		}
		return nghiem;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Nhap vao so a: ");
		scan = new Scanner(System.in);
		double a = scan.nextDouble();
		System.out.println("Nhap vao so b: ");
		scan = new Scanner(System.in);
		double b = scan.nextDouble();
		System.out.println("Nhap vao so c: ");
		scan = new Scanner(System.in);
		double c = scan.nextDouble();
		System.out.println("Ket qua nghiem cua pt: ");
		GiaiPhuongTrinh gpt = new GiaiPhuongTrinh();
		Vector<Float> nghiem = gpt.tinhNghiem(a, b, c);
		if(nghiem == null)
		{
			System.out.println("PT khong co nghiem thuc !");
			return;
		}
		for(int i = 0; i < nghiem.size(); ++i)
		{
			System.out.println("nghiem: " + nghiem.get(i));
		}
	}
}
