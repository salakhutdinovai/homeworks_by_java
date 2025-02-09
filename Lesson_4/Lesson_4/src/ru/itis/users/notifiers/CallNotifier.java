package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class CallNotifier extends AbstractNotifier {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение звонком по телефону " + user.getPhone() + ", текст - " + message);
    }
}
