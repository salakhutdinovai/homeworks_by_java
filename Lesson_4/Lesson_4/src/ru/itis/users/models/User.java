package ru.itis.users.models;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */


public class User {
    private final String uuid;
    private final String email;
    private final String password;
    private String phone; // Новый атрибут

    public User(String uuid, String email, String password) {
        this.uuid = uuid;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getUuid() {
        return uuid;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }
}
