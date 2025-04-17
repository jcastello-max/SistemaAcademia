/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import Model.AlunoAcademia;

/**
 *
 * @author Instrutor
 */
public class SistemaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoAcademia aluno1 = new AlunoAcademia("pedro",85.5,1.75);
        AlunoAcademia aluno2 = new AlunoAcademia("Maria",72.4,1.88);
        AlunoAcademia aluno3 = new AlunoAcademia("josé",120.5,1.75);
        
        
        aluno1.exibirStatus();
        aluno2.exibirStatus();
        aluno3.exibirStatus();
        
    }
    
}
