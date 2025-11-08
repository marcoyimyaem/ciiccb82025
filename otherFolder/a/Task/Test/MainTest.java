package otherFolder.a.Task.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import chapter3.DatesAndTimeLesson;


public class MainTest {
    @Test
    void TestDateOrdinal(){
        LocalDate date4 = LocalDate.of(2025, 7, 2);
        assertEquals("2nd of JULY, 2025", DatesAndTimeLesson.dateOrdinalString(date4));
    }
}
