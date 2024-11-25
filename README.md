# REP_Antoine_Jean

## How to Reproduce My Experiment

1. **Cloner le projet**  
   Clonez le projet à l'URL suivante :  
   ```bash
   git clone https://gitlab.insa-rennes.fr/Antoine.Marchal-Dombrat/rep_antoine_jean
   cd rep_antoine_jean
   ```
   
2. **Installer la version JDK requise**
   Vous devez installer JDK version 21.0.4. Assurez-vous que vous avez la bonne version avec :
   ```bash
   java -version
   ```
   
3. **Compilation et Exécution**
   Dans le répertoire contenant Main.java, compilez et exécutez le fichier avec les commandes suivantes :
   ```bash
   javac Main.java
   java Main
   ```
    Vous devriez obtenir un résultat autour de 77%.

4. **Docker**

   Pour exécuter l'expérience dans un environnement Docker contrôlé, suivez les étapes ci-dessous :

   Construction de l'image Docker
   Pour construire l'image Docker, utilisez la commande suivante :

   ```bash
   sudo docker build -t mon-java-app .
   ```
   Exécution de l'application Docker
   Pour exécuter l'application à partir de l'image Docker, utilisez la commande suivante :

   ```bash
   sudo docker run mon-java-app
   ```
   
**Description des Fichiers**

    associativité.py
    Ce script teste l'associativité de l'addition flottante en générant des nombres aléatoires et en vérifiant si (a+b)+c=a+(b+c)(a+b)+c=a+(b+c) est vrai dans chaque cas. Il imprime ensuite le pourcentage de réussite.

    script.py
    Ce script Python compare les résultats entre différents dépôts GitHub en récupérant les fichiers de résultats et en comparant les taux de réussite avec une tolérance définie. Il utilise une liste d'URL de dépôts GitHub et vérifie si les résultats sont alignés ou différents.

    Main.java
    Le fichier Java principal qui exécute l'expérience et génère le résultat du taux de réussite.

    Generation.java
    Classe Java pour générer des valeurs aléatoires et exécuter les tests sur l'associativité.

    Dockerfile
    Ce fichier permet de créer une image Docker pour exécuter l'expérience dans un environnement contrôlé.

    results.csv
    Fichier CSV contenant les résultats des expérimentations en fonction de différents paramètres (nombreEssais, tolerance et tauxReussite). Ce fichier est utilisé pour analyser les relations entre ces variables et visualiser les données dans le notebook Jupyter.

    DecisionTree.ipynb
    Un notebook Jupyter utilisé pour effectuer une analyse approfondie des résultats en utilisant un arbre de décision. Il montre les règles de décision, les importances des caractéristiques, et inclut des visualisations telles que des heatmaps et des graphiques de distribution.

**Analyse et Visualisation**

Pour une analyse approfondie des résultats, ouvrez le notebook DecisionTree.ipynb. Ce notebook utilise les données de results.csv pour générer des visualisations (arbres de décision, heatmaps, distributions) afin de comprendre l'impact des différentes valeurs sur le taux de réussite.
Notes

**Environnement**





A README.md template is provided 

# Project Title

## Introduction

The paper "Debunking the Chessboard: Confronting GPTs Against Chess Engines to Estimate Elo Ratings and Assess Legal Move Abilities" explores the ability of GPT models, particularly GPT-3.5-turbo-instruct and GPT-4, to play chess. The study addresses two primary questions:

Can GPT models consistently play legal chess moves?
What is the Elo rating of these models, reflecting their chess-playing skill?
The problem arises from anecdotal claims and mixed reports about the chess capabilities of GPT models. Some suggest these models perform exceptionally well, while others highlight frequent errors and illegal moves. This variability underscores the need for a systematic, reproducible analysis to assess the true chess-playing ability of GPTs and their robustness across different configurations and scenarios. By systematically testing models against engines like Stockfish and random chess engines, the study identifies strengths, weaknesses, and variability factors affecting their performance.
## Reproducibility

### How to Reproduce the Results
1. **Requirements**  
   - List dependencies and their versions (e.g., Python, R, libraries, etc.).
   - Specify any system requirements.

2. **Setting Up the Environment**  
   - Provide instructions for using the Dockerfile to create a reproducible environment:  
     ```bash
     docker build -t reproducible-project .
     docker run -it reproducible-project
     ```

3. **Reproducing Results**  
   - Describe how to run the automated scripts or notebooks to reproduce data and analyze results:
     ```bash
     bash scripts/run_analysis.sh
     ```
   - Mention Jupyter notebooks (if applicable):  
     Open `notebooks/reproduce_results.ipynb` to execute the analysis step-by-step.

4. **Automation (Bonus)**  
   - Explain the included GitHub Action that produces or analyzes data automatically.  
    
### Encountered Issues and Improvements
- Report any challenges, errors, or deviations from the original study.
- Describe how these issues were resolved or improved, if applicable.

### Is the Original Study Reproducible?
- Summarize the success or failure of reproducing the study.
- Include supporting evidence, such as comparison tables, plots, or metrics.

## Replicability

### Variability Factors
- **List of Factors**: Identify all potential sources of variability (e.g., dataset splits, random seeds, hardware).  
  Example table:
  | Variability Factor | Possible Values     | Relevance                                   |
  |--------------------|---------------------|--------------------------------------------|
  | Random Seed        | [0, 42, 123]       | Impacts consistency of random processes    |
  | Hardware           | CPU, GPU (NVIDIA)  | May affect computation time and results    |
  | Dataset Version    | v1.0, v1.1         | Ensures comparability across experiments   |

- **Constraints Across Factors**:  
  - Document any constraints or interdependencies among variability factors.  
    For example:
    - Random Seed must align with dataset splits for consistent results.
    - Hardware constraints may limit the choice of GPU-based factors.

- **Exploring Variability Factors via CLI (Bonus)**  
   - Provide instructions to use the command-line interface (CLI) to explore variability factors and their combinations:  
     ```bash
     python explore_variability.py --random-seed 42 --hardware GPU --dataset-version v1.1
     ```
   - Describe the functionality and parameters of the CLI:
     - `--random-seed`: Specify the random seed to use.
     - `--hardware`: Choose between CPU or GPU.
     - `--dataset-version`: Select the dataset version.


### Replication Execution
1. **Instructions**  
   - Provide detailed steps or commands for running the replication(s):  
     ```bash
     bash scripts/replicate_experiment.sh
     ```

2. **Presentation and Analysis of Results**  
   - Include results in text, tables, or figures.
   - Analyze and compare with the original study's findings.

### Does It Confirm the Original Study?
- Summarize the extent to which the replication supports the original study’s conclusions.
- Highlight similarities and differences, if any.

## Conclusion
- Recap findings from the reproducibility and replicability sections.
- Discuss limitations of your

Pour exécuter ce projet, assurez-vous d'avoir installé Python et les bibliothèques requises : pandas, numpy, seaborn, matplotlib, et scikit-learn.

**Compatibilité**

Ce projet a été testé sous Docker pour garantir la reproductibilité dans un environnement contrôlé.
