import model.Billboard;
import org.junit.Assert;
import org.junit.Test;

public class BillboardTest {

    @Test
    public void testArea() {

        Billboard obj = new Billboard(100.0, 40.0, true, "Icesi");
        double area = obj.calculateArea();
        Assert.assertEquals(4000.0, area, 0.0);

    }

    // Example of test 1 of the class material


}
