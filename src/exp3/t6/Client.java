package exp3.t6;

public class Client {
    public static void main(String[] args) {

        Department department = new Department();

        Teacher teacher = new Teacher();
        Student student = new Student();

        department.attach(teacher);
        department.attach(student);
        department.changeDepartmentName("Computer Sciences");
    }
}
