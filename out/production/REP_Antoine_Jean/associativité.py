import random

# Nombre d'essais pour tester l'associativité
num_tests = 100000

# Compteur des cas où l'associativité est vérifiée
associative_cases = 0

# Test sur des opérations flottantes pour l'addition
for _ in range(num_tests):
    # Génère trois nombres flottants aléatoires
    a = random.uniform(-1000, 1000)
    b = random.uniform(-1000, 1000)
    c = random.uniform(-1000, 1000)
    
    # Vérification de l'associativité : (a + b) + c == a + (b + c)
    if (a + b) + c == a + (b + c):
        associative_cases += 1

# Calcul du pourcentage de cas où l'addition est associative
percentage_associative = (associative_cases / num_tests) * 100

print(f"L'addition flottante est associative dans {percentage_associative:.2f}% des cas.")
