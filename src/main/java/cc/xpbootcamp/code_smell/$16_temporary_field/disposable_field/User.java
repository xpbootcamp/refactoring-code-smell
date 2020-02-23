package cc.xpbootcamp.code_smell.$16_temporary_field.disposable_field;

public class User {
    private int userId;
    private String name;
    private int priviledges;
    private ContactDeatils contactDetails;

    public User(int userId, String name, int priviledges, ContactDeatils contactDetails) {
        this.userId = userId;
        this.name = name;
        this.priviledges = priviledges;
        this.contactDetails = contactDetails;
    }

    public void notify(String message) {
        NotificationService.getInstance().sendSMS(contactDetails.getPhoneNumber(), message);
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getPriviledges() {
        return priviledges;
    }

    public ContactDeatils getContactDetails() {
        return contactDetails;
    }


}


