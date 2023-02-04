package exp3.t6;

public class Teacher implements MyObserver {

    @Override
    public void response(MyObservable myObservable) {
        Department department = (Department) myObservable;
        System.out.println("Teacher: " + department.getDepartmentName());
    }
}