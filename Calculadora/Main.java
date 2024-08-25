import javax.swing.*;
import java.awt.event.*;
import java.lang.classfile.instruction.SwitchCase;
import java.awt.*;
import java.awt.Component.*;

/*Hacer una calculadora basica con interfaz, capaz de realizar las operaciones
 * basicas y mostrar el resultado en pantalla, solo debe mostrar punto 
 * flotante si el resultado lo es. 
 */

public class Main extends JFrame implements ActionListener {

    int operacion = 0;
    JPanel panel, operaciones;
    JButton btnIgual, sum, res, div, mul;
    JTextField areaTexto, areaTexto2;

    public Main() {
        Interfaz();
    }

    // interfaz programa
    public void Interfaz() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int ancho = 400, alto = 200;

        panel = new JPanel();
        setSize(ancho - 10, alto - 10);
        add(panel);

        areaTexto = new JTextField();
        areaTexto.setBounds(0, 0, 400, 90);
        add(areaTexto);
        add(panel);

        areaTexto2 = new JTextField();
        areaTexto2.setBounds(0, 38, 400, 40);
        add(areaTexto2);
        add(panel);

        btnIgual = new JButton("=");
        btnIgual.setBounds(300, 110, 60, 30);
        add(btnIgual);
        add(panel);
        btnIgual.addActionListener(this);

        sum = new JButton("+");
        sum.setSize(50, 25);
        sum.setLocation(5, alto - 100);
        add(sum);
        add(panel);
        sum.addActionListener(this);

        res = new JButton("-");
        res.setSize(50, 25);
        res.setLocation(60, alto - 100);
        add(res);
        add(panel);

        mul = new JButton("x");
        mul.setSize(50, 25);
        mul.setLocation(5, alto - 70);
        add(mul);
        add(panel);

        div = new JButton("/");
        div.setSize(50, 25);
        div.setLocation(60, alto - 70);
        add(div);
        add(panel);

        setSize(ancho, alto);
        setVisible(true);
        setResizable(false);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
    }

    // Operaciones Calculo
    public double Suma(double num1, double num2) {
        double resultado = 0;
        resultado = num1 + num2;
        return resultado;
    }

    public double Resta(double num1, double num2) {
        double resultado = 0;
        resultado = num1 - num2;
        return resultado;
    }

    public double Division(double num1, double num2) {
        double resultado = 0;
        resultado = num1 - num2;
        return resultado;
    }

    public double Multiplicacion(double num1, double num2) {
        double resultado = 0;
        resultado = num1 - num2;
        return resultado;
    }
    // Fin de las operaciones

    // Eventos
    public void actionPerformed(ActionEvent e){
        int valor1 = 0, valor2 = 0, op = 0;
if(areaTexto.getText() != ""){

    if(e.getSource() == sum){
        valor1 = Integer.parseInt(areaTexto.getText());
        areaTexto.setText("");
            op = 1;
        }
        else if(e.getSource() == res){
            valor1 = Integer.parseInt(areaTexto.getText());
            areaTexto.setText("");
            op = 2;
        }
        else if(e.getSource() == mul){
            valor1 = Integer.parseInt(areaTexto.getText());
            areaTexto.setText("");
            op = 3;
        }
        else if(e.getSource() == div){
            valor1 = Integer.parseInt(areaTexto.getText());
            areaTexto.setText("");
            op = 4;
        }
        else if(e.getSource() == btnIgual){
            valor2 = Integer.parseInt(areaTexto.getText());
            areaTexto.setText("Holanda " + valor2 + " " + valor1);
        }
    }
}
    
    public static void main(String args[]) {
        new Main();
    }
}