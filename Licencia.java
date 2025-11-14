import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Licencia extends JFrame {

    private JCheckBox check;
    private JButton continuar, noAceptar;

    public Licencia() {
        setLayout(null);
        setTitle("Licencia");
        setBounds(300, 200, 450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use the static field from Bienvenida to build the text
        String nombre = Bienvenida.texto;
        check = new JCheckBox("Yo " + nombre + " acepto los términos");
        check.setBounds(20, 20, 380, 30);
        add(check);

        continuar = new JButton("Continuar");
        continuar.setBounds(20, 70, 120, 30);
        continuar.setEnabled(false);
        add(continuar);

        noAceptar = new JButton("No acepto");
        noAceptar.setBounds(160, 70, 120, 30);
        add(noAceptar);

        check.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (check.isSelected()) {
                    continuar.setEnabled(true);
                    noAceptar.setEnabled(false);
                } else {
                    continuar.setEnabled(false);
                    noAceptar.setEnabled(true);
                }
            }
        });

        continuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Principal p = new Principal();
                p.setVisible(true);
                setVisible(false);
            }
        });

        noAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bienvenida b = new Bienvenida();
                b.setVisible(true);
                setVisible(false);
            }
        });
    }
}
