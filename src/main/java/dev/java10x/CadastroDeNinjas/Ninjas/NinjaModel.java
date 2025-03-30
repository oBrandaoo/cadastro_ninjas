package dev.java10x.CadastroDeNinjas.Ninjas;

import java.util.*;

import org.hibernate.annotations.ManyToAny;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;   
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


    
}
