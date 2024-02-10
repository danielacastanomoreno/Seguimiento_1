import model.InfrastructureDepartament;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class InfrastructureTest {

    private InfrastructureDepartament infrastructure;

        @Test
        public void escenario() {

            //infrastructure = new InfrastructureDepartament();

        }

       @Test
       public void widthAverageTest() throws  Exception{

            InfrastructureDepartament scenario_1 = new InfrastructureDepartament("prueba_1.csv");
            double width_average_1 = scenario_1.widthAverage();

            //Scenario 1:
            Assert.assertEquals(662.2, width_average_1, 0.0);

            // Scenario 2:
            InfrastructureDepartament scenario_2 = new InfrastructureDepartament("prueba_2.csv");
            double width_average_2 = scenario_2.widthAverage();
            Assert.assertEquals(690.0, width_average_2, 0.0);

            // Scenario 3:
            InfrastructureDepartament scenario_3 = new InfrastructureDepartament("prueba_3.csv");
            double width_average_3 = scenario_3.widthAverage();
            Assert.assertEquals(601.5, width_average_3, 0.0);

      }

    @Test
    public void heightAverageTest() throws  Exception{

        InfrastructureDepartament scenario_1 = new InfrastructureDepartament("prueba_1.csv");
        double width_average_1 = scenario_1.heightAverage();

        //Scenario 1:
        Assert.assertEquals(329.0, width_average_1, 0.0);

        // Scenario 2:
        InfrastructureDepartament scenario_2 = new InfrastructureDepartament("prueba_2.csv");
        double width_average_2 = scenario_2.heightAverage();
        Assert.assertEquals(345.3333333333333, width_average_2, 0.0);

        // Scenario 3:
        InfrastructureDepartament scenario_3 = new InfrastructureDepartament("prueba_3.csv");
        double width_average_3 = scenario_3.heightAverage();
        Assert.assertEquals(384.26, width_average_3, 0.0);

    }

    @Test
    public void areasAverageTest() throws  Exception{

        InfrastructureDepartament scenario_1 = new InfrastructureDepartament("prueba_1.csv");
        double width_average_1 = scenario_1.areasAverage();

        //Scenario 1:
        Assert.assertEquals(189944.0, width_average_1, 0.0);

        // Scenario 2:
        InfrastructureDepartament scenario_2 = new InfrastructureDepartament("prueba_2.csv");
        double width_average_2 = scenario_2.areasAverage();
        Assert.assertEquals(245317.26666666666, width_average_2, 0.0);

        // Scenario 3:
        InfrastructureDepartament scenario_3 = new InfrastructureDepartament("prueba_3.csv");
        double width_average_3 = scenario_3.areasAverage();
        Assert.assertEquals(230787.56, width_average_3, 0.0);

    }

    @Test
    public void countActivesBillboardsTest() throws Exception {

        // Scenario 1:
        InfrastructureDepartament scenario_1 = new InfrastructureDepartament("prueba_1.csv");
        double counter_actives_1 = scenario_1.countActivesBillboards();
        Assert.assertEquals(3.0, counter_actives_1, 0.0);

        // Scenario 2:
        InfrastructureDepartament scenario_2 = new InfrastructureDepartament("prueba_2.csv");
        double counter_actives_2 = scenario_2.countActivesBillboards();
        Assert.assertEquals(9.0, counter_actives_2, 0.0);

        // Scenario 3:
        InfrastructureDepartament scenario_3 = new InfrastructureDepartament("prueba_3.csv");
        double counter_actives_3 = scenario_3.countActivesBillboards();
        Assert.assertEquals(33.0, counter_actives_3, 0.0);

    }

    @Test
    public void countBillboardsForBrand() throws Exception {

        // Scenario 1:
        //InfrastructureDepartament scenario_1 = new InfrastructureDepartament("prueba_1.csv");
        //double counter_brands_1 = scenario_1.countBillboardsForBrand();
        //Assert.assertEquals(2.0, counter_brands_1, 0.0);

        // Scenario 2:
        //InfrastructureDepartament scenario_2 = new InfrastructureDepartament("prueba_2.csv");
        //double counter_brands_2 = scenario_2.countActivesBillboards();
        //Assert.assertEquals(9.0, counter_brands_2, 0.0);

        // Scenario 3:
        //InfrastructureDepartament scenario_3 = new InfrastructureDepartament("prueba_3.csv");
        //double counter_brands_3 = scenario_3.countActivesBillboards();
        //Assert.assertEquals(33.0, counter_brands_3, 0.0);

    }

}