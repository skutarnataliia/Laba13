package ucu.edu.ua.apps.task1;

public class Auth {
    public User login() {
        int n = 0;
        if (n > 0) {
            return new MyFacebookUser(new FacebookUser());
        } else {
            return new MyTwitterUser(new TwitterUser());
        }
    }
}
