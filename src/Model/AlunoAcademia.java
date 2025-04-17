/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Instrutor
 */
public class AlunoAcademia {
    String nomeAluno;
    double pesoAluno;
    double AlturaAluno;

    public AlunoAcademia(String nomeAluno, double pesoAluno, double AlturaAluno) {
        this.nomeAluno = nomeAluno;
        this.pesoAluno = pesoAluno;
        this.AlturaAluno = AlturaAluno;
    }
    
    public double  calcularIMC(){
        return pesoAluno /(AlturaAluno * AlturaAluno);
    }
    public void exibirStatus(){
        double imc = calcularIMC();
        System.out.println("Nome: " + nomeAluno);
        System.err.println("imc: " + imc );
        
        if (imc < 18.5){
            System.out.println("abaixo do peso");
        }
        else if (imc < 25){
            System.out.println("peso normal");   
        } else if (imc < 30){
            System.out.println("sobrepeso");

        }
        else {
            System.out.println("obesidade");
        }
    }
}
