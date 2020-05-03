package com.tapiwamaruni.coderz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "c_class_registration")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CzClassRegistration {

    @Id
    @Column(name = "reg_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer registrationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private CzUser user;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CzClass clazz;

    @Column(name = "active")
    private Boolean isActive;

    @Column(name = "created_ts")
    private String createdTimestamp;

    @Override
    public String toString() {
        return "CzClassRegistration{" +
                "registrationId=" + registrationId +
                ", user=" + (user != null ? user.getUserName() : null ) +
                ", clazz=" + (clazz != null ? clazz.getName() : null) +
                ", isActive=" + isActive +
                ", createdTimestamp='" + createdTimestamp + '\'' +
                '}';
    }
}
