import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MINI BANK \n");
        int balance = 0;
        int opin = 3535;

        while(true){
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check your balance ");
            System.out.println("4. Exit ");
            System.out.println("Select your choice ");
            int choose = input.nextInt();
            if (choose == 1){
                    System.out.println("DEPOSIT SELECTED.............");
                    System.out.println("Enter our PIN Code ");
                    int epin = input.nextInt();
                    if(epin == opin){
                        System.out.println("Access Granted");
                    }else{
                        System.out.println("Wrong PIN.....Try Again.. ");
                        continue;
                    }
                    System.out.println("ENTER YOUR DEPOSIT AMOUNT....");
                    int amount = input.nextInt();
                    if(amount >= 0){
                    balance += amount;
                    }else{
                        System.out.println("Enter valid amount. ");
                    }
                    System.out.println("Your Updated balance is "+ balance);
            }else if (choose == 2){
                    System.out.println("WITHDRAW SELECTED.............");
                    System.out.println("Enter our PIN Code ");
                    int epin = input.nextInt();
                    if(epin == opin){
                        System.out.println("Access Granted");
                    }else{
                        System.out.println("Wrong PIN.... Try Again....");  
                        continue;
                    }
                    System.out.println("ENTER YOUR WITHDRAWAL AMOUNT.....");
                    int amount1 = input.nextInt();
                    if(amount1<=balance && amount1 >=0){
                        System.out.println(amount1+" is successfully withdraw");
                        balance-=amount1;
                    }else if(amount1 > balance){
                        System.out.println("Balance insufficient....");
                    }else{
                        System.out.println("Invalid Number.., Please enter valid amount..");
                    }
                    System.out.println("Your remaining balance is "+balance);
                    
            }else if(choose == 3){
                System.out.println("Enter our PIN Code ");
                    int epin = input.nextInt();
                    if(epin == opin){
                        System.out.println("Access Granted");
                    }else{
                        System.out.println("Wrong PIN....Try Again.... ");
                        continue;
                    }
                    System.out.println("Your Balance is " + balance);
            }else if(choose == 4) {
                    System.out.println("EXITING......... PLEASE VISIT AGAIN....");
                    break;
            }else{
                    System.out.println("INVALID....TRY AGAIN...");
                    
            }
            
        }
    }
}
