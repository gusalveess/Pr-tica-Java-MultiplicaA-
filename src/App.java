public class App {
    public static void main(String[] args) throws Exception {
        String cabeçalho = "Tabela de multiplicação de X";
        System.out.println(cabeçalho);
    }

    public static void MultiplicaAi(int x) {
        for (int i = 1; i < 11; i++) {
            System.out.println(x * i);
        }
    }
}
