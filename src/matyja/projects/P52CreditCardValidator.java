package matyja.projects;

import java.util.Scanner;

public class P52CreditCardValidator {

    //Valid number example : 89654321
    private boolean mainflag=false;
    private Scanner scanner = new Scanner(System.in);
    private int odds;
    private int evens;
    int firstEven;
    int secondEven;
    int thirdEven;
    int flag = 1;
    int num = 0;

    public void checkCreditCard() {

        while (mainflag==false){
        //Collecting input
        System.out.println("Please enter your credit card number:...  ");
        int number = scanner.nextInt();

        while (number > 9) {
            int num = number % 10;
            if (flag % 2 == 1) {
                odds += num;

            }else{
                if(firstEven==0){
                    firstEven=num;
                }else if(secondEven==0){
                    secondEven=num;
                }
                else if(thirdEven==0){
                    thirdEven=num;
                }
            }
            flag++;
            number = number / 10;

        }


//Multiplying by 2 as in the task
        firstEven*=2;
        secondEven*=2;
        thirdEven*=2;
        number*=2;

        if(firstEven>=10){
            int cyfra1 = firstEven%10;
            int cyfra2 = firstEven/10;
            evens+=cyfra1;
            evens+=cyfra2;
        }else {
            evens+=firstEven;
        }

        if(secondEven>=10){
            int cyfra1 = secondEven%10;
            int cyfra2 = secondEven/10;
            evens+=cyfra1;
            evens+=cyfra2;
        }else {
            evens+=secondEven;
        }

        if(thirdEven>=10){
            int cyfra1 = thirdEven%10;
            int cyfra2 = thirdEven/10;
            evens+=cyfra1;
            evens+=cyfra2;
        }else {
            evens+=thirdEven;
        }

        if(number>=10){
            int cyfra1 = number%10;
            int cyfra2 = number/10;
            evens+=cyfra1;
            evens+=cyfra2;
        }else {
            evens+=number;
        }
        System.out.println("Odds: " +odds);
        System.out.println("Evens: " +evens);

        int summary = odds+evens;
        if(summary%10==0){
            System.out.println("Valid card number, access granted!!!!");
            mainflag=true;
        }else {
            System.out.println("Invalid card number...."
            +"\n Enter your number again.....");

        }
            evens=0;
            odds=0;
            num=0;
            flag=1;
            firstEven=0;
            secondEven=0;
            thirdEven=0;
            number=0;
    }
    }
}
