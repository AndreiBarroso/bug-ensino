package com.example.demo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "T_ORGANIZACAO")
@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID_ORGANIZACAO")
    private Long id;

    private String nome;
}
