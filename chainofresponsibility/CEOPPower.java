package chainofresponsibility;

public class CEOPPower extends PromotionPower{

    private final double ALLOWABLE = 10000 * BASE;

    public void processRequest(PromotionRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("CEO will approve raise of " + request.getAmount() + "%");
        } 
        else {
            super.processRequest(request);
        }
    }
}
