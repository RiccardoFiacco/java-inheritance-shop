package exercise.headphone;

import exercise.product.Product;

public class Headphone extends Product {
    private String color;
    private boolean wireless;

    public Headphone(String nome,String descrizione,float prezzo,String color, boolean wireless){
        super(nome, descrizione, prezzo);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getWireless(){
        return this.wireless; 
    };


    public void setColor(String color){
        this.color = color;
    }
    public void setWireless( boolean wireless){
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString()+
        "\ncolore: "+this.color+
        "\nwireless: "+this.wireless;
    }
}
