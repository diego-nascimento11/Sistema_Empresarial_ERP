package model.entities;

import java.util.Date;

public abstract class Client {

    private String name;
    private String cpf;
    private String email;
    private Date date;

    public Client(String name, String cpf, String email, Date date) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.date = date;
    }


    public String toString() {
        System.out.println();
        return String.format("|Nome: "
                + name
                + "\n|CPF: "
                + cpf
                + "\n|Email: "
                + email);
    }
}
