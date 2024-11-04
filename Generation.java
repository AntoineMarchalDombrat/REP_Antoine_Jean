import java.util.Locale;
import java.util.Random;

public class Generation {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <nombreEssais> <tolerance>");
            return;
        }

        int nombreEssais;
        double tolerance;

        try {
            nombreEssais = Integer.parseInt(args[0]); // Nombre de tests aléatoires
            tolerance = Double.parseDouble(args[1]);   // Tolérance pour la comparaison d'égalité
        } catch (NumberFormatException e) {
            System.out.println("Erreur : assurez-vous que les arguments sont des nombres valides.");
            return;
        }

        int nombreReussites = 0;
        Random random = new Random();

        for (int i = 0; i < nombreEssais; i++) {
            // Générer des valeurs aléatoires pour x, y, z
            double x = random.nextDouble() * 10; // Limiter l'amplitude des valeurs
            double y = random.nextDouble() * 10;
            double z = random.nextDouble() * 10;

            // Vérifier l'associativité de l'addition avec une tolérance
            double gauche = (x + y) + z;
            double droite = x + (y + z);

            if (Math.abs(gauche - droite) < tolerance) {
                nombreReussites++;
            }
        }

        // Calculer le taux de réussite
        double tauxReussite = ((double) nombreReussites / nombreEssais) * 100;

        // Afficher le résultat dans le terminal
        System.out.printf(Locale.ENGLISH, "Taux de réussite : %.2f%%\n", tauxReussite);
    }
}
