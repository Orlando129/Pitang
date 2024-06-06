package com.pitang.springcrud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.validator.constraints.Length;


import java.util.UUID;

@Data
@Entity
@SQLDelete(sql = "UPDATE client SET status = 'Inativo' WHERE id = ?")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID id;

    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID apiKey;
    @Column(name = "nome")
    private String nomeCliente;
    @Column(name = "cnpj")
    private String cnpjCliente;
    @Column(name= "webhook")
    private String webhook;
    @Column(name = "endereco")
    private String enderecoCliente;
    @Column(name = "email")
    private String emailCliente;
    @Column(name = "telefone")
    private String telefoneCliente;
    @Column(name = "credito_pagina")
    private int creditosPaginas;
    @Column(name = "responsavel")
    private String responsavel;


    @Length(max = 10)
    @Pattern(regexp = "Ativo|Inativo")
    private String status = "Ativo" ;


}
