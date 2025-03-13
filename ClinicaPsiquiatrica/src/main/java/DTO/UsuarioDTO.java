/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author carlo
*/

public class UsuarioDTO {
    private int id;
    private String usuario;  // Ajustado para coincidir com o banco
    private String senha;

    //construtor da classe
    public UsuarioDTO(int id, String usuario, String senha) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
    }
    
//Retorna o identificador do usuário.
    public int getId() {
        return id;
    }
//Obtém e define o nome de usuário.
    public String getUsuario() {  // Ajustado
        return usuario;
    }

    public void setUsuario(String usuario) {  // Ajustado
        this.usuario = usuario;
    }
//Obtém e define a senha do usuário.
    public String getSenha() {  // Ajustado
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
