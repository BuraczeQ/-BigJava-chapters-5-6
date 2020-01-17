package matyja.projects;

public class P55powerOfTenPrinter {


    public void printPowersOfTen(){
        for(double i = -1; i<15; i++){
          double  power = Math.pow(10,i);
            System.out.println("Power of ten to "+ i+ " equals: "+ power);

        }
    }
}
