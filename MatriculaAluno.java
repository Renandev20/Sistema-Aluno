public class MatriculaAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.DigitarId();
        aluno.DigitarnomeMae();
        aluno.DigitarenderecoCompleto();
        aluno.DigitarTelefone();


        aluno.exibirId();
        aluno.exibirNomeMae();
        aluno.exibirEndereco();
        aluno.exibirTelefone();

        Professor pedro = new Professor();
        pedro.DigitarId();
        pedro.DigitarNomeCompleto();
        pedro.DigitarEndereco();
        pedro.DigitarGraduacao();

        pedro.exibirId();
        pedro.exibirNomeCompleto();
        pedro.exibirEndereco();
        pedro.exibirGraduacao();

        SalaAula segundoA = new SalaAula();
        segundoA.DigitarIdSala();
        segundoA.DigitarNumSala();

        





    }
}
