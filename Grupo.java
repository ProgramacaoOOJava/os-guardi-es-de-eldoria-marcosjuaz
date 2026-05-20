import java.util.ArrayList;

public class Grupo {

    private ArrayList<Personagem> membros;

    public Grupo() {
        this.membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    public void listarPersonagens() {  
        for (int i = 0; i < membros.size(); i++) {
            Personagem p = membros.get(i);
            System.out.println((i+1) + ". " + p.nome + 
                             " (Nível " + p.nivel + 
                             ") - " + p.classe);
        }      
        System.out.println();
    }

    public void batalhar(Personagem a, Personagem b) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("⚔️  BATALHA: " + a.nome + " vs " + b.nome + " ⚔️");
        System.out.println("=".repeat(50));
        
        int poderA = a.nivel * (int)a.poderBase;
        int poderB = b.nivel * (int)b.poderBase;

        System.out.println("\n📊 CÁLCULO DE PODER TOTAL:");
        System.out.println(a.nome + " (Nível " + a.nivel + " x Poder " + (int)a.poderBase + ") = " + poderA);
        System.out.println(b.nome + " (Nível " + b.nivel + " x Poder " + (int)b.poderBase + ") = " + poderB);

        System.out.println("\n🎯 RESULTADO:");

        if (poderA > poderB) {
            System.out.println("🏆 " + a.nome + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println("🏆 " + b.nome + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("⚖️ EMPATE! Ambos têm poder total: " + poderA);
        }
        System.out.println("=".repeat(50));

    }

    public ArrayList<Personagem> getMembros() {
        return membros;
    }

}