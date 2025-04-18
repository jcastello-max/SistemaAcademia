/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import Model.AlunoAcademia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Instrutor
 */
public class SistemaAcademia {

    private static AlunoAcademia aluno2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList <AlunoAcademia> Alunos = new  ArrayList<>();
        int opcao;
        AlunoAcademia aluno1;
        boolean AlunoAcademia = false;
        
        do{
            System.out.println("\n==== menu da academia ====");
            System.out.println("1. cadastrar Aluno");
            System.out.println("2. lista de Aluno e IMC");
            System.out.println("3. sair");
            System.out.println("Escola uma opção");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("nome: ");
                    String nome = scanner.nextLine();
                    
                    //System.out.println("idade: ");
                    //int idade = scanner.nextLine();
                    
                    System.out.println("peso: ");
                    double peso = scanner.nextDouble();
                    
                    System.out.println("altura: ");
                    double altura = scanner.nextDouble();
                    
                    Alunos.add(new AlunoAcademia(nome, peso, altura));
                    
                  
                    break;
                case 2:
                    if (Alunos.isEmpty()){
                        System.out.println("nenhum aluno cadastrado");
                    }else {
                        System.out.println("\n ---- lista de aluno --- ");
                        for(AlunoAcademia aluno : Alunos){
                            System.out.println(aluno);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("saindo do sistema....");
                    break;
                        
                  
                default:
                    System.out.println("opção invalida");
            }
        
        }while (opcao != 3 );           
            
        
           
       // AlunoAcademia aluno1 = new AlunoAcademia("pedro",85.5,1.75);
        //aluno2 = new AlunoAcademia("Maria",72.4,1.88);
       // AlunoAcademia aluno3 = new AlunoAcademia("josé",120.5,1.75);
        
        
       // aluno1.exibirStatus();
       // aluno2.exibirStatus();
       // aluno3.exibirStatus();
        
    }
    
}
