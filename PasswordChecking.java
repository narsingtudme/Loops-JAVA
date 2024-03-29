import java.util.Scanner;
class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException
	 {
		Scanner sc=new Scanner(System.in);
		int attempt=1;
		outerloop:
		for (; ; ) {

					int storedPass=123;
					int count=3;
					do{
						System.out.print("Enter your  PassWord :");
					    int YourPass=sc.nextInt();
						if(storedPass == YourPass)
						{
							System.out.println("welcome");
							break;
							
						}
						else {
							System.out.print("Wrong Pin Attempts Left " + (count-1));
							System.out.println(count);
						}
						if(count==1){
							System.out.println("Please Try Again 5 Sec :");
							Thread.sleep(5000);
							System.out.println("YOU CAN TRY TO ENTER YOUR PIN AGAIN");
						}
						count--;
	                 	}     
		                while(count>=1);
		                if(attempt++ ==2)
		                	break outerloop;
		           {
			         
		}
		
	}
}
}