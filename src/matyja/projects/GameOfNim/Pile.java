package matyja.projects.GameOfNim;

public class Pile {
    private int pile = 0;

    public int randomPile(){
        pile = (int) (Math.random()*1000);
        System.out.println(pile);
        return pile;
    }
}
