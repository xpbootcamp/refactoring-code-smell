package smell.$08_shotgun_surgery;

public class MsgSender {
    public void sendChangeNotification(Account account){
        System.out.println("To account: " + account.getAccountNumber() + "Your account balance changed. Visit your account to check.");
    }
}
