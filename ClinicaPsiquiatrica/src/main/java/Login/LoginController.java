/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;
import DAO.UsuarioDAO;
import GUI.MedicamentosGUI;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginController {

    public void logarUsuario(GUIlogin GUIlogin) {
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            String usuario = GUIlogin.getusuariotxt().getText();
            String senha = GUIlogin.getsenhatxt().getText();

            boolean loginValido = usuarioDAO.validarlogin(usuario, senha);

            if (loginValido) {
                JOptionPane.showMessageDialog(GUIlogin, "Login realizado com sucesso!");
                
                // Abrir a tela Medicamentos
                MedicamentosGUI medicamentosGUI = new MedicamentosGUI();
                medicamentosGUI.setVisible(true);
                
                // Fechar a tela de login
                GUIlogin.dispose();
            } else {
                JOptionPane.showMessageDialog(GUIlogin, "ERRO! Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(GUIlogin, "Erro ao conectar ao banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

