import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nombreEssais = 100000; // Nombre de tests aléatoires
        int nombreReussites = 0;

        Random random = new Random();

        for (int i = 0; i < nombreEssais; i++) {
            // Générer des valeurs aléatoires pour x, y, z
            double x = random.nextDouble() * 10; // Limiter l'amplitude des valeurs
            double y = random.nextDouble() * 10;
            double z = random.nextDouble() * 10;

            // Vérifier l'associativité de l'addition
            double gauche = (x + y) + z;
            double droite = x + (y + z);

            if (gauche == droite) {
                nombreReussites++;
            }
        }

        // Calculer le taux de réussite
        double tauxReussite = ((double) nombreReussites / nombreEssais) * 100;

        // Afficher le taux de réussite
        System.out.printf("Taux de réussite : %.2f%%\n", tauxReussite);
    }
}

