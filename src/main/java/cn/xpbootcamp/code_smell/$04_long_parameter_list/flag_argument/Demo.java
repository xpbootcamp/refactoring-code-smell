package cn.xpbootcamp.code_smell.$04_long_parameter_list.flag_argument;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        User user = new User();

        demo.findUser(user, user.name);
    }

    User findUser(User user, String name) {
        if(name.isEmpty()) {
            throw new RuntimeException("Invalid name");
        }
        return null;
    }
}

class User {
    String name;
    String gender;
}
