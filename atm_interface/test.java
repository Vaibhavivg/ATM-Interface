package atm_interface;

import java.util.Scanner;

public class test {
	 public static void main(String[] args) {        
		 atm1 op= new operation();
	        int userid=57825;
	        int userpin=1975;
	        Scanner in=new Scanner(System.in);
	
	        System.out.println("******** Welcome to ATM Machine !!! **********\n");
	        System.out.print("Enter User ID : ");
	        int id=in.nextInt();
	        System.out.print("Enter Pin: ");
	        int pin=in.nextInt();
	        if((userid==id)&&(userpin==pin)){
	            while(true){
	                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Transaction History\n5.Exit");
	                System.out.println("Enter Choice : ");
	                int ch=in.nextInt();
	                if(ch==1){
	                    op.viewBalance();
	                    System.out.println("\n");
	                }
	                
	                else if(ch==2){
	                    System.out.println("Enter amount to withdraw ");
	                    double withdrawAmount=in.nextDouble();
	                    op.withdrawAmount(withdrawAmount);
	                    System.out.println("\n");
	                }
	                else if(ch==3){
	                    System.out.println("Enter Amount to Deposit :");
	                    double depositAmount=in.nextDouble();//5000
	                    op.depositAmount(depositAmount);
	                    System.out.println("\n");

	                }
	                else if(ch==4){
	                    op.viewtransaction_history();
	                    System.out.println("\n");
	                }
	                else if(ch==5){
	                    System.out.println("Collect your ATM Card\n Thank you !!");
	                    System.exit(0);
	                    System.out.println("\n");
	                }
	                else
	                {
	                    System.out.println("Please enter correct choice");
	                    System.out.println("\n");
	                }
	            }
	        }
	        else{
	            System.out.println("Incorrect Atm Number or pin");
	            
	            System.exit(0);
	        }


	    }
}
