package smell.$18_middle_man;

public class Person {
    private String name;
    private double age;

    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person getManager(){
        return department.getManager();
    }

    public String getDepartmentType(){
        return department.getType();
    }

    public String getName() {
        return name;
    }
}
