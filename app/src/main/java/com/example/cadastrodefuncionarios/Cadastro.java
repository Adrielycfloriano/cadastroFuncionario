package com.example.cadastrodefuncionarios;

public class Cadastro {

    private String nome;
    private String cargo;
    private int cpf;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    public Cadastro(String nome, String cargo, int cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
    }
}


