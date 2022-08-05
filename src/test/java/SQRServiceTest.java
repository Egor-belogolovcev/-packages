import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.packages.round.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")

    public void testRegisteredUnderLimit(int expected, int a, int b) {
        SQRService service = new SQRService();

        int actual = service.numberOfSQR(a, b);

        Assertions.assertEquals(expected, actual);
    }

}
