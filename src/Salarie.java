// Salarie.java
public class Salarie {
    private String matricule;
    private String nom;
    private String prenom;
    private double salaire;
    private Departement departement; // ManyToOne : un salarié appartient à un département

    public Salarie(String matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    // Getters
    public String getMatricule() { return matricule; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public double getSalaire() { return salaire; }

    // Departement getter/setter (relation)
    public Departement getDepartement() { return departement; }
    public void setDepartement(Departement departement) { this.departement = departement; }

    @Override
    public String toString() {
        return matricule + " - " + nom + " " + prenom + " (" + salaire + " DH)";
    }
}
