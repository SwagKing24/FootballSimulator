import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String squadName;
        String aux;
        int riskMarketFactor;
        Scanner sc = new Scanner(System.in);
        ArrayList<Club> campionato = new ArrayList<>();

        for(int i=0; i<20; i++){
            System.out.println("inserisci il nome del club");
            squadName = sc.nextLine();
            System.out.println("inserisci il risk di mercato della squadra (tra 20 e 80 (%))");
            aux = sc.nextLine();
            riskMarketFactor = Integer.parseInt(aux);
            campionato.add(new Club(squadName, i, riskMarketFactor));
        }
    }
}