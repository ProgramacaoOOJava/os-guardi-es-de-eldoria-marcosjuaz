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
        
         // Criando o grupo
        Grupo grupo = new Grupo();
        
        // Criando personagens e adicionando ao grupo
        Guerreiro conan = new Guerreiro("Conan", 5, 150, 75.5, 30, 50);
        Mago merlin = new Mago("Merlin", 7, 90, 85.0, 40, 100, "Fogo");
        Guerreiro xena = new Guerreiro("Xena", 6, 180, 80.0, 35, 60);
        Mago gandalf = new Mago("Gandalf", 8, 95, 90.0, 45, 120, "Luz");
        Guerreiro kratos = new Guerreiro("Kratos", 15, 300, 120.0, 70, 100);
        
        // Adicionando ao grupo
        grupo.adicionarPersonagem(conan);
        grupo.adicionarPersonagem(merlin);
        grupo.adicionarPersonagem(xena);
        grupo.adicionarPersonagem(gandalf);
        grupo.adicionarPersonagem(kratos);
        
        System.out.println("\n" + "=".repeat(60));
        
        // Listando todos os personagens do grupo
        grupo.listarPersonagens();

        System.out.println("=".repeat(60));
        
        // Exibindo status e habilidades de cada personagem
        System.out.println("\n=== STATUS E HABILIDADES ===\n");
        for (Personagem p : grupo.getMembros()) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));

         // ===== CHAMANDO O MÉTODO BATALHAR =====
        System.out.println("\n=== BATALHAS ENTRE PERSONAGENS ===\n");
        
        // Batalha 1: Conan vs Merlin
        System.out.println("🔹 BATALHA 1:");
        grupo.batalhar(conan, merlin);
        
        // Batalha 2: Xena vs Gandalf
        System.out.println("\n🔹 BATALHA 2:");
        grupo.batalhar(xena, gandalf);
        
        // Batalha 3: Kratos vs Conan
        System.out.println("\n🔹 BATALHA 3:");
        grupo.batalhar(kratos, conan);
        
        // Batalha 4: Merlin vs Gandalf
        System.out.println("\n🔹 BATALHA 4:");
        grupo.batalhar(merlin, gandalf);
        
        // Batalha 5: Xena vs Kratos
        System.out.println("\n🔹 BATALHA 5:");
        grupo.batalhar(xena, kratos);


    }

}
