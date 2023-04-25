package Toys;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Toy {
    int id;
    String name;
    public int quantity;
    public int drop_chance;
    public  static ArrayList<Toy> toyslister = new ArrayList<>();
    public  static Scanner scanner = new Scanner(System.in);

    public Toy(int id,String name,int quantity,int drop_chance){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.drop_chance = drop_chance;
        
    }


    public String getInfo(){
        return"";
    }

    public int getId(){
        return id;
    }
    
    public String name(){
        return name;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public int getDrop_chance(){
        return drop_chance;
    }
    // метод изменения шанса выпадения
    
    public static int changeDrop(){
        System.out.println("Введите шанс выпадения");
        int dropchancechange = scanner.nextInt();
        
        return dropchancechange;

    }


    // Метод добовления новой игрушки
    
    public static Toy addNewtoy(){
    
        System.out.println("Введите название игрушки");
        String toyname = scanner.nextLine();
        System.out.println("Введите id");
        int toyid = scanner.nextInt();
        System.out.println("Введите количество");
        int toyquant = scanner.nextInt();
        System.out.println("Введите шанс выпадения");
        int toychanse = scanner.nextInt();
       
        return (new Newtoy(toyid, toyname, toyquant, toychanse));


    }

   
    
    
}