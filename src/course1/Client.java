package course1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Client {
    private String name;
    private String surname;
    private LocalDate birthYear;

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть null");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Фамилия не может быть null");
        }
        this.surname = surname;
    }

    public String getNameAndSurname(){
        return name + " " + surname;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYearToParse) {
        if ((ChronoUnit.YEARS.between(LocalDate.parse(birthYearToParse, DateTimeFormatter.ofPattern("dd.MM.yyyy")), LocalDate.now())) < 18) {
            throw new IllegalArgumentException("Вам нет 18");
        }
        this.birthYear = LocalDate.parse(birthYearToParse, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public Client(String name, String surname, String birthYear) {
        setName(name);
        setSurname(surname);
        setBirthYear(birthYear);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
