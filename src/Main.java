import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String primo="";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmpS;
        int tmp;
        ArrayList<Cavallo> listaCavallo = new ArrayList<Cavallo>();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Inserisci il nome del cavallo " + i);
            tmpS =  input.nextLine();
            System.out.println("Inserisci la lentezza del cavallo " + i);
            tmp = input.nextInt();
            String v = input.nextLine(); //prende il \n
            Cavallo c=new Cavallo(tmpS, tmp);
            listaCavallo.add(c);
        }
        int n = (int) (Math.random() /0.2);
        Cavallo x = listaCavallo.get(n);
        x.interrupt();
        listaCavallo.remove(n);

        for(Cavallo c: listaCavallo){
            c.start();
        }

        System.out.println("Cavallo azzoppato: "+ x.getNomeCavallo());

        for(Cavallo c: listaCavallo){
            try {
                c.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Il primo cavallo: " + primo);    }

    public static String getPrimo() {
        return primo;
    }
    public static void setPrimo(String primo) {
        Main.primo = primo;
    }
}
