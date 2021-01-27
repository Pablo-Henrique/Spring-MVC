package com.protocol.protocol.model;

import javax.persistence.*;

@Entity(name = "cadastros_usuarios")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 35)
    private String usuario;

    @Column(nullable = false, length = 20)
    private String senha;

    public UserModel(Long id, String name, String email, String usuario, String senha) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    public UserModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
