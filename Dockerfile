
FROM openjdk:21-slim


WORKDIR /app

COPY Main.java /app


# Compiler le fichier Main.java
RUN javac Main.java


# Spécifier la commande pour exécuter le programme Java
CMD ["java", "Main"]