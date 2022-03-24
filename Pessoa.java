public class Pessoa {
    String nome;
    String sobrenome;
    int idade;

    void escreverNome(){
    System.out.println(nome + "  " + sobrenome);
    }



    String nomeSobrenome(){
        String nomecompleto = nome + " " + sobrenome;
        return nomecompleto;
    }
    
}