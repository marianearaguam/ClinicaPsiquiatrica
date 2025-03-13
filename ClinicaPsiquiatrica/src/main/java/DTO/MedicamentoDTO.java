/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
package DTO;

public class MedicamentoDTO {
    private int idMedicamento;
    private String nome;
    private String descricao;
    private String quantidadeEstoque;
    private String preco;
    private String fornecedor;
    private String dataValidade;
    
//define um construtor. recebe vários parâmetros e inicializa os atributos da classe com os valores fornecidos.
    public MedicamentoDTO(int idMedicamento, String nome, String descricao, String quantidadeEstoque, String preco, String fornecedor, String dataValidade) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.dataValidade = dataValidade;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}