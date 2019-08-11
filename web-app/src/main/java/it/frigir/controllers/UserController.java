package it.frigir.controllers;

import it.frigir.domain.UserCommand;
import it.frigir.entities.User;

public class UserController {

    User saveUser(UserCommand command) {
        return new User();
    }

}
