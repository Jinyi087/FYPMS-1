package main.controller.account;

import main.controller.account.password.PasswordIncorrectException;
import main.controller.account.password.PasswordManager;
import main.controller.account.user.UserAdder;
import main.controller.account.user.UserFinder;
import main.controller.account.user.UserUpdater;
import main.model.user.Student;
import main.model.user.User;
import main.model.user.UserFactory;
import main.model.user.UserType;

import java.util.NoSuchElementException;

import static main.controller.account.user.UserUpdater.updateUser;

public class AccountManager {
    public static User login(UserType userType, String userID, String password)
            throws PasswordIncorrectException, NoSuchElementException {
        User user = UserFinder.findUser(userID, userType);
        if (PasswordManager.checkPassword(user, password)) {
            return user;
        } else {
            throw new PasswordIncorrectException();
        }
    }

    public static void changePassword(UserType userType, String userID, String oldPassword, String newPassword)
            throws PasswordIncorrectException, NoSuchElementException {
        User user = UserFinder.findUser(userID, userType);
        PasswordManager.changePassword(user, oldPassword, newPassword);
        UserUpdater.updateUser(user);
    }

    public static void register(UserType userType, String userID, String password, String name, String email)
            throws NoSuchElementException {
        User user = UserFactory.create(userType, userID, password, name, email);
        UserAdder.addUser(user);
    }
}
