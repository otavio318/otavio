package alunotraba;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        
        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Matrícula: ");
        aluno.setMatricula(scanner.nextLine());

        System.out.print("Sexo: ");
        aluno.setSexo(scanner.nextLine());

        System.out.print("Data de Nascimento: ");
        aluno.setDataNascimento(scanner.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(scanner.nextLine());

        System.out.print("Ano de Início: ");
        aluno.setAnoInicio(scanner.nextInt());

        System.out.print("Nota Prova 1: ");
        aluno.setNotaProva1(scanner.nextDouble());

        System.out.print("Nota Prova 2: ");
        aluno.setNotaProva2(scanner.nextDouble());

        System.out.print("Média dos Trabalhos: ");
        aluno.setMediaTrabalhos(scanner.nextDouble());

        
        System.out.println("\nMédia Final: " + aluno.calcularMediaFinal());
        if (aluno.estaAprovado()) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

        scanner.close();
    }
}
