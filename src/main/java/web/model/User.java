package web.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;

    public User() {
    }

    public User(Long userId, String name, String surname, int age, Date dateofbirth) {
        this.Id = userId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateofbirth = dateofbirth;
    }

    public Long getUserId() {
        return Id;
    }

    public void setUserId(Long userId) {
        this.Id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dateofbirth=" + dateofbirth +
                '}';
    }
}