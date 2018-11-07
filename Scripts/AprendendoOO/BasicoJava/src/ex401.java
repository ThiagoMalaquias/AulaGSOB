import static javax.swing.JOptionPane.showMessageDialog; //Exibir mensagens
import static javax.swing.JOptionPane.showInputDialog; //receber dados do usiario
import static java.lang.Integer.parseInt; //Converter String -> int
import static java.lang.Float.parseFloat; //Converter String -> float
import static java.lang.String.valueOf;//??? -> string

public class ex401{

    public static void main(String[] args) {
        int qtdQuantidades = 10;
    int[] A = new int[qtdQuantidades];
    int[] B = new int[qtdQuantidades];
    
    //recebendo dados do Array
        for (int i = 0; i < qtdQuantidades; i++) {
            A[i] = receberInt("Digite o "+ (i+1)+ "º Numero:");
        }
    //exibindo dados
    
        for (int i = 0; i < qtdQuantidades; i++) {
            if (A[i]%2==0) {
                B[i] = A[i]*5;
            }
            else{
                B[i] = A[i]+5;
            }
        }
               
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
    
    public static void exibir(String messagemProUsuario) {
        showMessageDialog(null, messagemProUsuario);
    }
}