package ucu.edu.ua.apps.task2;

public class Database extends БазаДаних{
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStaticData() {
        return отриматиСтатистичніДані();
    }
}
