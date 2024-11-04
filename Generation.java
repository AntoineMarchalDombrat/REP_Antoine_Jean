import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class Generation {
    public static void main(String[] args) {
        int[] essaisOptions = {10000, 50000, 100000}; // Values for nombreEssais
        double[] toleranceOptions = {1e-20, 1e-5, 1e-3}; // Values for tolerance

        try (FileWriter csvWriter = new FileWriter("results.csv")) {
            // Write CSV header
            csvWriter.write("nombreEssais,tolerance,tauxReussite\n");

            for (int nombreEssais : essaisOptions) {
                for (double tolerance : toleranceOptions) {
                    double tauxReussite = computeAssociativity(nombreEssais, tolerance);
                    // Save each result row with corresponding factors
                    csvWriter.write(String.format(Locale.ENGLISH, "%d,%.1e,%.2f\n", nombreEssais, tolerance, tauxReussite));
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier CSV.");
            e.printStackTrace();
        }
    }

    private static double computeAssociativity(int nombreEssais, double tolerance) {
        int nombreReussites = 0;
        Random random = new Random();

        for (int i = 0; i < nombreEssais; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double z = random.nextDouble() * 10;

            double gauche = (x + y) + z;
            double droite = x + (y + z);

            if (Math.abs(gauche - droite) < tolerance) {
                nombreReussites++;
            }
        }

        return ((double) nombreReussites / nombreEssais) * 100;
    }
}
