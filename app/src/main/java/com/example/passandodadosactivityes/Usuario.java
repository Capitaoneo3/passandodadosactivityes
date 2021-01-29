package com.example.passandodadosactivityes;

import java.io.Serializable;
/*interface seriazable permite que o nosso usuário
possa ser convertido em bytes, entao ele pode ser armazenado em disco*/
public class Usuario implements Serializable {
    private String nome;
    private String email;


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
