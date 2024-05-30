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
                {0, 0, 0, "There is no triangle"}
        };
    }



    @Test(dataProvider = "triangleData")
    public void testCheckTriangleType(int a, int b, int c, String expectedResult) {
        String result = TriangleType.checkTriangleType(a, b, c);
        Assert.assertEquals(result, expectedResult);
    }
}