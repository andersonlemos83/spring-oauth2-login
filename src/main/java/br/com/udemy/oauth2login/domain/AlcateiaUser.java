package br.com.udemy.oauth2login.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
@Builder
public class AlcateiaUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @Column(name = "login", nullable = false, length = 1000, unique = true)
    private String login;

    @Column(name = "pass", nullable = false, length = 1000)
    private String pass;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
}