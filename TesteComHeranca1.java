public class TesteComHeranca1{
    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.nota1 = 7;
        aluno.nota2 = 9;
        aluno.nome = "Jose";
        aluno.idade = 22;
        System.out.printf("Nome: %s, idade: %s\n", aluno.nome, aluno.idade);
    }
}