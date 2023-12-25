package ucu.edu.ua.apps.task1;

import java.time.LocalDateTime;

public class MessageSender {
    public void send(String text, User user, String country) {
        user.getLastActiveDate();
        if ((user.getCountry() == country) && (LocalDateTime.now().minusHours(1).isBefore(user.getLastActiveDate()))) {
            System.out.println(text);
            System.out.println("Sent to " + user.getEmail());
        }
    }
}
