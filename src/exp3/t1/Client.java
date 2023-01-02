package exp3.t1;

public class Client {
    public static void main(String[] args) {
        Handler director, departmentManager, viceManager, generalManager, conference;
        director = new Director("刘主任");
        departmentManager = new DepartmentManager("罗经理");
        viceManager = new ViceManager("李经理");
        generalManager = new GeneralManager("宋经理");
        conference = new Conference("采购单审批会议");

        director.setSuccessor(departmentManager);
        departmentManager.setSuccessor(viceManager);
        viceManager.setSuccessor(generalManager);
        generalManager.setSuccessor(conference);

        PurchaseRequest pr1 = new PurchaseRequest("采购单1001", 8000);
        director.handleRequest(pr1);
        System.out.println();

        PurchaseRequest pr2 = new PurchaseRequest("采购单1002", 18000);
        director.handleRequest(pr2);
        System.out.println();

        PurchaseRequest pr3 = new PurchaseRequest("采购单1003", 58000);
        director.handleRequest(pr3);
        System.out.println();

        PurchaseRequest pr4 = new PurchaseRequest("采购单1004", 188000);
        director.handleRequest(pr4);
        System.out.println();

        PurchaseRequest pr5 = new PurchaseRequest("采购单1005", 288000);
        director.handleRequest(pr5);
        System.out.println();


    }
}
