package com.spring.security.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Builder
    public User(
            String username,
            String password,
            String email,
            String role,
            String provider,
            String providerId,
            Timestamp createdDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
        this.createdDate = createdDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
        private String role; // GENERAL_USER, MANAGER, ADMIN

    // OAuth 에 대한 정보
    private String provider;
    private String providerId;

    @CreationTimestamp
    private Timestamp createdDate;

}
