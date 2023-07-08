import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
      BonusService service = new BonusService();

      // подготавливаем данные:
      long amount = 1_000_000;
      boolean registered = true;
      long expected = 500;

      // вызываем целевой метод:
      long actual = service.calculate(amount, registered);

      // производим проверку (сравниваем ожидаемый и фактический):
      Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100_000;
        boolean registered = true;
        long expected = 50;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100_000;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
