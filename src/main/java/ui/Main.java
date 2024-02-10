package ui;// Import File of Java
import model.InfrastructureDepartament;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        String resource = Main.class.getClassLoader().getResource("BillboardDataExported.csv").getFile();
        File archivo =  new File(resource);
        System.out.println(archivo.exists() + " " + resource);

        // Lectura de archivos
        InfrastructureDepartament id = new InfrastructureDepartament();

        // Averages:
        System.out.println("WIDTH AVERAGE: " + id.widthAverage());
        System.out.println("HEIGHT AVERAGE: " + id.heightAverage());
        System.out.println("AREAS AVERAGE: " + id.areasAverage());
        System.out.println("---------------------------------------------------------------------------------");

        // Number of actives:
        System.out.println("NUMBER OF ACTIVES: " + id.countActivesBillboards());

        // Billboards for brand:
        System.out.println("BRANDS: " + id.countBillboardsForBrand());

        System.out.println();



    }

}
