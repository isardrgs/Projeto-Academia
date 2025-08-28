import java.util.Scanner;

class Ficha {
    
    Scanner scn = new Scanner(System.in);

    int matricula, idade;
    double mensalidade;
    String nome, sexo;
    
    void dados (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da matrícula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
        System.out.println("Mensalidade: R$" + this.mensalidade);
        System.out.println("Sexo: " + this.sexo);
    }
    
    void aumentar_valor (double aumentarValor){
        this.mensalidade += aumentarValor;
    }
    
    void calculoMeses (){
        
        double valormeses;
        int meses;
        System.out.println("Deseja calcular a mensalidade de quantos meses? ");
        meses = scn.nextInt();
       valormeses = this.mensalidade * meses;
        System.out.println("O valor da mensalidade por " + meses + " meses é de R$" + valormeses);
    }
}


public class main {
  
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        Ficha ilker = new Ficha ();
        
        System.out.println("Digite o nome: ");
        ilker.nome = scn.next();
        
        System.out.println("Digite o número da matrícula: ");
        ilker.matricula = scn.nextInt();
        
        System.out.println("Digite a idade: ");
        ilker.idade = scn.nextInt();
        
        System.out.println("Digite a mensalidade da matrícula: ");
        ilker.mensalidade = scn.nextDouble();
        
        System.out.println("Digite o sexo (F/M): ");
        ilker.sexo = scn.next();
        
        ilker.dados();
                
                
    }
    
}
