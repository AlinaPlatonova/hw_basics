package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {
    @Test
    public void amountEqualLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void amountLessLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);

    }

    @Test
    public void amountMoreLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
}


