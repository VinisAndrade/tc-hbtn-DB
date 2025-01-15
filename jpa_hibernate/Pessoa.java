// Pessoa.java
package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    // Getters e setters
}
