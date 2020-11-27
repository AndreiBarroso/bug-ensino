package com.example.demo.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "T_PESSOA")
@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_ORGANIZACAO", nullable = true, foreignKey = @ForeignKey(name = "PESSOA_ORGANIZACAO_FK"))
    private Organizacao organizacao;
}
