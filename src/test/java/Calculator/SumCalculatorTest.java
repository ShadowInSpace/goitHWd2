package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
private SumCalculator calc;

@BeforeEach
    public void beforeEach(){
    calc = new SumCalculator();
}

@Test
    void shouldReturnOne(){
    //When
    int actual = calc.sum(1);

    //Then
    int expected = 1;
    Assertions.assertEquals(actual,expected);
}

@Test
    void shouldReturnSix(){
    //When
    int actual = calc.sum(3);

    //Then
    int expected = 6;
    Assertions.assertEquals(actual,expected);
}

@Test
    void shouldThrowIllegalArgumentExceptionWhenInputZero(){
    //Then
    Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
}

}
