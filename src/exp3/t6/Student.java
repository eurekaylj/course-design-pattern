package exp3.t6;

import java.util.Observable;
import java.util.Observer;

public class Student implements MyObserver {

    @Override
    public void response(MyObservable myObservable) {
        Department department = (Department) myObservable;
        System.out.println("Student: " + department.getDepartmentName());
    }
}
