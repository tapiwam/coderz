package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "c_class")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzClass {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer classId;

    @Column(name = "term")
    private String term;

    @Column(name = "class_name")
    private String name;

    @Column(name = "section")
    private String section;

    @Column(name = "lang")
    private String lang;

    @Column(name = "passcode")
    private String passcode;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_ts")
    private String createdTimestamp;

    // --

    @OneToMany(mappedBy = "clazz")
    Set<CzClassInstructor> instructors;

    @OneToMany(mappedBy = "clazz", fetch = FetchType.LAZY)
    Set<CzClassRegistration> students;

    @OneToMany(mappedBy = "clazz")
    private List<CzAssignment> assignments;

}
