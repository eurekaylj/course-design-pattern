package exp3.t1;

public class DepartmentManager extends Handler {

    public DepartmentManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPurchaseAmount() <= 50000) {
            System.out.println("部门经理："
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
