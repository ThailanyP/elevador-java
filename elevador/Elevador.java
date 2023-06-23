public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int[] andaresAtendidos;
    private int capacidadeMaxima;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidadeMaxima) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.andaresAtendidos = new int[totalAndares + 1]; // +1 para incluir o térreo
        this.capacidadeMaxima = capacidadeMaxima;
        this.pessoasPresentes = 0;
    }

    public void defineAndaresAtendidos(int[] andaresAtendidos) {
        this.andaresAtendidos = andaresAtendidos;
    }
    

    public int[] getAndaresAtendidos() {
        return andaresAtendidos;
    }

    public void entra() {
        if (pessoasPresentes < capacidadeMaxima) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está vazio. Não há ninguém para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }

    public void exibirStatus() {
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Número de pessoas presentes: " + pessoasPresentes);
    }
}
