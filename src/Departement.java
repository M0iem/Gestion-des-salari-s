import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Departement {
    private int id;
    private String nom;
    private List<Salarie> salaries;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.salaries = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNom() { return nom; }

    // Ajouter un salarié et établir le lien ManyToOne (salarie -> departement)
    public void ajouterSalarie(Salarie s) {
        if (s != null) {
            salaries.add(s);
            s.setDepartement(this);
        }
    }

    // Retourne la liste (copie non modifiable si souhaité)
    public List<Salarie> getSalaries() {
        return salaries;
    }

    // Calcul du total des salaires
    public double totalSalaires() {
        double total = 0.0;
        for (Salarie s : salaries) {
            total += s.getSalaire();
        }
        return total;
    }

    // Trier la liste des salariés par salaire croissant
    public void trierSalariesParSalaire() {
        Collections.sort(salaries, Comparator.comparingDouble(Salarie::getSalaire));
    }

    // Affiche le détail du département (tri inclus)
    public void afficherDetails() {
        System.out.println("===== Département : " + nom + " =====");
        trierSalariesParSalaire();
        for (Salarie s : salaries) {
            System.out.println(" - " + s.toString());
        }
        System.out.printf("Total des salaires : %.2f DH%n%n", totalSalaires());
    }
}
