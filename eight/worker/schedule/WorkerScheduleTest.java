package worker.schedule;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class WorkerScheduleTest
{
    @Test
    public void emptySchedule()
    {
        WorkerSchedule ws = new WorkerSchedule();
        assertTrue(ws.emptySchedule());
        assertFalse(!ws.emptySchedule());
    }

    @Test
    public void Test()
    {
        WorkerSchedule ws = new WorkerSchedule();
        ws.add(1, new HashSet<>(Arrays.asList("John", "Jack", "Martin", "Judy")));
        ws.add(1, new HashSet<>(Arrays.asList("John", "Joe", "Martin", "Bill")));
        assertTrue(ws.isWorkingOnWeek("John", 1));
        assertFalse(ws.isWorkingOnWeek("Joe", 2));
        assertFalse(ws.isWorkingOnWeek("John", 3));
    }

    @Test
    public void getWorkWeeksTest()
    {
        WorkerSchedule ws = new WorkerSchedule();
        ws.add(new HashSet<>(Arrays.asList(1, 2, 3)), new ArrayList<>(List.of("John", "Jack")) );
        ws.add(new HashSet<>(Arrays.asList(2, 3, 4)), new ArrayList<>(List.of("John", "Jack", "Mark")) );

        HashSet<Integer> weeksJohn = ws.getWorkWeeks("John");
        HashSet<Integer> weeksMark = ws.getWorkWeeks("Mark");

        System.out.println(weeksJohn);
        System.out.println(weeksMark);

        for (int i = 1; i <= 4; i++)
            assertTrue(ws.isWorkingOnWeek("John", i));


    }
}