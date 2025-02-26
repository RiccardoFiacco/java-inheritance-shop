import java.util.Scanner;

import exercise.headphone.Headphone;
import exercise.smartphone.Smartphone;
import exercise.tv.Tv;

public class Cart {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        Object[] cart = new Object[0];

        while(flag){
            System.out.println("aggiungi 1. telefono 2. tv. 3. cuffie\n");
            int choice = s.nextInt();

            if(choice != 1 || choice != 2 || choice != 3){
                System.out.println("inserisci un valore corretto");
            }else{
                if(choice==1){
                    System.out.println("nome telefono\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione telefono\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo telefono\n");
                    int price = s.nextInt(); 

                    System.out.println("codice imei telefono\n");
                    int code = s.nextInt(); 

                    System.out.println("memoria del telefono\n");
                    int memory = s.nextInt();

                    Smartphone smartphone = new Smartphone(name, descr, price, code, memory);

                    Object[] newcCart = new Object[cart.length+1];

                    for (int i = 0; i < newcCart.length; i++) {
                        newcCart[i] = cart[i];
                    }  

                    newcCart[cart.length - 1] = smartphone;
                } else if(choice==2){
                    System.out.println("nome tv\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione tv\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo tv\n");
                    int price = s.nextInt(); 

                    System.out.println("dimensioni tv\n");
                    int dimension = s.nextInt(); 

                    System.out.println("smart tv?\n");
                    boolean smart = s.nextBoolean();

                    Tv tv = new Tv(name, descr, price, dimension, smart);

                    Object[] newcCart = new Object[cart.length+1];

                    for (int i = 0; i < newcCart.length; i++) {
                        newcCart[i] = cart[i];
                    }  
                    
                    newcCart[cart.length - 1] = tv;

                }else if(choice==3){
                    System.out.println("nome cuffie\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione cuffie\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo cuffie\n");
                    int price = s.nextInt(); 

                    System.out.println("dimensioni cuffie\n");
                    String color = s.nextLine(); 

                    System.out.println("smart cuffie?\n");
                    boolean wireless = s.nextBoolean();

                    Headphone cuffie = new Headphone(name, descr, price, color, wireless);

                    Object[] newcCart = new Object[cart.length+1];

                    for (int i = 0; i < newcCart.length; i++) {
                        newcCart[i] = cart[i];
                    }  
                    
                    newcCart[cart.length - 1] = cuffie;
                }

            }

        }
        System.out.println("CIAO");
        s.close();
    }
}
