public class iPhone extends AparelhoTelefonico implements Navegador, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("musica selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("pagina carregada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("recarregando...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba aberta");
    }

    @Override
    public void adicionarAosFavoritos() {
        System.out.println("adicionado com sucesso");
    }

    @Override
    public void ligar() {    
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("ctt atendido");
    }

    @Override
    public void mudarVolume() {
        System.out.println("volume alterado");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz");
    }

}
