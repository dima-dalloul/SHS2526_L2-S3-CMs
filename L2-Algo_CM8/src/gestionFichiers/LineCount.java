package gestionFichiers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LineCount {
    public static void main(String[] args) {
        File f = new File(args[0]);
        int nbLines=0;
        try {
            RandomAccessFile r = new RandomAccessFile(f,"r");
            for (String line=r.readLine() ; line!=null; line=r.readLine()) {
                nbLines++;
            }
            r.close();
        } catch (FileNotFoundException e1) {
            System.err.println("Le fichier "+f+" n'existe pas");
        } catch (IOException e2) {
            System.err.println("Il y a eu une erreur à la lecture du fichier : "
                    +e2.getMessage());
        } catch (ArrayIndexOutOfBoundsException e3){
            System.err.println("Veuillez fournir le nom du fichier en argument");
        } finally {
            // Rien à faire ici pour le moment
            // si je voulais être sûr de fermer le fichier,
            // je devrais le faire ici.
        }
        System.out.println(nbLines);
    }
}
