package execao;

public class TesteExecaoChecadaEnaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    // para lancar o erro precisa usar o throw
    // para poder lancar a execao
    // não checada e não verificada
    static void geraErro1() {
      throw new RuntimeException("Ocorreu erro 1");
    }

    // checada e verificada
    // usa a palavara throws no metodo para dizer que essa funcao vai
    // gerar essa execao
    static void geraErro2() throws Exception {
      throw new Exception("Ocorreu erro 1");
    }
}
