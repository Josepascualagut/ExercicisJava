import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ventanita extends JFrame {

    void start(){

        JLabel jLabel = new JLabel ( "?");
        jLabel.setBounds( 0, 0, 200, 200);
        jLabel.setFont(new Font("sans" , Font.BOLD, 128));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton jButton = new JButton ( "Tirar");
        jButton.setBounds( 0, 200, 186, 200);
        jLabel.setFont(new Font("sans" , Font.BOLD, 64));

        Object cambiarTexto;
        jButton.addActionListener(a -> cambiarTexto(jLabel));
        jLabel.setText("H");

        add(jLabel);
        add(jButton);

        setSize( 200, 400);
        setLayout(null);
        setVisible(true);
     }

    private void cambiarTexto(JLabel jLabel) {
        jLabel.setText(obtenirNumero());
    }

    String obtenirNumero(){
        Random random = new Random();
        int numero = random.nextInt( 6 ) +1;

        if (numero == 1) return "speed";
        else if (numero ==2) return "harley";
        else if (numero ==3) return "xxx";

        return "torna a tirar";
    }
}
