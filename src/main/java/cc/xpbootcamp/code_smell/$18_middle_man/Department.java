package cc.xpbootcamp.code_smell.$18_middle_man;

public class Department {
    private String name;
    private long membersCount;
    private String type;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
