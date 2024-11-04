# REP_Antoine_Jean


How to reproduce my experiment


Clone the project at the URL : https://gitlab.insa-rennes.fr/Antoine.Marchal-Dombrat/rep_antoine_jean


You need to install a jdk version 21.0.4	
Be sure you have the right version with java -version


Compile the file Main.java file with the command "javac Main.java" when you are in the directory of this file

Run with Java Main

You should get result around 77%

-------------------------------------
For the docker file :

sudo docker build -t mon-java-app .

sudo docker run mon-java-app

-------------------------------------
Description des Fichiers

    associativité.py : Ce script teste l'associativité de l'addition flottante en générant des nombres aléatoires et en vérifiant si (a+b)+c=a+(b+c)(a+b)+c=a+(b+c) est vrai dans chaque cas. Il imprime ensuite le pourcentage de réussite​

.

script.py : Ce script Python compare les résultats entre différents dépôts GitHub en récupérant les fichiers de résultats et en comparant les taux de réussite avec une tolérance définie. Il utilise une liste d'URL de dépôts GitHub et vérifie si les résultats sont alignés ou différents​

    .

    Main.java : Le fichier Java principal qui exécute l'expérience et génère le résultat du taux de réussite.

    Generation.java : Classe Java pour générer des valeurs aléatoires et exécuter les tests sur l'associativité.

    Dockerfile : Ce fichier permet de créer une image Docker pour exécuter l'expérience dans un environnement contrôlé.

    results.csv : Fichier CSV contenant les résultats des expérimentations en fonction de différents paramètres (nombreEssais, tolerance et tauxReussite). Ce fichier est utilisé pour analyser les relations entre ces variables et visualiser les données dans le notebook Jupyter.

    DecisionTree.ipynb : Un notebook Jupyter utilisé pour effectuer une analyse approfondie des résultats en utilisant un arbre de décision. Il montre les règles de décision, les importances des caractéristiques, et inclut des visualisations telles que des heatmaps et des graphiques de distribution.

Analyse et Visualisation

Pour une analyse approfondie des résultats, ouvrez le notebook DecisionTree.ipynb. Ce notebook utilise les données de results.csv pour générer des visualisations (arbres de décision, heatmaps, distributions) afin de comprendre l'impact des différentes valeurs sur le taux de réussite.
Notes

    Environnement : Pour exécuter ce projet, assurez-vous d'avoir installé Python et les bibliothèques requises : pandas, numpy, seaborn, matplotlib, et scikit-learn.
    Compatibilité : Ce projet a été testé sous Docker pour garantir la reproductibilité dans un environnement contrôlé.


