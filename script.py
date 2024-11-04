import os
import requests
from math import isclose

# Chemin complet vers le fichier de référence
reference_file_path = "C:/Users/jeanh/OneDrive/INSA/M2/Reproductibilité/REP_Antoine_Jean/answer_associativity.txt"

# Vérification de l'existence du fichier de référence
if not os.path.isfile(reference_file_path):
    print(f"Erreur : le fichier de référence {reference_file_path} est introuvable.")
    exit(1)

# Fonction pour lire un nombre unique dans un fichier texte
def get_answer_value(filepath):
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            content = f.readline().strip().replace(",", ".")
            return float(content)
    except Exception as e:
        print(f"Erreur en lisant {filepath} : {e}")
        return None

# Valeur de référence
reference_value = get_answer_value(reference_file_path)
if reference_value is None:
    print("Erreur de lecture de la valeur de référence.")
    exit(1)

# Liste des dépôts GitHub à vérifier
repos = [
    "https://github.com/Matys53/REP_TP",
    "https://github.com/PaulineRoches/REP_popo_sos",
    "https://github.com/matth1446/rep_mh_vvk",
    "https://github.com/AntoineMarchalDombrat/REP_Antoine_Jean",
    "https://github.com/alpjakop/REP",
    "https://github.com/Humilokaki/TP2-REP-INSA-202425",
    "https://github.com/Repro-Arno-Jeremy/REP-TP2",
    "https://github.com/Kaeios/assoc-REP",
    "https://github.com/Dyskal/repro",
]

# Tolérance relative pour la comparaison des valeurs
tolerance = 0.01

# URL de base pour récupérer les fichiers bruts sur GitHub
base_url = "https://raw.githubusercontent.com"

# Vérification des fichiers answer_associativity.txt dans chaque dépôt
for repo in repos:
    repo_name = repo.split('https://github.com/')[1]
    default_branch = 'main' if 'master' not in repo_name else 'master'
    file_url = f"{base_url}/{repo_name}/{default_branch}/answer_associativity.txt"

    try:
        response = requests.get(file_url)
        response.raise_for_status()  # Vérifier si la requête a réussi
        answer_content = response.text.strip().replace(",", ".")
        answer_value = float(answer_content)

        # Comparaison des valeurs avec une tolérance
        if isclose(answer_value, reference_value, rel_tol=tolerance):
            print(f"[Aligné] {repo_name} : Résultats similaires ({answer_value}).")
        else:
            print(f"[Différent] {repo_name} : Référence {reference_value}, trouvé {answer_value}.")
    
    except requests.exceptions.RequestException as err:
        print(f"Erreur réseau pour {file_url} : {err}")
    except ValueError:
        print(f"Erreur de conversion de la réponse pour {repo_name}")
    except Exception as e:
        print(f"Une erreur est survenue avec {repo_name} : {e}")
