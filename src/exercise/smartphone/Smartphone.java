package exercise.smartphone;
import exercise.product.Product;

public class Smartphone extends Product {
    private int imei;
    private int memory;

    public Smartphone(String nome,String descrizione,float prezzo, int imei, int memory){
        super(nome, descrizione, prezzo);
        this.imei= imei;
        this.memory = memory;
    }
    @Override
    public String getName(){
        return "nome telefono: "+super.getName();
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

    @Override
    public String toString() {
        return super.toString()+ 
        "\nimei: "+this.imei+
        "\nmemory: "+this.memory;
    }
}
