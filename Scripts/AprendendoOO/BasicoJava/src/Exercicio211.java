import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string

public class Exercicio211{
    public static void main(String[] args) {
         //exibir(" " + idadeConvidado);//forma1
        //exibir(valueOf(idadeConvidado));//forma2
        
        int qtdQuantidades = 5; //deixar com 20
        int[] idades = new int[qtdQuantidades];
        String[] nome = new String[qtdQuantidades];
        
        //recebendo dados do Array
        for (int i = 0; i < qtdQuantidades; i++) {
            nome[i] = receberString("CONTROLE DE CONVIDADOS\n" + "Digite o nome do "+ (i+1)+ "º Convidado");         
        } 
        
        for (int i = 0; i < qtdQuantidades; i++) {
            idades[i] = receberInt("CONTROLE DE CONVIDADOS\n"+ "Digite a idade do "+ (i+1)+ "º Convidado");         
        }   
        
        //exibir resultado
        String resposta = "LISTA FINAL DE CONVIDADOS\n";
        
        for (int i = 0; i < idades.length; i++) {
            resposta += "Nome: " + nome[i]+
                    "Idade: " + idades[i] + "- Situaçao: " +
                    validaConvidado(idades[i]) + "\n";
            
        }    
        exibir(resposta);
    }
    
    public static int receberInt(String mensagemProUsuario) {
       String aux = showInputDialog(mensagemProUsuario); 
       try{
         return parseInt(aux);  
       }catch(Exception e){
           exibir("Você digitou algo errado:(");
           return 0;
       }
       
    }
    
     public static String receberString(String mensagemProUsuario) {
       String aux = showInputDialog(mensagemProUsuario); 
       return aux;       
    }
    
    public static void exibir(String messagemProUsuario) {
        showMessageDialog(null, messagemProUsuario);
    }
    
    public static String validaConvidado(int idadeConvidado) {
        String msg = " ";
        if (idadeConvidado>=15 && idadeConvidado<=17) {
            msg = "Voçê pode entar na festa";
        }else{
            msg = "Sai fora bicão";
        }
        return msg;
    }
}