package cn.xpbootcamp.code_smell.$16_temporary_field.disposable_field;

public class NotificationService {
    private static NotificationService instance;

    private NotificationService() {

    }

    public static NotificationService getInstance() {
        if(null == instance) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void sendSMS(String phoneNumber, String message) {

    }
}
