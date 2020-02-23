package cc.xpbootcamp.code_smell.$19_insider_trading.first_demo;

public class Motorist {

    private String surname;
    private String firstName;

    private String title;

    private License license;

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public RiskFactor getRiskFactor() {
        if(license.getPoints() > 3) {
            return RiskFactor.HIGH_RISK;
        }

        if(license.getPoints() > 0) {
            return RiskFactor.MODERATE_RISK;
        }

        return RiskFactor.LOW_RISK;
    }
}
