package TestNG;
import java.util.Scanner;
public class Addition {
public void calculateadd(float i,float j){
	//return (i+j);
	System.out.println("Resut is ::"+(i+j));
	
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	float i=s.nextFloat();
	System.out.println("Enter The Number");
	float j=s.nextFloat();
	Addition a=new Addition();
	System.out.println("The Sum is---");
	a.calculateadd(12.4f, 15.3f);

}

}
