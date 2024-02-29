package aeroauto.com.senac.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull @NotEmpty
    private String nome;
    @NotNull @NotEmpty
    private String ultimonome;
    @NotNull @NotEmpty
    private String email;
    @NotNull @NotEmpty
    private String senha;
@Enumerated(EnumType.STRING)
    private Tipo tipo;

}
