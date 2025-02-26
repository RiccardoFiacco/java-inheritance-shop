import java.util.Scanner;

import exercise.headphone.Headphone;
import exercise.product.Product;
import exercise.smartphone.Smartphone;
import exercise.tv.Tv;

public class Cart {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        Product[] cart = new Product[0];

        while(flag){

            System.out.println("aggiungi \n1.telefono \n2.tv. \n3.cuffie \n4 guarda il carrello \n");
            int choice = s.nextInt();
            s.nextLine();

            if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("inserisci un valore corretto");
            }else{
                if(choice==1){
                    System.out.println("nome telefono\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione telefono\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo telefono\n");
                    float price = s.nextFloat(); 

                    System.out.println("codice imei telefono\n");
                    int code = s.nextInt(); 

                    System.out.println("memoria del telefono\n");
                    int memory = s.nextInt();

                    Smartphone smartphone = new Smartphone(name, descr, price, code, memory);

                    Product[] newcCart = new Product[cart.length+1];

                    for (int i = 0; i < cart.length; i++) {
                        newcCart[i]=cart[i];
                    }  

                    newcCart[newcCart.length - 1] = smartphone;
                    cart = newcCart;

                } else if(choice==2){
                    System.out.println("nome tv\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione tv\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo tv\n");
                    float price = s.nextFloat(); 

                    System.out.println("dimensioni tv\n");
                    int dimension = s.nextInt(); 

                    System.out.println("smart tv?\n");
                    boolean smart = s.nextBoolean();

                    Tv tv = new Tv(name, descr, price, dimension, smart);

                    Product[] newcCart = new Product[cart.length+1];

                    for (int i = 0; i < cart.length; i++) {
                        newcCart[i]=cart[i];
                    }  
 
                     newcCart[newcCart.length - 1] = tv;
                     cart = newcCart;

                }else if(choice==3){
                    System.out.println("nome cuffie\n");
                    String name = s.nextLine(); 

                    System.out.println("descrizione cuffie\n");
                    String descr = s.nextLine(); 

                    System.out.println("prezzo cuffie\n");
                    float price = s.nextFloat(); 

                    System.out.println("dimensioni cuffie\n");
                    String color = s.nextLine(); 

                    System.out.println("smart cuffie?\n");
                    boolean wireless = s.nextBoolean();

                    Headphone cuffie = new Headphone(name, descr, price, color, wireless);

                    Product[] newcCart = new Product[cart.length+1];

                    for (int i = 0; i < cart.length; i++) {
                        newcCart[i]=cart[i];
                    }  
 
                    newcCart[newcCart.length - 1] = cuffie;
                    cart = newcCart;

                }else if(choice==4){
                    for (Product product : cart) {
                        System.out.println(product);
                        System.out.println("-------");
                    }
                }

            }
            s.nextLine();
            while (flag) {
                System.out.println("\nfare altro? y/n");
                String next = s.nextLine();
                if(next.equals("n") || next.equals("y")){
                    if(next.equals("n")){
                        flag = false;
                    }else{
                        break;
                    }
                }else{
                    System.out.println("\ninserisci y o n");
                }
            }
            
            
        }
        System.out.println("CIAO");
        s.close();
    }
}
