package model;

/**
 * This ensures the user data using in this test use the correct encapsulation usingt getters and setters to access or modify info
 */
public class UserDataModel {
    private String strUsername ;
    private String strPassword ;
    private String strEmail;
    private String strName;
    private String strMessage;
    private String strComplete;

    public String getStrComplete() {
        return strComplete;
    }

    public void setStrComplete(String strComplete) {
        this.strComplete = strComplete;
    }

    public String getStrUsername() {
        return strUsername;
    }

    public void setStrUsername(String strUsername) {
        this.strUsername = strUsername;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }
}
