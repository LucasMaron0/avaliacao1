/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao.pkg6;

/**
 *
 * @author lucas
 */
public class Questao {
    
    private String pergunta;
    private String resposta;
    
    private String respostaUser; //resposta digitada pelo usuário
    private String correcao;    //armazena se o usário errou ou acertou a questão
    
    
    private static int totalAcertos;
    private static int totalErros;

   
    
    public Questao(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    
    public String getRespostaUser() {
        return respostaUser;
    }

    //no setRespostaUser, são contabilizados os acertos/erros, imprimido se o usuário acertou ou 
    //errou aquela questão e definida a variavel correcao, para mostrar quais estão corretas ou 
    //erradas sem precisar fazer mais comparações.
    
    public void setRespostaUser(String respostaUser) {
        this.respostaUser = respostaUser;
        
        if (this.respostaUser.equals(resposta)){
            
             Questao.totalAcertos++;
            
             System.out.println("Acertou!\n");
             
             correcao = "(CORRETA)";
            
        }else {
            
            Questao.totalErros++;
            
            System.out.println("Errou!\n");
            
            correcao = "(ERRADA)";
        }
    }

    
    
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
        
        
    }

 
    public static int getTotalAcertos() {
        return totalAcertos;
    }

   

    public static int getTotalErros() {
        return totalErros;
    }

    public String getCorrecao() {
        return correcao;
    }

    
  
        
}
