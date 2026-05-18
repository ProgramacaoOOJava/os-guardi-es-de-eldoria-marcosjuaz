import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        /*
        Personagem guerreiroArthur = new Personagem("Arthur", "Guerreiro", 1, 100, 10.5);
        guerreiroArthur.exibirStatus();
        */

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Guerreiro("Conan", 5, 150, 75.5, 30, 50));
        personagens.add(new Mago("Merlin", 7, 90, 85.0, 40, 100, "Fogo"));
        personagens.add(new Guerreiro("Xena", 6, 180, 80.0, 35, 60));
        personagens.add(new Mago("Gandalf", 8, 95, 90.0, 45, 120, "Luz"));
        personagens.add(new Guerreiro("Kratos", 15, 300, 120.0, 70, 100));

        
        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }       
        
    }

}
