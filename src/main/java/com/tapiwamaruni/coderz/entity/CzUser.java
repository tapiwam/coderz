package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzUser {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass")
    private String password;

    @Column(name = "created_ts")
    private String createdTimestamp;

}
