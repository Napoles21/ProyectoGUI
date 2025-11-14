import javax.swing.*;
import java.awt.event.*;

public class Bienvenida extends JFrame {

    public static String texto = "";
    private JTextField campoTexto;
    private JButton botonIngresar;

    public Bienvenida() {
        setLayout(null);
        setTitle("Bienvenida");
        setBounds(300, 200, 350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Ingrese su nombre:");
        label.setBounds(20, 20, 200, 30);
        add(label);

        campoTexto = new JTextField();
        campoTexto.setBounds(20, 60, 200, 30);
        add(campoTexto);

        botonIngresar = new JButton("Ingresar");
        botonIngresar.setBounds(20, 100, 100, 30);
        add(botonIngresar);

        botonIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = campoTexto.getText().trim();
                Licencia licencia = new Licencia();
                licencia.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Bienvenida ventana = new Bienvenida();
                ventana.setVisible(true);
            }
        });
    }
}
