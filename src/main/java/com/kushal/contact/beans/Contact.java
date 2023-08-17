package com.kushal.contact.beans;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String image;
    private String description;
    @ManyToOne
    private User user;
}
