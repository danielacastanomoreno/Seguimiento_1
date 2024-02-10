package model;

import ui.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class InfrastructureDepartament {

    public static String BILLBOARD_FILE_NAME;
   String ruta;

    public ArrayList<Billboard> billboards;

    public InfrastructureDepartament(String ruta) throws Exception {

        BILLBOARD_FILE_NAME = ruta;
        billboards = new ArrayList<Billboard>();
        loadBillboard();

    }

    public InfrastructureDepartament() throws Exception {

        BILLBOARD_FILE_NAME= "BillboardDataExported.csv";
        billboards = new ArrayList<Billboard>();
        loadBillboard();

    }

    public void addBillboard(double w, double h, boolean iu, String b) {



    }

    public void saveBillboard() {



    }

    private void loadBillboard() throws  Exception{

        String resource = Main.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File archivo =  new File(resource);
        // Lectura por bytes:
        FileReader fr = new FileReader(archivo);
        // Lectura por lineas:
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        line = br.readLine();

        while(line != null) {

            importData(line);
            line = br.readLine();

            //String[] columns = line.split("\\|");
            //System.out.println("Tamano: " + columns.length);
            //System.out.println(Arrays.toString(columns));
            //double w = Double.parseDouble(columns[0]);
            //double h = Double.parseDouble(columns[1]);
            //boolean iu = Boolean.parseBoolean(columns[2]);
            //Billboard billb = new Billboard(w, h, iu, columns[3]);

            // Acumuladores
            //acum_area += billb.calculateArea();
            //acum_w += billb.getWidth();
            //acum_h += billb.getHeight();

            //contador ++;


            //TAREA = utilizar split para separar datos de cada columna y asignarlos al arreglo. ¡OJO!
            // Promedio de las alturas, anchos y areas. ¡OJO!

        }

        // Calculo promedios
        //double promedio_anchos = acum_w / contador;
        //double promedio_alturas = acum_h / contador;
        //double promedio_areas = acum_area / contador;

        //System.out.println("--------------------------------- PROMEDIOS -------------------------------------------");
        //System.out.println("Promedio de anchos: " + promedio_anchos);
        //System.out.println("Promedio de alturas: " + promedio_alturas);
        //System.out.println("Promedio de areas: " + promedio_areas);

        br.close();
        fr.close();

    }


    public void exportDangerousBillboardReport(String fn) {




    }

    public void importData(String fn) {

        String[] columns = fn.split("\\|");
        double w = Double.parseDouble(columns[0]);
        double h = Double.parseDouble(columns[1]);
        boolean iu = Boolean.parseBoolean(columns[2]);
        Billboard billb = new Billboard(w, h, iu, columns[3]);
        billboards.add(billb);

    }

    public String toString() {

        return "";

    }

    public double widthAverage() throws Exception {

        // Acumm
        double acum_width = 0;

        // Counter
        int counter = 0;

        for(int i = 0; i < billboards.size(); i++) {

                acum_width += billboards.get(i).getWidth();
                counter ++;

        }

        // I create the average
        double width_average = acum_width / counter;

        return width_average;

    }

    public double heightAverage() {

        // Acumm
        double acum_height = 0;

        // Counter
        int counter = 0;

        for(int i = 0; i < billboards.size(); i++) {

            acum_height += billboards.get(i).getHeight();
            counter ++;

        }

        // I create the average
        double height_average = acum_height / counter;

        return height_average;

    }

    public double areasAverage() {

        // Acumm
        double acum_areas = 0;

        // Counter
        int counter = 0;

        for(int i = 0; i < billboards.size(); i++) {

            acum_areas += billboards.get(i).calculateArea();
            counter ++;

        }

        // I create the average
        double areas_average = acum_areas / counter;

        return areas_average;

    }

    // This method count the actives billboards
    public int countActivesBillboards() {

        // Counter of actives billboards
        int counter_actives = 0;

        for(int i = 0; i < billboards.size(); i++) {

            if(billboards.get(i).isInUse()) {

                counter_actives ++;

            }

        }

        return counter_actives;

    }

    // This method count the number of billboards for brand
    public String[] countBillboardsForBrand() {

        // Arreglo de String
        //String[] differentBrands = new String[1];
        //differentBrands[0] = "Auctor Quis Tristique Corp." + ", ";

        // I create the ArrayList
        ArrayList<String> brands = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Inicializo
        brands.add("Auctor Quis Tristique Corp.");
        numbers.add(1);

        // Recorro el ArrayList y voy contando el numero de marcas diferentes.
        // Despues, hago un arreglo

        for(int i = 0; i < billboards.size(); i++) {

            if(billboards.get(i).getBrand().equals(brands.get(0))) {

                // aumenta el numero++
                numbers.size()++;

            }

            else {

                    // lo meto en el arreglo
                brands.add(billboards.get(i).getBrand());

            }

        }

        //System.out.println("Tamano: " + differentBrands.length);

        //return brands;

        //for(int i = 0; i < differentBrands.length; i++) {

          //  System.out.println(differentBrands[i]);

        //}


        //return differentBrands;

    }

}
