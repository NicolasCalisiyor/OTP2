package chainofresponsibility;

public class ChiefPPower extends PromotionPower{

    private final double ALLOWABLE = 4.99 * BASE;

    public void processRequest(PromotionRequest request) {
        if (request.getAmount() < ALLOWABLE ) {
            System.out.println("Chief will approve raise of " + request.getAmount() + "%");
        } 
        else {
            super.processRequest(request);
        }
    }
}
