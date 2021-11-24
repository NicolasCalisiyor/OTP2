package memento;

public class Main {
    
    public static void main(String[] args) {
        
        Asiakas caretaker = new Asiakas();
        Arvuuttaja arvuuttaja = new Arvuuttaja(); 
        
        Asiakas caretaker2 = new Asiakas();
        Arvuuttaja arvuuttaja2 = new Arvuuttaja(); 

        Asiakas caretaker3 = new Asiakas();
        Arvuuttaja arvuuttaja3 = new Arvuuttaja(); 
        
        Asiakas caretaker4 = new Asiakas();
        Arvuuttaja arvuuttaja4 = new Arvuuttaja(); 
        
        caretaker.liityPeliin(arvuuttaja,"Jasperi");
        caretaker.arvaus(arvuuttaja, 40);
        
        caretaker2.liityPeliin(arvuuttaja2,"Pinja");
        caretaker2.arvaus(arvuuttaja2, 8);

        caretaker3.liityPeliin(arvuuttaja,"Nikke");
        caretaker3.arvaus(arvuuttaja, 4);
        
        caretaker4.liityPeliin(arvuuttaja2,"Tiina");
        caretaker4.arvaus(arvuuttaja2, 33);
    }
}
