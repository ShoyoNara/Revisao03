
package revisao03;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Revisao03 {

  
    public static void main(String[] args) {
        /*Alguns países medem temperaturas em graus Celsius, e outros em 
graus Fahrenheit. Faça um algoritmo para ler uma temperatura Celsius e 
imprimi-Ia em Fahrenheit (pesquise como fazer este tipo de conversão).

Para converter graus Celsius em graus Fahrenheit, multiplique por 1,8 
e adicione 32. \ */
        
        double GrausC , GrausF;
        
       GrausC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Graus celsius: °"));
       
       GrausF = GrausC * 1.8 + 32;
       
       JOptionPane.showMessageDialog(null, "O valor trocado em Fahrenheit será de : °"+GrausF);
        
        
    }
    
}
