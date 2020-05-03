package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "c_class_assignment")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzAssignment {

    @Id
    @Column(name = "assignment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer assignmentId;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CzClass clazz;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private Boolean isActive;

    @Column(name = "start")
    private ZonedDateTime start;

    @Column(name = "end")
    private ZonedDateTime end;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "updated")
    private ZonedDateTime updated;

    @Column(name = "created_ts")
    private ZonedDateTime createdTimestamp;


}
