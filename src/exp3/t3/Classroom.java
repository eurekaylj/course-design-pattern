package exp3.t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Classroom {
    ArrayList<Student> studentList;

    public Classroom() {
        Student[] stu = new Student[5];
        studentList = new ArrayList<Student>();
        stu[0] = new Student("Alice", 22);
        stu[1] = new Student("Bob", 25);
        stu[2] = new Student("Curry", 21);
        stu[3] = new Student("David", 18);
        stu[4] = new Student("Emma", 26);
        studentList.addAll(Arrays.asList(stu).subList(0, 5));
    }

    public Iterator<Student> creatIterator() {
        return studentList.iterator();
    }

    public void sortClass() {
        Collections.sort(studentList);
    }
}
