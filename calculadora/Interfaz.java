import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Interfaz extends JFrame implements ActionListener {

    double one = 0, two = 0, resultado = 0;
    char operacion;
    JLabel campo, campo2;
    JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
    JButton mas, menos, por, entre, igual, punto;

    public Interfaz() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color gris = new Color(200, 200, 200);
        Color blanco = new Color(255, 255, 255);

        // Areas de texto
        /* */ campo = new JLabel("");
        /* */campo.setBackground(gris);
        /* */campo.setBounds(120, 190, 100, 30);
        /* */campo.setFont(new Font("Arial", 1, 14));
        /* */campo.setForeground(new Color(30, 30, 30));
        /* */add(campo);

        /* */campo2 = new JLabel("");
        /* */campo2.setBackground(gris);
        /* */campo2.setBounds(120, 150, 100, 30);
        /* */campo2.setFont(new Font("Arial", 1, 14));
        /* */campo2.setForeground(new Color(30, 30, 30));
        /* */add(campo2);

        // BOTONES
        uno = new JButton("1");
        uno.setBounds(50, 250, 75, 40);
        uno.setFont(new Font("Arial", 1, 12));
        uno.setBackground(blanco);
        add(uno);
        uno.addActionListener(this);

        dos = new JButton("2");
        dos.setBounds(130, 250, 75, 40);
        dos.setFont(new Font("Arial", 1, 12));
        dos.setBackground(blanco);
        add(dos);
        dos.addActionListener(this);

        tres = new JButton("3");
        tres.setBounds(210, 250, 75, 40);
        tres.setFont(new Font("Arial", 1, 12));
        tres.setBackground(blanco);
        add(tres);
        tres.addActionListener(this);

        cuatro = new JButton("4");
        cuatro.setBounds(50, 300, 75, 40);
        cuatro.setFont(new Font("Arial", 1, 12));
        cuatro.setBackground(blanco);
        add(cuatro);
        cuatro.addActionListener(this);

        cinco = new JButton("5");
        cinco.setBounds(130, 300, 75, 40);
        cinco.setFont(new Font("Arial", 1, 12));
        cinco.setBackground(blanco);
        add(cinco);
        cinco.addActionListener(this);

        seis = new JButton("6");
        seis.setBounds(210, 300, 75, 40);
        seis.setFont(new Font("Arial", 1, 12));
        seis.setBackground(blanco);
        add(seis);
        seis.addActionListener(this);

        siete = new JButton("7");
        siete.setBounds(50, 350, 75, 40);
        siete.setFont(new Font("Arial", 1, 12));
        siete.setBackground(blanco);
        add(siete);
        siete.addActionListener(this);

        ocho = new JButton("8");
        ocho.setBounds(130, 350, 75, 40);
        ocho.setFont(new Font("Arial", 1, 12));
        ocho.setBackground(blanco);
        add(ocho);
        ocho.addActionListener(this);

        nueve = new JButton("9");
        nueve.setBounds(210, 350, 75, 40);
        nueve.setFont(new Font("Arial", 1, 12));
        nueve.setBackground(blanco);
        add(nueve);
        nueve.addActionListener(this);

        cero = new JButton("8");
        cero.setBounds(130, 400, 75, 40);
        cero.setFont(new Font("Arial", 1, 12));
        cero.setBackground(blanco);
        add(cero);
        cero.addActionListener(this);

        punto = new JButton("C");
        punto.setBounds(50, 400, 75, 40);
        punto.setFont(new Font("Arial", 1, 12));
        punto.setBackground(gris);
        add(punto);
        punto.addActionListener(this);

        // BOTONES OPERACIONALES
        mas = new JButton("+");
        mas.setBounds(210, 400, 75, 40);
        mas.setFont(new Font("Arial", 1, 12));
        mas.setBackground(gris);
        add(mas);
        mas.addActionListener(this);

        menos = new JButton("-");
        menos.setBounds(290, 350, 75, 40);
        menos.setFont(new Font("Arial", 1, 12));
        menos.setBackground(gris);
        add(menos);
        menos.addActionListener(this);

        por = new JButton("x");
        por.setBounds(290, 250, 75, 40);
        por.setFont(new Font("Arial", 1, 12));
        por.setBackground(gris);
        add(por);
        por.addActionListener(this);

        entre = new JButton("/");
        entre.setBounds(290, 300, 75, 40);
        entre.setFont(new Font("Arial", 1, 12));
        entre.setBackground(gris);
        add(entre);
        entre.addActionListener(this);

        igual = new JButton("=");
        igual.setBounds(290, 400, 75, 40);
        igual.setFont(new Font("Arial", 1, 12));
        igual.setBackground(new Color(100, 190, 255));
        add(igual);
        igual.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        // EVENTOS DE LOS BOTONES NUMERICOS
        if (e.getSource() == uno) {
            campo.setText(campo.getText() + "1");
        } else if (e.getSource() == punto) {
            campo.setText("");
            campo2.setText("");
        } else if (e.getSource() == dos) {
            campo.setText(campo.getText() + "2");
        } else if (e.getSource() == tres) {
            campo.setText(campo.getText() + "3");
        } else if (e.getSource() == cuatro) {
            campo.setText(campo.getText() + "4");
        } else if (e.getSource() == cinco) {
            campo.setText(campo.getText() + "5");
        } else if (e.getSource() == seis) {
            campo.setText(campo.getText() + "6");
        } else if (e.getSource() == siete) {
            campo.setText(campo.getText() + "7");
        } else if (e.getSource() == ocho) {
            campo.setText(campo.getText() + "8");
        } else if (e.getSource() == nueve) {
            campo.setText(campo.getText() + "9");
        } else if (e.getSource() == cero) {
            campo.setText(campo.getText() + "0");

            // EVENTOS DE BOTONES OPERACIONALES
        }

        if (campo2.getText() == "") {
            if (e.getSource() == mas) {
                campo2.setText(campo.getText());
                campo.setText("");
                operacion = '+';
            } else if (e.getSource() == menos) {
                campo2.setText(campo.getText());
                campo.setText("");
                operacion = '-';
            } else if (e.getSource() == por) {
                campo2.setText(campo.getText());
                campo.setText("");
                operacion = '*';
            } else if (e.getSource() == entre) {
                campo2.setText(campo.getText());
                campo.setText("");
                operacion = '/';
            }
        } else if (e.getSource() == igual) {
            one = Integer.parseInt(campo2.getText());
            two = Integer.parseInt(campo.getText());

            switch (operacion) {
                case '+':
                    resultado = one + two;
                    break;
                case '-':
                    resultado = one - two;
                    break;
                case '*':
                    resultado = one * two;
                    break;
                case '/':
                    resultado = one / two;
                    break;
                default:
                    break;
            }
            campo.setText("");
            campo2.setText("" + resultado);
        }
    }

    public static void main(String args[]) {
        Interfaz interfaz = new Interfaz();
        interfaz.setBounds(0, 0, 400, 500);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}