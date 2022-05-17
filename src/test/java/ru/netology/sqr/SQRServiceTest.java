package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10,99,0"
    })
    @CsvFileSource(resources = {"/Data.csv"})

    public void test(int Minvalue, int Maxvalue, int expected) {
        SQRService service = new SQRService();
        int result = service.squareNumbers (Minvalue, Maxvalue);

        Assertions.assertEquals(expected, result);

    }
}
