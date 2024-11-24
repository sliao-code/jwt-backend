package com.example.demo1.Security;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class UserAccount {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    public UserAccount(){}

    public UserAccount(String username, String password, String email){
        super();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
