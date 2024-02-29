package aeroauto.com.senac.dto;

import jakarta.validation.constraints.NotNull;
public class LoginDTO {

   @NotNull
    private String email;
@NotNull
    private String senha;
@NotNull
    public String getEmail() {
        return email;
    }
@NotNull
    public void setEmail(String email) {
        this.email = email;
    }
@NotNull
    public String getSenha() {
        return senha;
    }
    @jakarta.validation.constraints.NotNull
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

