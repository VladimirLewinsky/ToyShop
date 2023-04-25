import Toys.Toy;
import Toys.Rabbit;
import Toys.Bear;
import Toys.Duck;
import Toys.Newtoy;
import javax.swing.text.View;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    static final int ALLTOYS = 10;
    public static ArrayList<Toy> toyslist = new ArrayList<>();
    public  static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Toy> newtoyslist = new ArrayList<>();
    public static void main(String[] args) {
        




        for (int i = 0; i < ALLTOYS; i++) {
            int a = new Random().nextInt(3);
            if (a == 0) {
                toyslist.add(new Rabbit());
            }

            if (a == 1) {

                toyslist.add(new Duck());
            }
            if (a == 2) {

                toyslist.add(new Bear());
            }

        }
    
    
    while (true) {
        view.Toysmenu();
        System.out.println("\n");
        System.out.println("Введите команду: ");
        int x = scanner.nextInt();
        if (x==1) newtoyslist.add(Toy.addNewtoy());

        if (x==2) {
            System.out.println("\n");
            System.out.println("Список всех игрушек");
            System.out.println(toyslist);
            System.out.println("\n");
            System.out.println("У какой игрушки вы хотите изменить шанс");
            int toyinlist = scanner.nextInt();
            int newdropchance = Toy.changeDrop();
            toyslist.get(toyinlist).drop_chance = newdropchance;
            System.out.println("\n");
        }
        if (x==3){
            int winindex = new Random ().nextInt(10);
            System.out.println("\n");
            System.out.println("Вы выиграли");
            System.out.println(toyslist.get(winindex));
            toyslist.get(winindex).quantity = -1;
            System.out.println("\n");
        }
        if (x == 0 ) break;
    }


    }
}

 
