package memento;

public class Asiakas {
    
    private String asiakas;
    private Object obj;
    private int numero;
    
    public void liityPeliin(Arvuuttaja arvuuttaja, String asiakas){ 
        this.asiakas = asiakas;
        this.obj = arvuuttaja.liityPeliin(asiakas); 
    }
    public void arvaus(Arvuuttaja arvuuttaja, int arvattuNumero){ 
        this. numero = arvattuNumero;
        arvuuttaja.arvaus(obj,numero); 
    }

}
