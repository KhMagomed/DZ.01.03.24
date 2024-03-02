import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000,3",
//            "100000,60000,150000,2"
//    })
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void shouldColculateCountInMonth(int income, int expenses, int threshold, int expected) {
        CalculateService service = new CalculateService();
//
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//
//        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }

  /* @Test
    public void shouldColculateCountInMonth2() {
        CalculateService service = new CalculateService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

   */
}
