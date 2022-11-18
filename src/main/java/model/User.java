package model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    private Long id ;
    @Column(name="user_name" , unique = true)
    private String userName;
    @Column(name="name" )
    private String name;
    @Column(name="passWord")
    private String passWord;
    @OneToMany
    @JoinColumn(name = "t_id",referencedColumnName = "text")
    private List<Tweet> myTweets = new ArrayList<Tweet>();



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
