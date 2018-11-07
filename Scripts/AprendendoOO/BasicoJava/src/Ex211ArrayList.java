import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string
import java.util.*;


public class Ex211ArrayList{
    //método executavel
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        
        int qtdConvidados = receberInt("Digite a quantodade de convidados");
        
        for (int i = 0; i < qtdConvidados; i++) {
            
                nomes.add(
                   showInputDialog("CONTROLE DE CONVIDADOS\n" + "Digite o nome do "+ (i+1)+ "º Convidado")
                );   
                
                idades.add(
                   receberInt(
                           "Agora...\n"+
                           "Digite a idade do " + 
                           nomes.get(i)
                   )
                );
                
                String resposta = "LISTA FINAL DE CONVIDADOS\n";
        
            for (String nome : nomes) {
                resposta += "Nome: " + nome;
            }
            
            resposta += "\n";
            for (Integer idade : idades) {
               resposta += "Idade: " + idades + " ";
            }
            
            resposta += "\n";
            for (Integer idade : idades) {
                resposta += "- Situaçao: " +
                    validaConvidado(idade) + " ";
            }
            exibir(resposta);                                                       
        }                           
    }//main
    
    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        return 0;

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

}//class
