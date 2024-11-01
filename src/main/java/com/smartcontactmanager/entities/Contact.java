package com.smartcontactmanager.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;
    private String secondName;
    private String imageUrl;
    private String description;
    private String phone;
    private String work;
    private String email;
    @ManyToOne
    private User user;
    public Contact() {
    }

    public Contact(int cId, String name, String secondName, String imageUrl, String description, String phone, String work, String email) {
        this.cId = cId;
        this.name = name;
        this.secondName = secondName;
        this.imageUrl = imageUrl;
        this.description = description;
        this.phone = phone;
        this.work = work;
        this.email = email;
    }


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                ", work='" + work + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                '}';
    }
}
