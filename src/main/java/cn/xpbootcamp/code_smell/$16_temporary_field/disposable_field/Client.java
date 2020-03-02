package cn.xpbootcamp.code_smell.$16_temporary_field.disposable_field;

public class Client {

    public static void main(String[] args) {
        User user = new User(1, "sj", 5, new ContactDetails("18194849933"), "89aionfildaje0wofkles");
        user.encryptPassword();

        user.sendMessage("Hello Refactoring Bootcamp");

        user.freeze();
    }
}
