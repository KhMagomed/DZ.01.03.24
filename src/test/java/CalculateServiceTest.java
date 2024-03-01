import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {


    @Test
    public void shouldColculateCountInMonth() {
        CalculateService service = new CalculateService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }


}
