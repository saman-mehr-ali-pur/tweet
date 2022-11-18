package model;

import javax.persistence.*;
@Entity
@Table(name="tweet")

public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="tweet",columnDefinition = "varchar(280)")
    private String text;

    @ManyToOne
    //@JoinColumn(name="u_id",referencedColumnName = "t_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
