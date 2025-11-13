package otherFolder.a.Task.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import chapter3.DatesAndTimeLesson;


public class MainTest {
LocalDate date4 = LocalDate.of(2025, 7, 1);
    @Test
    void TestDateOrdinalST(){
        assertTrue(DatesAndTimeLesson.dateOrdinalString(date4).contains("sst"), "the message must contains \"st\" suffix ");
        
    }
    @Test
    void TestDateOrdinalND(){       
        assertTrue(DatesAndTimeLesson.dateOrdinalString(date4.plusDays(1)).contains("nd"), "the message must contains \"nd\" suffix ");
    }
    @Test
    void TestDateOrdinalRD(){
        assertTrue(DatesAndTimeLesson.dateOrdinalString(date4.plusDays(2)).contains("rd"), "the message must contains \"rd\" suffix ");
    }
    @Test
    void TestDateOrdinalTH(){
        assertTrue(DatesAndTimeLesson.dateOrdinalString(date4.plusDays(3)).contains("th"), "the message must contains \"th\" suffix ");
        assertTrue(DatesAndTimeLesson.dateOrdinalString(date4.plusDays(4)).contains("th"), "the message must contains \"th\" suffix ");
    }
}
