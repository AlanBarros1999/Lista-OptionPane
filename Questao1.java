/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaoptionpane;

/**
 *
 * @author Alan
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao1 {

    /**
     *1) Elabore um programa em Java que receba o nome do
usuário e sua idade. Após a entrada de dados verifique
a idade do usuário respeitando as seguintes
condições:
Se a idade for >= 18, mostre a mensagem:
“Nome do usuário você já pode tirar a CNH”
Caso contrário, mostre a mensagem:
“Nome do usuário você ainda não pode tirar a CNH,
você tem apenas idade do usuário anos.”
     */
    public static void main(String[] args) {     
        
    String nome = JOptionPane.showInputDialog("Qual o seu nome?", JOptionPane.QUESTION_MESSAGE);
    String x = JOptionPane.showInputDialog(null,"Qual a sua Idade?", JOptionPane.QUESTION_MESSAGE);
        
        
    int idade = Integer.parseInt(x);
    
   
    
    if (idade >= 18){
        JOptionPane.showMessageDialog(null, nome + " Você já pode tirar CNH");
    } else{
        JOptionPane.showMessageDialog(null, nome + " Você ainda não pode tirar CNH, você tem apenas" + idade + "anos");
    }
    
      
    }
    
}
