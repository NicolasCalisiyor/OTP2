package chainofresponsibility;

public class ManagerPPower extends PromotionPower{
    
    private final double ALLOWABLE = 1.99 * BASE;

    public void processRequest(PromotionRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve raise of " + request.getAmount() + "%");
        } 
        else {
            super.processRequest(request);
        }
    }
}
