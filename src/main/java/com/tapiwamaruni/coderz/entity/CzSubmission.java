package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "c_class_submission")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzSubmission {

    @Id
    @Column(name = "submission_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer submissionId;

    @ManyToOne
    @JoinColumn(name = "reg_id")
    private CzClassRegistration registered;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private CzAssignment assignment;

    @Column(name = "status")
    private String status;

    @Column(name = "created_ts")
    private ZonedDateTime createdTimestamp;

    @Override
    public String toString() {
        return "CzSubmission{" +
                "submissionId=" + submissionId +
                ", registered=" + (registered != null ? registered.getRegistrationId() : null) +
                ", assignment=" + (assignment  != null ? assignment.getName() : null)+
                ", status='" + status + '\'' +
                ", createdTimestamp=" + createdTimestamp +
                '}';
    }
}
