package Macera;

import java.util.Scanner;

public class Game {

    private Scanner input =new Scanner(System.in);

    public void start(){
        System.out.println("Oyunumuza hosgeldiniz!");
        System.out.print("Lutfen bir isim giriniz: ");
        String playerName=input.next();

        Player p1=new Player(playerName);
        System.out.println("Sayin "+p1.getName()+" bu karanlik sisli bir adaya hosgeldin!");

        p1.selectChar();

    }
}
