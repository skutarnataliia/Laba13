package ucu.edu.ua.apps.task1;

import java.time.LocalDateTime;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDateTime getLastActiveDate() {
        return twitterUser.getLastActiveTime();
    }
    
}
