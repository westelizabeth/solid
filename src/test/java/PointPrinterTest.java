import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PointPrinterTest {

    @Test
    public void shouldPrint() {
        Point p = new Point3D(2, 3, 10);
        PointPrinter printer = PointPrinter.create(
                p1 -> System.out.println("x: " + p1.getX() + ", y: " + p1.getY()),
                p1 -> System.out.println("x: " + p1.getX() + ", y: " + p1.getY()),
                p1 -> {
                    if (p1 instanceof Point3D) {
                        Point3D p3D = (Point3D) p1;
                        System.out.println("X= " + p3D.getX() + ", Y= " + p3D.getY() +", Z= " + p3D.getZ());
                    }
                }
        );
        printer.print(p);
    }

    @Test
    public void shouldCreatePointPrinter() {
        List<Point> list = new ArrayList<>();
        Point point = new Point(0, 0);
        PointPrinter.create(p2 -> list.add(p2)).print(point);
        Assert.assertThat(list, Matchers.containsInAnyOrder(point));
    }
}