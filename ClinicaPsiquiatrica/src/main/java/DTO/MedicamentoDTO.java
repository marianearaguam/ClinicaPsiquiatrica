/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
package DTO;

import java.sql.Date;

public class MedicamentoDTO {
    private int idMedicamento;
    private String nome;
    private String descricao;
    private int quantidadeEstoque;
    private double preco;
    private String fornecedor;
    private Date dataValidade;

    public MedicamentoDTO(String nome1, String descricao1, String quantidadeEstoque1, String preco1, String fornecedor1, String dataValidade1) {}

    public MedicamentoDTO(int idMedicamento, String nome, String descricao, int quantidadeEstoque, double preco, String fornecedor, Date dataValidade) {
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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}