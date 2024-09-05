//ejemplo de vista login para una pagina



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Vista extends JFrame {

    public Vista() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.initComponents();
    }

    private void initComponents() {
        JLabel lblTitulo = new JLabel("Login");
        lblTitulo.setBounds(200, 50, 100, 30);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.WHITE);
        this.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(50, 100, 100, 30);
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 15));
        lblUsuario.setForeground(Color.WHITE);
        this.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 100, 200, 30);
        this.add(txtUsuario);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(50, 150, 100, 30);
        lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
        lblPassword.setForeground(Color.WHITE);
        this.add(lblPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 150, 200, 30);
        this.add(txtPassword);

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(200, 200, 100, 30);
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usuario: " + txtUsuario.getText() + "\nPassword: " + txtPassword.getText());
            }
        });
        this.add(btnIngresar);
        
    }

    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();
        vista.setVisible(true);
    }
}


