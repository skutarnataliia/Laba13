package ucu.edu.ua.apps.task1;

import java.time.LocalDateTime;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser (FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDateTime getLastActiveDate() {
        return facebookUser.getUserActiveTime();
    }
}
