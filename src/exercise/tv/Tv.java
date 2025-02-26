package exercise.tv;
import exercise.product.Product;

public class Tv extends Product {
    private int dimension;
    private boolean smart;

    public Tv(String nome,String descrizione,float prezzo,int iva){
        super(nome, descrizione, prezzo, iva);
    }
    public Tv(String nome,String descrizione,float prezzo,int iva,int dimension, boolean smart){
        super(nome, descrizione, prezzo, iva);
        this.dimension = dimension;
        this.smart = smart;
    }

    public int getDimension(){
        return this.dimension;
    }
    public boolean getSmart(){
        return this.smart; 
    };

    public void setColor(int dimension){
        this.dimension = dimension;
    }
    public void setSmart(boolean smart){
        this.smart = smart;
    }

}
