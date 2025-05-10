package model.entities;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return String.format("| Nome: %s\n| CPF: %s\n| Email: %s\n| Data do pedido: %s", name, cpf, email, fmt.format(date));
    }

}
