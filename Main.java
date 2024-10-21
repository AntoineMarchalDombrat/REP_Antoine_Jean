import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
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

        // Sauvegarder le résultat dans un fichier en mode "append" (ajout)
        try (FileWriter writer = new FileWriter("answer_associativity.txt")) { // "true" pour ajouter au fichier existant
            writer.write(String.format(Locale.ENGLISH, "%.2f\n", tauxReussite));
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la sauvegarde du fichier.");
            e.printStackTrace();
        }
    }
}
