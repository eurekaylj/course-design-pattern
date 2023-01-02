package exp3.t1;

public class PurchaseRequest {
    private String purchaseOrder;
    private int purchaseAmount;

    public PurchaseRequest(String purchaseOrder, int purchaseAmount) {
        this.purchaseOrder = purchaseOrder;
        this.purchaseAmount = purchaseAmount;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
