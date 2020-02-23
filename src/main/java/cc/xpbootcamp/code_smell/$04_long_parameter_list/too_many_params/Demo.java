package cc.xpbootcamp.code_smell.$04_long_parameter_list.too_many_params;

import java.util.Date;

public class Demo {

}

class User {
    public User(String name, Date birthday, String location, String username, String phoneNumber, String hobbies) {
        this.name = name;
        this.birthday = birthday;
        this.location = location;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.hobbies = hobbies;
    }

    private String name;
    private Date birthday;
    private String location;
    private String username;
    private String phoneNumber;
    private String hobbies;
}
