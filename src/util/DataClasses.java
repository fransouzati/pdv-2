/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.NumberFormat;

/**
 *
 * @author Lucas
 */
public class DataClasses {
    
    
    public static float converterMoedaParaFloat(String valor){
        
        String s = valor.replace(",", ".");
        
        if(!valor.isEmpty()){
        int count = s.length() - s.replace(".", "").length();
        
        for(int i=0; i<(count-1); i++ ){
           s = s.replaceFirst("[.]", "");
        }       
    }
        return Float.parseFloat(s.replace("R$ ", ""));
        
    }
    
    public static String converterFloatParaMoeda(float valor, boolean simbolo){
        //DecimalFormat df = new DecimalFormat("###.##0,00");
        //String v = valor.replace(".", ",");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        //Double o = Double.parseDouble( v.replace(",", ".")  );
        //String s = df.format(v);
        String v = (simbolo)? formatoMoeda.format(valor) : formatoMoeda.format(valor).replace("R$ ", "") ;
        return v;
    }
    
    public boolean validarCPF(String cpf) {
        boolean eValido = false; // Assume que o CPF é inválido
        
        cpf = cpf.replaceAll("[^0-9]", "");
                // Os caracteres do CPF
        char[] caracteres = cpf.toCharArray();
                // Transformados em dígitos
        int[] digitos = new int[caracteres.length];
                // Variáveis temporárias
        int somaNove = 0, somaDez = 0;
                // Os dígitos de verificação do CPF
        int digitoDez = 0, digitoOnze = 0;
         
        if (caracteres.length != 11) {
            return eValido; // O CPF deve ter exatamente 11 dígitos.
        }
         
        for (int count = 0; count < caracteres.length; count++) {
            if (!Character.isDigit(caracteres[count])) {
                return eValido; // Se não for um dígito não é um CPF válido.
            }
        }
         
        // Transforma os caracteres em dígitos numéricos
        for (int count = 0; count < caracteres.length; count++) {
            digitos[count] = Character.getNumericValue(caracteres[count]);
            int valor = 0;
            // Soma os nove primeiros dígitos multiplicados 
                        // por um valor determinado.
            if (count < 9) {
                valor = digitos[count] * (11 - (count + 1));
                somaNove += valor;
            }
        }
         
        // Usa a soma para calcular o primeiro dígito verificador.
        digitoDez = 11 - (somaNove % 11);
        if (digitoDez > 9) {
            digitoDez = 0;
        }
         
        // Se o décimo dígito calculado for diferente do décimo dígito passado
        // o CPF não é válido.
        if (digitoDez != digitos[9]) {
            return eValido;
        }
         
        // Soma os 10 primeiros dígitos multiplicados por um valor 
                // determinado.
        for (int count = 0; count < digitos.length; count++) {
            int valor = 0;
            if (count < 10) {
                valor = digitos[count] * (12 - (count + 1));
                somaDez += valor;
            }
        }
         
        // Usa a soma para calcular o segundo dígito verificador.
        digitoOnze = 11 - (somaDez % 11);
        if (digitoOnze > 9) {
            digitoOnze = 0;
        }
         
        // Se o décimo primeiro dígito for diferente do dígito passado, 
        // o CPF não é válido.
        if (digitoOnze != digitos[10]) {
            return eValido;
        }
         
        // Se passou por todos os testes o CPF é válido
        eValido = true;
         
        return eValido;
    }
    
    public static String dataToUS(String data){
        String dataus = "0000-00-00";
        
        if(!data.contains("y")){
            String dd = data.substring(0, 2); //05/12/2009
            String mm = data.substring(3, 5);//1234567890
            String yyy = data.substring(6, 10);
            dataus = yyy + "-" + mm + "-" + dd ;
        }       
        return dataus;
        
    }

}
