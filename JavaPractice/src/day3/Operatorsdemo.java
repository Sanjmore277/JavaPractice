package day3;

//import org.openqa.selenium.devtools.v130.dom.model.LogicalAxes;

public class Operatorsdemo {

	public static void main(String[] args) {
		
        // Arithmatic +  -  * /  %
		
	    int a=50, b=25;
	    System.out.println("sum of a and b is:"+(a+b));
	    System.out.println("Diff of and b is:"+(a-b));
	    System.out.println("Multiple of a and b is:"+(a*b));
	    System.out.println("Div of and b is:"+(a/b));
	    System.out.println("percent of a and b is:"+(a%b));
	    
	    // Relational / comparison operators   > < = ! ==
	   // int a=50, b=25;  
	    
	    System.out.println(a>b);
	    System.out.println(a>=b);
	    System.out.println(a<b);
	    System.out.println(a<=b);
	    System.out.println(a==b);
	    System.out.println(a!=b);
	    
	   // Logical operators && ! ||
	   
	   
	    boolean x=true;
	    boolean y=false;
	    
	    System.out.println(x && y);      //false
	    System.out.println(x || y);      //true
	    System.out.println(!x);          //false
	    System.out.println(!y);          //true
	    
	    boolean b1=10>20;
	    System.out.println(b1);          //false
	    
	    boolean b2=20>10;
	    System.out.println(b2);          //true 
	    
	    System.out.println(b1 && b2);    //false
	    System.out.println(b1 || b2);
	    
	    
	
	}

}
