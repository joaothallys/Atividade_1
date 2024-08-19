import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class novo {
    private JPanel panel1;
    private JRadioButton mais;
    private JRadioButton menos;
    private JRadioButton vezes;
    private JRadioButton dividir;
    private JButton botao_1;
    private JTextField valor_1;
    private JTextField valor_2;
    JPanel painelPrincipal;

    public novo() {
        botao_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(valor_1.getText().isEmpty() || valor_2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Os campos de valor não podem estar vazios");
                } else {
                    try {
                        double num1 = Double.parseDouble(valor_1.getText());
                        double num2 = Double.parseDouble(valor_2.getText());
                        double resultado = 0;

                        if (mais.isSelected()) {
                            resultado = num1 + num2;
                        } else if (menos.isSelected()) {
                            resultado = num1 - num2;
                        } else if (vezes.isSelected()) {
                            resultado = num1 * num2;
                        } else if (dividir.isSelected()) {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                JOptionPane.showMessageDialog(null, "não e possivel dividir");
                                return;
                            }
                        }

                        System.out.println("Resultado: " + resultado);
                        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Numeros invalidos");
                    }
                }
            }
        });
    }
}
