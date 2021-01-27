package com.protocol.protocol.controller;

import com.protocol.protocol.model.UserModel;
import com.protocol.protocol.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/cadastrar")
    public ModelAndView cadastrar() {
        return new ModelAndView("cadastroClient.html");
    }

    /**
     * @GetMapping: O método GET solicita a representação de um recurso específico.
     * Requisições utilizando o método GET devem retornar apenas dados.
     */
    @GetMapping("/list")
    public List<UserModel> userList() {
        return this.userService.userList();
    }

    /**
     * @PostMapping: métodos HTTP, é enviar uma representação de uma nova entidade de dados ao servidor de forma
     * que ele seja armazenado como um novo subordinado do recurso identificado pelo URI
     */
    @PostMapping("/salvar")
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    // @PutMapping


    // @PatchMapping


    // @DeleteMapping
}
