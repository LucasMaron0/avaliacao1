/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    
   // Array para armazenar questões. Objetos do tipo Questao possuem dois atributos
   // a pergunta e a resposta, o Array foi declarado na Main para ter acesso em todos os métodos.
    static  ArrayList<Questao> questoes = new ArrayList();
    
   

   
    public static void main(String[] args) {
        
        
        //variáveis para contar total de erros/acertos, o código também pede um nome de usuário
        
        int totalAcertos = 0;
        int totalErros = 0;
        String User;
        
       
        
        Scanner respostaDigitada = new Scanner(System.in);
        
        
        // criando questões atráves do método criaQuestao, basta passar primeiramente a pergunta e depois a resposta correta.
        
        criaQuestao("Qual é a capital do RS?", "Porto Alegre");
        criaQuestao("Quanto é 5x7?", "35");
        criaQuestao("Qual a distância entra a Lua e a terra?", "384400km");
        criaQuestao("Qual a velocidade da luz (Km/s)?", "299.792");
        criaQuestao("Quanto é 15/3?", "5");
        criaQuestao("Quanto é 95* 4", "380");
        
        
        System.out.println("Qual o seu nome: ");
        User = respostaDigitada.nextLine();
        
        
        // laço para mostrar as questões, pegar o input do usuário e  dizer se ele acertou ou nao.
        // se acertar soma +1 aos acertos, se errar, aos erros.
        
        for (int i = 0; i <questoes.size(); i++){
            
            System.out.println(questoes.get(i).getPergunta());
            String respostaUser = respostaDigitada.nextLine();
            
            if ( respostaUser.equals(questoes.get(i).getResposta())){
                System.out.println("Acertou!\n");
                totalAcertos++;
      
            }else {
                System.out.println("errou\n");
                totalErros++;
            }
    
        }
        
        
        // depois de percorrer todas as questões, imprime os resultados.
        
        System.out.println(User);
        System.out.println("Total de acertos: " + totalAcertos);
        System.out.println("Total de erros: " +   totalErros);
        
   
    }
   
    // método que cria questao e a adiciona no array.
    
    public static void criaQuestao (String pergunta, String resposta){
 
        Questao questao = new Questao (pergunta, resposta);
        questoes.add(questao);
 
    }
    
    
    
}

