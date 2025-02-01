import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Club> league = new ArrayList<>();
        ArrayList<Player> PlayerList = new ArrayList<>();

        for(int i=0; i<20; i++){
            league.add(InputClass.insertClub(i));
        }

        for(int i=0; i<500; i++){
            PlayerList.add(InputClass.insertPlayer());
        }

    }
}