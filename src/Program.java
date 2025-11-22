public class Program {
    public static void main(String[] args) {

        // Création des départements
        Departement info = new Departement(1, "Informatique");
        Departement compta = new Departement(2, "Comptabilité");

        // Création des salariés
        Salarie s1 = new Salarie("A01", "Ali", "Youssef", 7000.0);
        Salarie s2 = new Salarie("A02", "Karim", "Hassan", 6000.0);
        Salarie s3 = new Salarie("A03", "Fatima", "Lamia", 9000.0);
        Salarie s4 = new Salarie("A04", "Sara", "Meriem", 5500.0);
        Salarie s5 = new Salarie("A05", "Nora", "Samir", 6500.0);

        // Affectation des salariés aux départements
        info.ajouterSalarie(s1);
        info.ajouterSalarie(s3);
        info.ajouterSalarie(s5);

        compta.ajouterSalarie(s2);
        compta.ajouterSalarie(s4);

        // Affichage des détails
        info.afficherDetails();
        compta.afficherDetails();
    }
}
