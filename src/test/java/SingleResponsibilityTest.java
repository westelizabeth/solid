import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class SingleResponsibilityTest {
    @Test
    public void shouldOnlySetX() {
        Point p = new Point(4, 8);
        p.setX(50);
        int y = p.getY();
        Assert.assertThat(y, Matchers.equalTo(8));
        Assert.assertThat(p.getX(), Matchers.equalTo(50));
    }
}
