package chainofresponsibility;

public abstract class PromotionPower {
    protected static final double BASE = 1;

    private PromotionPower successor;

    public void setSuccessor(PromotionPower successor) {
        this.successor = successor;
    }
    public void processRequest(PromotionRequest request){

        if (successor != null)
            successor.processRequest(request);
    }
}
