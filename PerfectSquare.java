import java.util.Scanner ;
class PerfectSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		boolean flag = false;
		int sqrt = 0;
		for(int i = 0 ;i <= num/2 ; i++)
		{
			if(i*i ==num)
			{
				flag = true ;
				sqrt = i ;
				break;

			}

		}
		if(flag)
		{
			System.out.println(sqrt + " is a perfect square of a number " +num);
		}
		else
		{
			System.out.println(sqrt + " do not have perfect Square " +num);
		}
	}
}