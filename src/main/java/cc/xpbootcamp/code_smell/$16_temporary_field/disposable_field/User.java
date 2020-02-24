package cc.xpbootcamp.code_smell.$16_temporary_field.disposable_field;

public class User {
    private int userId;
    private String name;
    private String password;
    private boolean isFrozen;

    private int privileges;
    private ContactDetails contactDetails;
    private String salt;

    public User(int userId, String name, int privileges, ContactDetails contactDetails, String salt) {
        this.userId = userId;
        this.name = name;
        this.privileges = privileges;
        this.contactDetails = contactDetails;
        isFrozen = false;

        this.salt = salt;
    }

    public void sendMessage(String message) {
        if (isFrozen) {
            throw new IllegalStateException();
        }
        NotificationService.getInstance().sendSMS(contactDetails.getPhoneNumber(), message);
    }

    public void freeze() {
        this.isFrozen = true;
    }

    public void encryptPassword() {
        if (isFrozen) {
            throw new IllegalStateException();
        }
        if (!password.isEmpty()) {
            this.password = Encryption.encryptSHA(password, salt);
        }
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }


}


