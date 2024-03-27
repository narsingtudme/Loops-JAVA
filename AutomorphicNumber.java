import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int dup=num;
		int sqr=num*num;
		int div=1;
		while(num !=0)
		{
			div*=10;
			num/=10;
		}
		int id=sqr%div;
		System.out.print((dup==id? dup+ " is an AutomorphicNumber" : dup + "is not a AutomorphicNumber"));

	}
}