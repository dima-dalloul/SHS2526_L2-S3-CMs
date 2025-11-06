package gestionFichiers;

import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("charabia_utilisateur.txt");

            String entreeUtilisateur = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello WriteFile");
            System.out.println("Écrivez des lignes dans le fichier. Tapez 'STOP' pour quitter.");

            do{
                entreeUtilisateur = scanner.nextLine();
                if(!entreeUtilisateur.equals("STOP")){
                    writer.write(entreeUtilisateur + System.lineSeparator());
                }
            } while(!entreeUtilisateur.equals("STOP"));
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing the writer: " + e.getMessage());
                }
            }
            System.out.println("Fichier 'charabia_utilisateur.txt' créé avec succès.");
            System.out.println("Merci d'avoir utilisé WriteFile !");
        }
    }
}
