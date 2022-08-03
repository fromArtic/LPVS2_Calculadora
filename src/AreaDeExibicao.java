/**
 *
 * @author Jv Loreti
 */

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AreaDeExibicao extends JPanel{
    private JTextField exibicao;
    
    public AreaDeExibicao(){
        exibicao = new JTextField(11);
        add(exibicao);
        
        Font bigFont = exibicao.getFont().deriveFont(Font.PLAIN, 40f);
        exibicao.setFont(bigFont);
    }
    
    public void registrarExpr(String expr){
        exibicao.setText(expr);
    }
    
    public String retornarExpr(){
        return exibicao.getText();
    }
}
