public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("=== Reprodutor Musical ===");
        meuIphone.selecionarMusica("Imagine Dragons - Believer");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("1191234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n=== Navegador na Internet ===");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}