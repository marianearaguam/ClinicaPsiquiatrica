/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexaoBD.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DTO.MedicamentoDTO;

public class MedicamentoDAO {
    private final Connection connection;

    public MedicamentoDAO() {
        connection = ConnectionFactory.getConnection(); // Classe e método de conexão com o banco.
    }

    // Método para adicionar um medicamento
    public void adicionarMedicamento(MedicamentoDTO medicamento) {
        try {
            String query = "INSERT INTO medicamentos (nome, descricao, quantidadeEstoque, preco, fornecedor, dataValidade) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setString(1, medicamento.getNome());
                pst.setString(2, medicamento.getDescricao());
                pst.setString(3, medicamento.getQuantidadeEstoque());
                pst.setString(4, medicamento.getPreco());
                pst.setString(5, medicamento.getFornecedor());
                pst.setString(6, medicamento.getDataValidade());
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
        }
    }

    // Método para listar todos os medicamentos
    public List<MedicamentoDTO> listarMedicamentos() {
        List<MedicamentoDTO> medicamentos = new ArrayList<>();
        try {
            String query = "SELECT * FROM medicamentos";
            try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    MedicamentoDTO medicamento = new MedicamentoDTO(
                        rs.getInt("idMedicamento"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("quantidadeEstoque"),
                        rs.getString("preco"),
                        rs.getString("fornecedor"),
                        rs.getString("dataValidade")
                    );
                    medicamentos.add(medicamento);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
        }
        return medicamentos;
    }

    // Método para atualizar um medicamento
    public void atualizarMedicamento(MedicamentoDTO medicamento) {
        try {
            String query = "UPDATE medicamentos SET nome = ?, descricao = ?, quantidadeEstoque = ?, preco = ?, fornecedor = ?, dataValidade = ? WHERE idMedicamento = ?";
            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, medicamento.getNome());
                ps.setString(2, medicamento.getDescricao());
                ps.setString(3, medicamento.getQuantidadeEstoque());
                ps.setString(4, medicamento.getPreco());
                ps.setString(5, medicamento.getFornecedor());
                ps.setString(6, medicamento.getDataValidade());
                ps.setInt(7, medicamento.getIdMedicamento());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
        }
    }

    // Método para excluir um medicamento
    public void excluirMedicamento(int idMedicamento) {
        try {
            String query = "DELETE FROM medicamentos WHERE idMedicamento = ?";
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setInt(1, idMedicamento);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao realizar operação: " + e.getMessage());
        }
    }
}

