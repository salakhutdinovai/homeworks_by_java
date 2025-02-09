package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.repositories.UsersRepository;

import java.util.UUID;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private final UsersRepository repository;

    public UsersService() {
        this.repository = new UsersRepository();
    }

    public void addUser(String email, String password) {
        User user = new User(UUID.randomUUID().toString(), email, password);
        repository.save(user);
    }

    public boolean deleteUserByEmail(String email) {
        return repository.deleteByEmail(email);
    }
}

