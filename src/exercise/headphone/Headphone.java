package exercise.headphone;

import exercise.product.Product;

public class Headphone extends Product {
    private String color;
    private boolean wireless;
    private boolean wired;

    public Headphone(String nome,String descrizione,float prezzo,int iva){
        super(nome, descrizione, prezzo, iva);
    }
    public Headphone(String nome,String descrizione,float prezzo,int iva,String color, boolean wireless, boolean wired){
        super(nome, descrizione, prezzo, iva);
        this.color = color;
        this.wired = wired;
        this.wireless = wireless;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getWireless(){
        return this.wireless; 
    };
    public boolean getWired(){
        return this.wired;
    };


    public void setColor(String color){
        this.color = color;
    }
    public void setWireless( boolean wireless){
        this.wireless = wireless;
    }
    public void setWired( boolean wired){
        this.wired = wired;
    }
}
