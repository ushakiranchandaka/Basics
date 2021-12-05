import java.util.Scanner;

class Arith
{
	int num1;
	int num2;
	int result;
	
	public void addition() {
		 result = num1 + num2;
		 System.out.println(result);
	}
	public void subtraction() {
		 result = num1 - num2;
		 System.out.println(result);

	}
}
public class BasicOops {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		Arith obj= new Arith();
		obj.num1=a;
		obj.num2=b;
		obj.addition();
		obj.subtraction();
		s.close();

	}

}
