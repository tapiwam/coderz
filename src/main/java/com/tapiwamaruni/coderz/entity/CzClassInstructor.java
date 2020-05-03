package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "c_class_instructor")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzClassInstructor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private CzUser user;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CzClass clazz;

    @Column(name = "owner")
    private Boolean isOwner;

    @Column(name = "created_ts")
    private String createdTimestamp;

    @Override
    public String toString() {
        return "CzClassInstructor{" +
                "id=" + id +
                ", user=" + (user != null ? user.getUserName() : null ) +
                ", clazz=" + (clazz != null ? clazz.getName() : null) +
                ", isOwner=" + isOwner +
                ", createdTimestamp='" + createdTimestamp + '\'' +
                '}';
    }
}
