import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    @Test
    public void fizzbuzz_of_multiple_of_3_should_return_fizz() {
        assertThat(FizzBuzz.valueOf(3)).isEqualTo("fizz");
        assertThat(FizzBuzz.valueOf(6)).isEqualTo("fizz");
    }

    @Test
    public void fizzbuzz_of_multiple_of_5_should_return_buzz() {
        assertThat(FizzBuzz.valueOf(5)).isEqualTo("buzz");
        assertThat(FizzBuzz.valueOf(10)).isEqualTo("buzz");
    }

    @Test
    public void fizzbuzz_of_a_number_not_multiple_of_3_or_5_should_return_its_value() {
        assertThat(FizzBuzz.valueOf(1)).isEqualTo("1");
        assertThat(FizzBuzz.valueOf(2)).isEqualTo("2");
        assertThat(FizzBuzz.valueOf(4)).isEqualTo("4");
    }

    @Test
    public void fizzbuzz_of_multiple_of_3_and_5_should_return_fizzbuzz() {
        assertThat(FizzBuzz.valueOf(15)).isEqualTo("fizzbuzz");
    }
}
