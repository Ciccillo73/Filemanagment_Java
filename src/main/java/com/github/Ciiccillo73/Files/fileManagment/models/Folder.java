package com.github.Ciiccillo73.Files.fileManagment.models;

import javax.persistence.*;

@Entity
@Table(name = "folders")

public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String title;

    @Column
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
