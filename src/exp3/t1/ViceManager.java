package exp3.t1;

public class ViceManager extends Handler {

    public ViceManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPurchaseAmount() <= 100000) {
            System.out.println("副经理："
                    + name
                    + "\n"
                    + "审批采购单号："
                    + purchaseRequest.getPurchaseOrder()
                    + "\n"
                    + "审批金额："
                    + "\n"
                    + purchaseRequest.getPurchaseAmount()
                    + "元");
        } else if (this.successor != null)
            this.successor.handleRequest(purchaseRequest);
    }
}
