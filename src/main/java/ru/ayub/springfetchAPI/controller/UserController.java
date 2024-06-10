package ru.ayub.springfetchAPI.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ayub.springfetchAPI.entity.User;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping()
    public User adminInfo(@AuthenticationPrincipal User user) {
        return user;
    }
}