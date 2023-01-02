package exp3.t1;

public abstract class Handler {
    protected String name;
    protected Handler successor;// 后继者

    public Handler(String name) {
        this.name = name;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(PurchaseRequest purchaseRequest);
}
