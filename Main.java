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
            // Générer des valeurs aléatoires pour x, y, z en float
            float x = random.nextFloat() * 10; // Limiter l'amplitude des valeurs
            float y = random.nextFloat() * 10;
            float z = random.nextFloat() * 10;

            // Vérifier l'associativité de l'addition en float
            float gauche = (x + y) + z;
            float droite = x + (y + z);

            if (gauche == droite) {
                nombreReussites++;
            }
        }

        // Calculer le taux de réussite
        float tauxReussite = ((float) nombreReussites / nombreEssais) * 100;

        // Sauvegarder le résultat dans un fichier en mode "append" (ajout)
        try (FileWriter writer = new FileWriter("answer_associativity.txt")) { 
            writer.write(String.format(Locale.ENGLISH, "%.2f\n", tauxReussite));
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la sauvegarde du fichier.");
            e.printStackTrace();
        }
    }
}
