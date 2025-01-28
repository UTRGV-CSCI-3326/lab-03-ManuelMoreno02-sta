public class Bankaccount{

    public static void main(String[] args){
        double bobs_money = 2175.37;

        //Bob withdrew $302.50.
         bobs_money = bobs_money - 302.50;

         // Bob deposited $50.03.
         bobs_money += 50.03;

         //Bob withdrew half of his current balance, then deposited $20.00.
         double withdrew = bobs_money / 2;
         bobs_money = bobs_money - withdrew;
         bobs_money += 20.00;

         //Bob withdrew $1.
         bobs_money -= 1;

         //Bob deposited his paycheck that doubled his current balance.
         
         bobs_money = bobs_money * 2;

         //Bob deposited $1.
         bobs_money += 1;

         bobs_money = Math.round(bobs_money * 100.0) / 100.0;

         System.out.println("the final outcome is: "+ bobs_money);

    }
}
