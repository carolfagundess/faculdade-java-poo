/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplotela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class ExemploTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame tela = new JFrame("Primeira tela");

        //configurando tela
        tela.setSize(640, 480);

        //posiciona a janela no centro da tela
        tela.setLocationRelativeTo(null);

        //definindo um layout
        tela.setLayout(new GridLayout(2, 2));

        //criando componentes
        JLabel label1 = new JLabel("Label 1");
        tela.add(label1, BorderLayout.NORTH);

        JButton button1 = new JButton("Botao 1");
        tela.add(button1, BorderLayout.WEST);

        JLabel label2 = new JLabel("Label 2");
        tela.add(label2, BorderLayout.SOUTH);

        JButton button2 = new JButton("Botao 1");
        tela.add(button2, BorderLayout.CENTER);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(tela, "Você clicou no botão 2");
            }
        });

        tela.setVisible(true);

    }

}
