import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Cavallo fulmine = new Cavallo("Fulmine",50);
        Cavallo lampo = new Cavallo( "Lampo", 10);
        Cavallo rose = new Cavallo( "Rose", 990);
        Cavallo flash = new Cavallo( "Flash", 1);
        Cavallo rambo = new Cavallo( "Rambo", 138);

        //flash.setPriority(Thread.MAX_PRIORITY);
        //rose.setPriority(Thread.MIN_PRIORITY);


        fulmine.start();
        lampo.start();
        rose.start();
        flash.start();
        rambo.start();
    }
}