public class Main {
    public static void main(String[] args) {
        Elevador elevadorEntrada = new Elevador(5, 8);
        Elevador elevadorAtrio = new Elevador(7, 12);
        Elevador elevadorBiblioteca = new Elevador(4, 6);

        // Simulação do funcionamento do elevador da Entrada
        System.out.println("Elevador da Entrada:");
        elevadorEntrada.entra();
        elevadorEntrada.sobe();
        elevadorEntrada.entra();
        elevadorEntrada.entra();
        elevadorEntrada.sobe();
        elevadorEntrada.sai();
        elevadorEntrada.desce();
        elevadorEntrada.exibirStatus();

        // Simulação do funcionamento do elevador do Átrio
        System.out.println("\nElevador do Átrio:");
        elevadorAtrio.entra();
        elevadorAtrio.entra();
        elevadorAtrio.sobe();
        elevadorAtrio.sobe();
        elevadorAtrio.sai();
        elevadorAtrio.sai();
        elevadorAtrio.desce();
        elevadorAtrio.exibirStatus();

        // Simulação do funcionamento do elevador da Biblioteca
        System.out.println("\nElevador da Biblioteca:");
        elevadorBiblioteca.entra();
        elevadorBiblioteca.sobe();
        elevadorBiblioteca.sobe();
        elevadorBiblioteca.sai();
        elevadorBiblioteca.desce();
        elevadorBiblioteca.exibirStatus();
    }
}