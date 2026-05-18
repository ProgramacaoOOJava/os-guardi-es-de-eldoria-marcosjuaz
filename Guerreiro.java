public class Guerreiro extends Personagem {
    // Atributos próprios do Guerreiro
    int forca;
    int armadura;
    
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, int forca, int armadura) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
        this.armadura = armadura;
    }
    
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com Espada Flamenjante");
    }    
}