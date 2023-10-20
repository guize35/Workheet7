import org.example.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CUTest {

    @ParameterizedTest
    @CsvSource({
            "44161, 18.0",
            "44453, 9.5",
    })
    public void testInsertMarkCU(int numStudent, double mark) {
        CU cu = new CU("QS", 10);
        cu.insertMarkCU(numStudent, mark);

        assertEquals(mark, cu.searchStudent(numStudent));
    }

    @ParameterizedTest
    @CsvSource({
            "44161, 18.0",
            "44453, 9.5",
    })
    public void testSearchStudent(int numStudent, double mark) {
        CU cu = new CU("QS", 10);
        cu.insertMarkCU(numStudent, mark);

        assertEquals(mark, cu.searchStudent(numStudent));
    }

    @ParameterizedTest
    @CsvSource({
            "44161, 18.0",
            "44453, 9.5",
    })
    public void testAverageCU(int numStudent, double mark) {
        CU cu = new CU("QS", 10);
        cu.insertMarkCU(numStudent, mark);

        assertEquals(mark, cu.averageCU(), 0.01);
    }

    @ParameterizedTest
    @CsvSource({
            "44161, 18.0, true",
            "44453, 9.5, true",
            "12345, 7.0, false",
    })
    public void testIsApproved(int numStudent, double mark, boolean expected) {
        CU cu = new CU("QS", 10);
        cu.insertMarkCU(numStudent, mark);
        assertEquals(expected, cu.isApproved(numStudent));
    }
}
