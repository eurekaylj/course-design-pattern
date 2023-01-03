package exp3.t6;


public class Department extends MyObservable {
    private String departmentName;

    public void changeDepartmentName(String departmentName) {
        this.setDepartmentName(departmentName);
        System.out.println("Department changed: " + departmentName);
        System.out.println("-------------------------");
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Object objects : observers) {
            ((MyObserver) objects).response(this);
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
