package TriangleTest;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class TriangleTypeTest {


    @DataProvider(name = "triangleData")
    public Object[][] getTriangleData() {
        return new Object[][] {
                {12, 16, 5, "This is a scalene triangle"},
                {10, 10, 10, "Equilateral triangle"},
                {16, 16, 5, "Isosceles triangle"},
                {0, 0, 0, "Your data is not valid!Enter integers greater than zero!"},
                {"a", "#", "r", "Your data is not valid!Enter integers greater than zero!"}
        };
    }

    @Test(dataProvider = "triangleData")
    public void testCheckTriangleType(Object a, Object b, Object c, String expectedResult) {
        if (a instanceof Integer && b instanceof Integer && c instanceof Integer) {
            String result = TriangleType.checkTriangleType((int) a, (int) b, (int) c);
            Assert.assertEquals(result, expectedResult);
        } else if (a instanceof String && b instanceof String && c instanceof String) {
            String result = TriangleType.checkTriangleType(0, 0, 0);
            Assert.assertEquals(result, expectedResult);
        }
    }
}