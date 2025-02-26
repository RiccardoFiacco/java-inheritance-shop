package exercise.product;

import java.util.Random;

public class Product {
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;

    public Product(String nome,String descrizione,float prezzo){
        Random r = new Random();
        this.codice = r.nextInt(9999);  
        this.nome =  nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = 0.22f;
    };

    public String getName(){
        return this.nome;
    }
    public int getCodice(){
        return this.codice;
    }
    public float getPrezzo(){
        return this.prezzo;
    }
    public float getIva(){
        return this.iva;
    }
    public String getDescrizione(String descrizione){
        return this.descrizione;
    }

    public void setName(String nome){
        this.nome = nome;
    }
    public void setPrezzo(float prezzo){
        this.prezzo = prezzo;
    }
    public void setIva(int iva){
        this.iva = iva;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    @Override
    public String toString(){
        return "nome prodotto: "+this.nome+
        "\ncodice: "+this.codice+
        "\nprezzo: "+this.prezzo+
        "\niva: "+this.iva+
        "\ndescrizione : "+this.descrizione;
    }
}
