import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PointPrinter {
    private final List<Printer> printers = new ArrayList<>();

    private PointPrinter(Printer... printers) {
       this.printers.addAll(Arrays.asList(printers));
    }

    public static PointPrinter create(Printer... printers) {
        return new PointPrinter(printers);
    }

    public void print(Point p) {
        printers.forEach(printer -> printer.print(p));
    }
}
