package com.geekbrains;

public class Sotrudnik {
    public String name;
    public String dolgnost;
    public String email;
    public String telephone;
    public long zarplata;
    public int age;

    public Sotrudnik(String name, String dolgnost, String email, String telephone, int zarplata, int age) {
        System.out.println("Данные на сотрудника:" + " " + name + ", " + dolgnost + ", " + email + ", " + telephone + ", " + zarplata + ", " + age);
        this.name = name;
        this.dolgnost = dolgnost;
        this.email = email;
        this.telephone = telephone;
        this.zarplata = zarplata;
        this.age = age;
    }
}
