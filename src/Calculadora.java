/**
 *
 * @author Jv Loreti
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculadora extends JFrame{
    AreaDeExibicao ae;
    AreaDeBotoes ab;
    
    public Calculadora(){
        super("Calculadora");
        
        super.setLayout(new BorderLayout());
        
        ae = new AreaDeExibicao();
        ab = new AreaDeBotoes();
        
        add(ae, BorderLayout.PAGE_START);
        add(ab, BorderLayout.CENTER);
        
        ab.setInterface(new ICalculo(){
            @Override
            public void editarCalculo(String txt){
                String expr = ae.retornarExpr();
                
                if(txt.matches("[0-9]*")){ //Números
                    expr += txt;
                    ae.registrarExpr(expr);
                }else{
                    if(expr.split(" ").length >= 3){ //Exibir resultado (3 elementos: num operador num)
                        expr = realizarCalculo(expr);
                        if(!txt.equals("=")){ //Operação contínua
                            expr += " " + txt + " ";
                        }
                        ae.registrarExpr(expr);
                    }else{
                        if(txt.equals("Limpar")){ //Limpar
                            ae.registrarExpr("");
                        }else{
                            if(expr.split(" ").length != 2){ //Impede a modificação do operador, após inserido
                                expr += " " + txt + " "; //Operações
                                ae.registrarExpr(expr);
                            }
                        }
                    }
                }
            }
        });
        
        super.setSize(400, 330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    
    private String realizarCalculo(String e){
        double resultado = 0;
        String v[] = e.split(" ");
        
        //Converte strings para double e realiza a operação
        switch(v[1]){
            case "+":
                resultado = Double.parseDouble(v[0]) + Double.parseDouble(v[2]); //Soma
                break;
            case "-":
                resultado = Double.parseDouble(v[0]) - Double.parseDouble(v[2]); //Subtração
                break;
            case "*":
                resultado = Double.parseDouble(v[0]) * Double.parseDouble(v[2]); //Multiplicação
                break;
            case "/":
                resultado = Double.parseDouble(v[0]) / Double.parseDouble(v[2]); //Divisão
                break;
        }
        
        return String.valueOf(resultado);
    }
}
