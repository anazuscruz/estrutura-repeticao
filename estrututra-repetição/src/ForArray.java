public class ForArray {
    public static void main(String[] args) {
        
        //em arrays o indice inicia em ZERO
        String alunos [] = {"Suzana", "Lucia", "Maria", "Ilan"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
