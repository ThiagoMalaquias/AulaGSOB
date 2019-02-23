import Exercicos.Mencao;
import static lerexibir.Janela.*;

public class Ex4c2{
    public static void main(String[] args) {
        Mencao prova01,
               prova02,
               prova03,
               prova04;
        
        prova01 = lerMencao("Digite a Menção do 1ºBimestre");
        prova02 = lerMencao("Digite a Menção do 2ºBimestre");
        prova03 = lerMencao("Digite a Menção do 3ºBimestre");
        prova04 = lerMencao("Digite a Menção do 4ºBimestre");
        
        int mediaMencao = (prova01.valorMencao + prova02.valorMencao + prova03.valorMencao + prova04.valorMencao) / 4;
        
        exibir(getMencao(mediaMencao));
             
    }//main
    
    public static Mencao lerMencao(Object mensagem){
        String texto = ler(mensagem).toUpperCase().trim();
        switch (texto) {
            case "MB":
                return Mencao.MB;               
            case "B":
                return Mencao.B;               
            case "R":
                return Mencao.R;               
            default:
                return Mencao.I;  
        }
    }
    
    public static Mencao getMencao(int valorMencao){
        if (valorMencao >= Mencao.MB.valorMencao) {
            return Mencao.MB;
        }
        else if (valorMencao < Mencao.MB.valorMencao && valorMencao >= Mencao.B.valorMencao) {
            return Mencao.B;
        }
        
        else if (valorMencao < Mencao.B.valorMencao && valorMencao >= Mencao.R.valorMencao) {
            return Mencao.R;
        }
        
        else{
            return Mencao.I;
        }
    }
    
}//calss
