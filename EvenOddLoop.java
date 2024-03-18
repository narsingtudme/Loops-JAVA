class EvenOddLoop
{
	public static void main(String[] args) {
		System.out.println("****ASCE EVEN NUMBERS******");
		for(int i=1; i<=100; i++)
		{
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("*****ASCE ODD NUMBERS****");
			for(int i=1; i<=100; i++)
		{
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("**** DESC EVEN NUMBERS******");
		for(int i=100; i>=1; i--)
		{
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("*****DESC ODD NUMBERS****");
			for(int i=100; i>=1; i--)
		{
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
}
