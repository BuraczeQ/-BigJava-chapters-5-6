package matyja.projects;

import java.util.ArrayList;

public class R63MaxMinArrayListElems {

    public double minBalance;
    public double maxBalance;
    double balance = 0;

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public ArrayList<R63MaxMinArrayListElems> maxMinCreator() {
        ArrayList<R63MaxMinArrayListElems> bank = new ArrayList<>();

        for (int i = 1; i < 16; i++) {
           int j = i+2;
            R63MaxMinArrayListElems bankacc = new R63MaxMinArrayListElems();
            bankacc.setBalance(i*100);
            bank.add(bankacc);  }
        return bank;
    }

    public void calculateMaxMin(ArrayList<R63MaxMinArrayListElems> bank){
        bank = maxMinCreator();

       /*for (int i =0; i<bank.size(); i++) {
           System.out.println("Name = " + bank.get(i));
            System.out.println("Values: " + bank.get(i).blanace);
        }         */

       for(int i = 0; i<bank.size(); i ++){

           if(i==0){
               minBalance = bank.get(i).balance;
               maxBalance = bank.get(i).balance;
           }else {
               if(minBalance>bank.get(i).balance){
                   minBalance=bank.get(i).balance;
               }
               if(maxBalance<bank.get(i).balance){
                   maxBalance = bank.get(i).balance;
               }
           }


       }

        System.out.println(minBalance);
        System.out.println(maxBalance);

    }




}

