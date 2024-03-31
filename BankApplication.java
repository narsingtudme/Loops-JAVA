import java.util.Scanner;
class BankApplication
{

	    static String name;
		static String address;
		static long aadharNo;
		static long phoneNo;
		static double bal;
		static int upiPin ;
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);

	   outerloop:	
	   for( ; ;)
	   {
	   	System.out.println("** Welcome to LaxmiChitFunf **");
	   	System.out.println();
	   	System.out.println("1. Create Account");
	   	System.out.println("2.Existing Account Holder");
	   	System.out.print("Enter an option : ");
	   	int option = sc.nextInt();
	   	System.out.println();
	   	switch(option)
	   	{
	   	case 1 : {
	   		System.out.println("* Create Account Module *");
	   		sc.nextLine();
	   		System.out.print("Enter your name :");
	   		name = sc.nextLine();
	   		System.out.print("Enter your address :");
	   		address = sc.nextLine();
	   		System.out.print("Phone number :");
	   		phoneNo = sc.nextLong();
	   		System.out.print("Aadhar number :");
	   		aadharNo = sc.nextLong();
	   		System.out.print("Deposite Amount :");
	   		bal = sc.nextDouble();
	   		System.out.print("Enter a UPI PIN : ");
	   		upiPin = sc.nextInt();
	   		System.out.println("* Account Created SuccessFully *");
	   		System.out.println();
	   		break;
	   			}
	   	case 2 :{
	   		for( ; ; )
	   		{
	   			System.out.println();
	   			System.out.println("* Features *");
	   			System.out.println("1.Check Balance");
	   			System.out.println("2.Deposite");
	   			System.out.println("3.Withdraw");
	   			System.out.println("4.Info");
	   			System.out.println("5.Logout");
	   			System.out.println();
	   			System.out.print("Enter an Option: ");
	   			int opt = sc.nextInt();
	   			switch(opt)
	   			{
	   			case 1 :{
	   				System.out.println("* Check Balance *");
	   				System.out.print("Enter your UPI PIN :");
	   				int userPin = sc.nextInt();
	   				if(userPin == upiPin)
	   				{
	   					System.out.println("Your Account balance is :" +bal + "rs.");
	   				}
	   				else
	   				{
	   					System.out.println("Wrong UPI PIN ");
	   				}
	   				break;
                   }
	   			case 2 :{
	   				System.out.println("* Deposite Amount *");
	   				System.out.println();
	   				System.out.print("Enter amount :");
	   				double depAmpount = sc.nextDouble();
	   				bal +=depAmpount;
	   				System.out.println("Amount Deposited SuccessFully");
	   				break;
	   			    }
	   			case 3 :{
	   				System.out.println("* Withdraw amount *");
	   				System.out.println();
	   				System.out.print("Enter your UPI PIN :");
	   				int upiPin = sc.nextInt();
	   				System.out.print("Enter Amount : ");
	   				double withdrawamount = sc.nextDouble();
	   				if(withdrawamount <= bal)
	   				{
	   					System.out.println("Amount deposited SuccessFully");
	   					bal = bal - withdrawamount;
	   				}
	   				else
	   				{
	   					System.out.println("Insufficient balance ");
	   				}
	   				break;
	   			}
	   		    case 4 :{
	   		    	System.out.println("* Account Info *");
	   		    	System.out.println();
	   		    	System.out.println("Account Holder name : " +name);
	   		    	System.out.println("Address :" + address);
	   		    	System.out.println("Phone Number : " + phoneNo);
	   		    	System.out.println("Aadhar Number :" +aadharNo);
	   		    	break ;
	   		    }
	   		    case 5 :{
	   		    	System.exit(0);

	   		    }
	   		default: System.out.println("Invalid option");
	   			}
	   		}
	   	}
	   	}
	   }
	}
}