package exp3.t6;

public class Student implements MyObserver {

    @Override
    public void response(MyObservable myObservable) {
        Department department = (Department) myObservable;
        System.out.println("Student: " + department.getDepartmentName());
    }
}
