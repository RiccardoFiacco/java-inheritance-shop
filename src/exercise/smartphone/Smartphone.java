package exercise.smartphone;
import exercise.product.Product;

public class Smartphone extends Product {
    private int imei;
    private int memory;

    public Smartphone(String nome,String descrizione,float prezzo,int iva){
        super(nome, descrizione, prezzo, iva);
    }
    public Smartphone(String nome,String descrizione,float prezzo,int iva, int imei, int memory){
        super(nome, descrizione, prezzo, iva);
        this.imei= imei;
        this.memory = memory;
    }

    public int getImei(){
        return this.imei;
    };
    public int getMemory(){
        return this.memory;
    };

    public void setImei(int imei){
        this.imei = imei;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
}
