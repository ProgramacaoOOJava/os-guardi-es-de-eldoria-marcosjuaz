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
        
        // Criando o grupo A
        Grupo grupoA = new Grupo();
        
        // Criando personagens e adicionando ao grupo A
        Guerreiro conan = new Guerreiro("Conan", 5, 150, 75.5, 30, 50);
        Mago merlin = new Mago("Merlin", 7, 90, 85.0, 40, 100, "Fogo");
        Guerreiro xena = new Guerreiro("Xena", 6, 180, 80.0, 35, 60);
        Mago gandalf = new Mago("Gandalf", 8, 95, 90.0, 45, 120, "Luz");
        Guerreiro kratos = new Guerreiro("Kratos", 15, 300, 120.0, 70, 100);
        
        // Adicionando ao grupo
        grupoA.adicionarPersonagem(conan);
        grupoA.adicionarPersonagem(merlin);
        grupoA.adicionarPersonagem(xena);
        grupoA.adicionarPersonagem(gandalf);
        grupoA.adicionarPersonagem(kratos);
        grupoA.listarPersonagens();
        
        System.out.println("\n" + "=".repeat(60));

        // Criando o grupo B
        Grupo grupoB = new Grupo();
        
        // Criando personagens e adicionando ao grupo B
        Guerreiro elenara = new Guerreiro("Elenara", 5, 150, 75.5, 30, 50);
        Mago alaric = new Mago("Alaric", 7, 90, 85.0, 40, 100, "Fogo");
        Guerreiro gideon = new Guerreiro("Gideon", 6, 180, 80.0, 35, 60);
        Mago ignis = new Mago("Ignis", 8, 95, 90.0, 45, 120, "Luz");
        Guerreiro kaelen = new Guerreiro("Kaelen", 15, 300, 120.0, 70, 100);
        
        // Adicionando ao grupo
        grupoB.adicionarPersonagem(elenara);
        grupoB.adicionarPersonagem(alaric);
        grupoB.adicionarPersonagem(gideon);
        grupoB.adicionarPersonagem(ignis);
        grupoB.adicionarPersonagem(kaelen);
        grupoB.listarPersonagens();
        
        System.out.println("\n" + "=".repeat(60));    
       
        

        System.out.println("=".repeat(60));
        
        // Exibindo status e habilidades de cada personagem do grupo A
        System.out.println("\n=== STATUS E HABILIDADES ===\n");
        for (Personagem p : grupoA.getMembros()) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));

          // Exibindo status e habilidades de cada personagem do grupo B
        System.out.println("\n=== STATUS E HABILIDADES ===\n");
        for (Personagem p : grupoB.getMembros()) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println();
        }
        
        System.out.println("=".repeat(60));

        // Chamando método Batalhar
        System.out.println("\n=== BATALHAS ENTRE PERSONAGENS ===\n");
        
        // Batalha 1: Conan vs Merlin
        System.out.println("🔹 BATALHA 1:");
        grupoA.batalhar(conan, merlin);
        
        // Batalha 2: Xena vs Gandalf
        System.out.println("\n🔹 BATALHA 2:");
        grupoA.batalhar(xena, gandalf);
        
        // Batalha 3: Kratos vs Conan
        System.out.println("\n🔹 BATALHA 3:");
        grupoA.batalhar(kratos, conan);
        
        // Batalha 4: Elenara vs Gideon
        System.out.println("\n🔹 BATALHA 4:");
        grupoB.batalhar(elenara, gideon);
        
        // Batalha 5: Alaric vs Kaelen
        System.out.println("\n🔹 BATALHA 5:");
        grupoB.batalhar(alaric, kaelen);


    }

}
