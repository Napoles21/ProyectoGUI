import javax.swing.*;

public class Principal extends JFrame {

    public Principal() {
        setLayout(null);
        setTitle("Principal");
        setBounds(300, 200, 350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel mensaje = new JLabel("Bienvenido, " + Bienvenida.texto);
        mensaje.setBounds(20, 20, 300, 30);
        add(mensaje);
    }
}
