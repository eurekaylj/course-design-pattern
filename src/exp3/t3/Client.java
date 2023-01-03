package exp3.t3;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        System.out.println("Original:");
        Iterator<Student> iterator1 = classroom.creatIterator();
        while (iterator1.hasNext()) {
            Student stu = iterator1.next();
            System.out.println("Name:" + stu.getName() + " " + "Age：" + stu.getAge());
        }

        System.out.println("Sorted:");
        classroom.sortClass();
        Iterator<Student> iterator2 = classroom.creatIterator();
        while (iterator2.hasNext()) {
            Student stu = iterator2.next();
            System.out.println("Name:" + stu.getName() + " " + "Age：" + stu.getAge());
        }
    }
}
