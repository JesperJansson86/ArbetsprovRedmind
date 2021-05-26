package Java;


public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.isWithdrawPossibleChecker(1500);
        atm.isWithdrawPossibleChecker(700);
        atm.isWithdrawPossibleChecker(400);
        atm.isWithdrawPossibleChecker(1100);
        atm.isWithdrawPossibleChecker(1000);
        atm.isWithdrawPossibleChecker(700);
        atm.isWithdrawPossibleChecker(300);

    }
    int thousand = 2;
    int fiveHundred = 3;
    int hundred = 5;

    public boolean isWithdrawPossibleChecker(int withdrawAmount){
       int backupWithdrawAmount = withdrawAmount;
       int backupThousand = thousand;
       int backupFiveHundred = fiveHundred;
       int backupHundred = hundred;
       int withdrawThousand = 0;
       int withdrawFiveHundred = 0;
       int withdrawhundred = 0;

       while (withdrawAmount  >= 1000 && thousand != 0) {
           withdrawThousand++;
           withdrawAmount -= 1000;
           thousand--;

       }
       while (withdrawAmount  >= 500 && fiveHundred !=0){
           withdrawFiveHundred++;
           withdrawAmount -= 500;
           fiveHundred--;

       }
       while(withdrawAmount  >= 100 && hundred !=0){
           withdrawhundred++;
           withdrawAmount -= 100;
           hundred--;

       }
       if (withdrawAmount == 0){
           System.out.println("The machince gave you:"+withdrawThousand+ " Thousand bills."+withdrawFiveHundred+" Fivehundred bills. "
                   +withdrawhundred+" Hundred bills. Total: "+(withdrawThousand*1000+withdrawFiveHundred*500+withdrawhundred*100));
           return true;

       }else {
           thousand = backupThousand;
           fiveHundred = backupFiveHundred;
           hundred = backupHundred;
           System.out.println("The cannot give you the requested amount "+backupWithdrawAmount+". Machine inventory status: "+(thousand+" Thousand bills. "+fiveHundred+" Fivehundred bills. "+hundred+" Hundred bills."));
        return false;
       }
    }



}
