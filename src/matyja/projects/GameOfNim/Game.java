package matyja.projects.GameOfNim;

import java.util.Scanner;

public class Game {
    Pile pile = new Pile();
    Scanner scanner = new Scanner(System.in);

    public void game(){
        int stock = pile.randomPile();
        int startingPerson = firstPlayer();

        while (stock!=0) {

            if (startingPerson == 0) {
                System.out.println("Player 1 moves .... ");
                System.out.println("Enter the number of pile that you want to take: ");
                int move = scanner.nextInt();
                scanner.nextLine();
                if(move>(stock/2)){
                    System.out.println("Invalid move..... \n Enter your choice again........");
                    move = scanner.nextInt();
                    scanner.nextLine();
                }else {
                stock-=move;
                System.out.println("Currently there is " + stock + " marbels in a pile");
                startingPerson+=1;}

            }
            else {
                System.out.println("Player 2 moves...... ");
                stock=(stock/2)-1;
                System.out.println("Currently there is " + stock + " marbels in a pile");
                startingPerson-=1;

            }


        }

        System.out.println("The game has terminated. Player " + (startingPerson+1) + " has lost the game....");



    }


    public int firstPlayer(){
        int whoFirst = (int) (Math.random()*2);
        System.out.println(whoFirst);
        return whoFirst;
    }



}
