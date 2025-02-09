package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class SmsNotifier extends AbstractNotifier {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение по СМС на номер " + user.getPhone() + ", текст - " + message);
    }
}
