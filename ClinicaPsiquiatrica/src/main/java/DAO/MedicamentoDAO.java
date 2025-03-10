/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import ConexaoBD.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DTO.MedicamentoDTO;

public class MedicamentoDAO {
    private final Connection connection;

    public MedicamentoDAO() throws SQLException {
        this.connection = Conexao.getConnection(); // Usando a classe Conexao para obter a conexão
    }

    // Método para adicionar um medicamento
    public void adicionarMedicamento(MedicamentoDTO medicamento) {
        String query = "INSERT INTO medicamentos (nome, descricao, quantidadeEstoque, preco, fornecedor, dataValidade) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, medicamento.getNome());
            pst.setString(2, medicamento.getDescricao());
            pst.setString(3, medicamento.getQuantidadeEstoque()); // Usando String
            pst.setString(4, medicamento.getPreco()); // Usando String
            pst.setString(5, medicamento.getFornecedor());
            pst.setString(6, medicamento.getDataValidade());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao adicionar medicamento: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para listar todos os medicamentos
    public List<MedicamentoDTO> listarMedicamentos() {
        List<MedicamentoDTO> medicamentos = new ArrayList<>();
        String query = "SELECT * FROM medicamentos";
        try (PreparedStatement pst = connection.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                MedicamentoDTO medicamento = new MedicamentoDTO(
                    rs.getInt("idMedicamento"), // idMedicamento é int
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("quantidadeEstoque"), // Usando String
                    rs.getString("preco"), // Usando String
                    rs.getString("fornecedor"),
                    rs.getString("dataValidade")
                );
                medicamentos.add(medicamento);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar medicamentos: " + e.getMessage());
            e.printStackTrace();
        }
        return medicamentos;
    }

    // Método para atualizar um medicamento
    public void atualizarMedicamento(MedicamentoDTO medicamento) {
        String query = "UPDATE medicamentos SET nome = ?, descricao = ?, quantidadeEstoque = ?, preco = ?, fornecedor = ?, dataValidade = ? WHERE idMedicamento = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, medicamento.getNome());
            ps.setString(2, medicamento.getDescricao());
            ps.setString(3, medicamento.getQuantidadeEstoque()); // Usando String
            ps.setString(4, medicamento.getPreco()); // Usando String
            ps.setString(5, medicamento.getFornecedor());
            ps.setString(6, medicamento.getDataValidade());
            ps.setInt(7, medicamento.getIdMedicamento()); // idMedicamento é int
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar medicamento: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para excluir um medicamento
    public void excluirMedicamento(int idMedicamento) { // idMedicamento é int
        String query = "DELETE FROM medicamentos WHERE idMedicamento = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setInt(1, idMedicamento); // idMedicamento é int
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir medicamento: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


