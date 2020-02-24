package cc.xpbootcamp.code_smell.$16_temporary_field.disposable_field;

public class ContactDetails {
    private String phoneNumber;

    public ContactDetails(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
