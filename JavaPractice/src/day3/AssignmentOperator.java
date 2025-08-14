package day3;

import org.openqa.selenium.WebDriver;

import day1.Code;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForStackManipulation.Writable;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a=10;
		a=a+5;
		System.out.println(a);
		
		int b=20;
		b+=10;
		System.out.println(b);
	//===================================================================	
		int c=50;
		c=c-10;
		System.out.println(c);
		
		int d=40;
		d-=10;
		System.out.println(d);
		
  // ======================================================================
		int m=20;
		m=m*3;
		System.out.println(m);
		
	//	WebDriver canDriver Write this Code anotherCode way 
		
		int n=10;
		n*=5;
		System.out.println(n);
		
		

	}

}
