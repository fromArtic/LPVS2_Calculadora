/**
 *
 * @author Jv Loreti
 */

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AreaDeBotoes extends JPanel implements ActionListener{
    JButton zero;
    JButton um;
    JButton dois;
    JButton tres;
    JButton quatro;
    JButton cinco;
    JButton seis;
    JButton sete;
    JButton oito;
    JButton nove; 
    JButton soma;
    JButton subtracao;
    JButton multiplicacao;
    JButton divisao;
    JButton igual;
    JButton limpar;
    
    ICalculo inter;
    
    public AreaDeBotoes(){
        zero = new JButton ("0");
        um = new JButton ("1");
        dois = new JButton("2");
        tres = new JButton ("3");
        quatro = new JButton ("4");
        cinco = new JButton ("5");
        seis = new JButton ("6");
        sete = new JButton ("7");
        oito = new JButton ("8");
        nove = new JButton ("9");
        soma = new JButton("+");
        subtracao = new JButton ("-");
        multiplicacao = new JButton ("*");
        divisao = new JButton ("/");
        igual = new JButton("=");
        limpar = new JButton ("Limpar");
        
        zero.setFont(new Font("", Font.PLAIN, 25));
        um.setFont(new Font("", Font.PLAIN, 25));
        dois.setFont(new Font("", Font.PLAIN, 25));
        tres.setFont(new Font("", Font.PLAIN, 25));
        quatro.setFont(new Font("", Font.PLAIN, 25));
        cinco.setFont(new Font("", Font.PLAIN, 25));
        seis.setFont(new Font("", Font.PLAIN, 25));
        sete.setFont(new Font("", Font.PLAIN, 25));
        oito.setFont(new Font("", Font.PLAIN, 25));
        nove.setFont(new Font("", Font.PLAIN, 25));
        soma.setFont(new Font("", Font.PLAIN, 25));
        subtracao.setFont(new Font("", Font.PLAIN, 25));
        multiplicacao.setFont(new Font("", Font.PLAIN, 25));
        divisao.setFont(new Font("", Font.PLAIN, 25));
        igual.setFont(new Font("", Font.PLAIN, 25));
        limpar.setFont(new Font("", Font.PLAIN, 18));
        
        zero.setPreferredSize(new Dimension(90, 50));
        um.setPreferredSize(new Dimension(90, 50));
        dois.setPreferredSize(new Dimension(90, 50));
        tres.setPreferredSize(new Dimension(90, 50));
        quatro.setPreferredSize(new Dimension(90, 50));
        cinco.setPreferredSize(new Dimension(90, 50));
        seis.setPreferredSize(new Dimension(90, 50));
        sete.setPreferredSize(new Dimension(90, 50));
        oito.setPreferredSize(new Dimension(90, 50));
        nove.setPreferredSize(new Dimension(90, 50));
        soma.setPreferredSize(new Dimension(90, 50));
        subtracao.setPreferredSize(new Dimension(90, 50));
        multiplicacao.setPreferredSize(new Dimension(90, 50));
        divisao.setPreferredSize(new Dimension(90, 50));
        igual.setPreferredSize(new Dimension(90, 50));
        limpar.setPreferredSize(new Dimension(90, 50));
        
        zero.addActionListener(this);
        um.addActionListener(this);
        dois.addActionListener(this);
        tres.addActionListener(this);
        quatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        sete.addActionListener(this);
        oito.addActionListener(this);
        nove.addActionListener(this);
        soma.addActionListener(this);
        subtracao.addActionListener(this);
        multiplicacao.addActionListener(this);
        divisao.addActionListener(this);
        igual.addActionListener(this);
        limpar.addActionListener(this);
        
        //1° fileira
        add(um);
        add(dois);
        add(tres);
        add(soma);
        //2° fileira
        add(quatro);
        add(cinco);
        add(seis);
        add(subtracao);
        //3° fileira
        add(sete);
        add(oito);
        add(nove);
        add(multiplicacao);
        //4° fileira
        add(limpar);
        add(zero);
        add(igual);
        add(divisao);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        JButton pressed = (JButton) e.getSource();
        inter.editarCalculo(pressed.getText());
    }
    
    public void setInterface(ICalculo i){
        this.inter = i;
    }
}
