package cn.xpbootcamp.code_smell.$18_middle_man;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("SJ");
        Department department = new Department(new Person("XJ"));
        department.setType("Capability");

        person.setDepartment(department);

        Person manager = person.getManager();
        String departmentType = person.getDepartmentType();

        System.out.println(manager.getName() + "is working in a department of " + departmentType);
    }
}
