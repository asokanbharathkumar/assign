package junit_Mockito;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Q3_T {

	@Test
	void test() {
		Q3 ob= new Q3(15000);
		assertThrows(InsufficientFundsException.class, () -> ob.withdraw(20000));
	}
}