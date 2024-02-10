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

        }


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
    public void countBillboardsForBrand() {

        // Arreglo de String
        //String[] differentBrands = new String[1];
        //differentBrands[0] = "Auctor Quis Tristique Corp." + ", ";

        // I create the ArrayList
        ArrayList<String> brands = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Inicializo
        brands.add(billboards.get(0).getBrand());
        numbers.add(1);

        System.out.println("Tamano brands: " + brands.size());
        System.out.println("Tamano cuenta: " + numbers.size());
        System.out.println("Tamano Billboards: " + billboards.size());

        boolean flag = false;

        // Recorro el ArrayList y voy contando el numero de marcas diferentes.
        // Despues, hago un arreglo

        for(int i = 1; i < billboards.size(); i++) {

            for(int j = 0; j < brands.size(); j++) {

                if(brands.get(j).equals(billboards.get(i).getBrand())) {
                    flag = true;
                    // aumenta el numero++
                    numbers.set(j, numbers.get(j)+1);

                }


            }

            if(!flag) {

                System.out.println("Tamano brands: " + brands.size());
                //System.out.println("Tamano cuenta: " + numbers.size());

                // lo meto en el arreglo
                brands.add(billboards.get(i).getBrand());
                numbers.add(1);

            }

        }


        String result_1 = brands.toString();
        String result_2 = numbers.toString();

        System.out.println("Marcas: " + result_1);
        System.out.println("---------------------------------");
        System.out.println("Numeros: " + result_2);

    }

}
