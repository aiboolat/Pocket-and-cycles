import org.example.ru.netology.sqr.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.getcount(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
