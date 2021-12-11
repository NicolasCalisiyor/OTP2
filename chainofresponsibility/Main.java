package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        
        ManagerPPower manager = new ManagerPPower();
        ChiefPPower chief = new ChiefPPower();
        CEOPPower ceo = new CEOPPower();

        manager.setSuccessor(chief);
        chief.setSuccessor(ceo);

        try {
            while (true) {
                System.out.println("Enter the amount of the raise.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new
                InputStreamReader(System.in)).readLine());
                manager.processRequest(new PromotionRequest(d, "General"));
            }
            } catch(Exception e) {
                System.exit(1);
            }
    }
}