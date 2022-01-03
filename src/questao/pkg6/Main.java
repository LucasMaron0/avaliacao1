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
        
        
        //o código também pede um nome de usuário

        String User;
        
       
        
        Scanner respostaDigitada = new Scanner(System.in);
        
        
        // criando questões atráves do método criaQuestao, basta passar primeiramente a pergunta e depois a resposta correta.
        
        criaQuestao("Qual é a capital do RS?", "Porto Alegre");
        criaQuestao("Quanto é 5x7?", "35");
        criaQuestao("Qual a distância entra a Lua e a terra?", "384400km");
        criaQuestao("Qual a velocidade da luz (Km/s)?", "299.792");
        criaQuestao("Quanto é 15/3?", "5");
        criaQuestao("Quanto é 95* 4?", "380");
        
        
        System.out.println("Qual o seu nome: ");
        User = respostaDigitada.nextLine();
        
        
        // laço para mostrar as questões, pegar o input do usuário e  dizer se ele acertou ou nao.
        // ao passar a resposta do usuário, a classe Questao define todo o resto (contabiliza acertos/erros, exibe o resutlado, etc)
          
        for (Questao q:questoes){
            
            System.out.println(q.getPergunta());
            String respostaUser = respostaDigitada.nextLine();
            q.setRespostaUser(respostaUser);
  
            }
    

        // depois de percorrer todas as questões, imprime os resultados.
        
        System.out.println(User);
        System.out.println("Total de acertos: " + Questao.getTotalAcertos());
        System.out.println("Total de erros: " +   Questao.getTotalErros());
        System.out.println("\n\n");
        
        // pergunta se o usuário deseja ver o gabarito
        
        System.out.println("Deseja ver o gabarito? (s/n) ");
        
            if(respostaDigitada.nextLine().equals("s")){
               
                gabarito();
            }else{
                
                System.out.println("Programa fechado...");
            }
                
  
    }
   
    // método que cria questao e a adiciona no array.
    
    public static void criaQuestao (String pergunta, String resposta){
 
        Questao questao = new Questao (pergunta, resposta);
        questoes.add(questao);
 
    }
    
    
    // método para mostrar o gabarito (quais o usuario errou e as repostas certas)
   
    public static void gabarito(){
        
        for (Questao q:questoes){
            
            System.out.println(q.getCorrecao() +
                    " " + q.getPergunta()+ 
                    " -- Respsota Correta: " + q.getResposta()+
                    " -- Sua resposta: " + q.getRespostaUser()+ "\n");

        }
        
    }
    
    
}

