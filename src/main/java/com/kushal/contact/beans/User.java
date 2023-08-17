package com.kushal.contact.beans;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private Boolean enabled;
    private String imageUrl;
    @Column(length = 500)
    private String about;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Contact> contactList = new ArrayList<>();
}
