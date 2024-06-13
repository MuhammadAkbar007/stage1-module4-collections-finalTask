package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonsGetterMain {
    public static void main(String[] args) {
        Map<String, List<String>> timetable = new HashMap<>();

        timetable.put("Monday", List.of("English"));
        timetable.put("Tuesday", List.of("Mathematics"));
        timetable.put("Wednesday", List.of("English", "Chemistry"));
        timetable.put("Thursday", List.of("Literature", "Mathematics"));
        timetable.put("Friday", List.of("Physics"));

        System.out.println(new LessonsGetter().getLessons(timetable));
    }
}
