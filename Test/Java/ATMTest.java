package Java;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class ATMTest {
    ATM atm = new ATM();
    @Test
    void isWithdrawPossibleCheckerTest() {
        assertTrue(atm.isWithdrawPossibleChecker(1500));
        assertTrue(atm.isWithdrawPossibleChecker(700));
        assertFalse(atm.isWithdrawPossibleChecker(400));
        assertTrue(atm.isWithdrawPossibleChecker(1100));
        assertFalse(atm.isWithdrawPossibleChecker(1000));
        assertTrue(atm.isWithdrawPossibleChecker(700));
        assertFalse(atm.isWithdrawPossibleChecker(300));

    }
}