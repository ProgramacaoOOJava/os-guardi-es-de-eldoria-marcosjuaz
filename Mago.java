public class Mago extends Personagem {
    // Atributos próprios do Mago
    int inteligencia;
    int mana;
    String elementoMagico;
    
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, int inteligencia, int mana, String elementoMagico) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
        this.mana = mana;
        this.elementoMagico = elementoMagico;
    }
    
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + nome + " lança Bola de Fogo!");
    }    
    
}