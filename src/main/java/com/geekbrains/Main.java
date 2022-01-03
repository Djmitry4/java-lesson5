package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Sotrudnik sotrudnik1 = new Sotrudnik("Иванов Иван Иванович", "Директор", "ivanov@gamil.com", "+792112313212", 120000, 49);
        Sotrudnik sotrudnik2 = new Sotrudnik("Петров Петр Петрович", "Замдиректора", "petrov@gmail.com", "+791112332112", 90000, 40);
        Sotrudnik sotrudnik3 = new Sotrudnik("Сорокина Эмма Павловна", "Главный бухгалтер", "sorokina@gmail.com", "+792199999991", 80000, 44);
        Sotrudnik sotrudnik4 = new Sotrudnik("Маркин Илья Борисович", "Главный инженер", "markin@gmail.com", "+79524453478", 70000, 37);
        Sotrudnik sotrudnik5 = new Sotrudnik("Василий Васильевич Пупкин", "тот кто делает всё", "pupok@rambler.ru", "+79211234567", 55000, 33);
        Sotrudnik[] sotrArray = new Sotrudnik[5];
        sotrArray[0] = sotrudnik1;
        sotrArray[1] = sotrudnik2;
        sotrArray[2] = sotrudnik3;
        sotrArray[3] = sotrudnik4;
        sotrArray[4] = sotrudnik5;
        for (int i = 0; i < 5; i++) {
            if (sotrArray[i].age >= 40) {
                System.out.println("Сотрудники старше 40 лет:" + sotrArray[i].name);
            }
        }
    }
}

