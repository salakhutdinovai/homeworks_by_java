package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class EmailNotifier extends AbstractNotifier {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение по Email на почту " + user.getEmail() + ", текст - " + message);
    }
}
