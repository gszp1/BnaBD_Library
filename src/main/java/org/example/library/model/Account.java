package org.example.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;

    @Column(unique = true, nullable = false, length = 255)
    private String login;

    @Column(nullable = false)
    private Byte enabled;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 255)
    private String role;

    @Column(name = "user_data_id")
    private Long userDataId;

    protected Account() {}

    public Account(String login, Byte enabled, String password, String role, Long userDataId) {
        this.login = login;
        this.enabled = enabled;
        this.password = password;
        this.role = role;
        this.userDataId = userDataId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserDataId() {
        return userDataId;
    }

    public void setUserDataId(Long userDataId) {
        this.userDataId = userDataId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", enabled=" + enabled +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", userDataId=" + userDataId +
                '}';
    }
}