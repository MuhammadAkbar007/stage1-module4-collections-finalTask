package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinderMain {
    public static void main(String[] args) {
        Map<String, Set<String>> projects = new HashMap<>();

        projects.put("CSO", new HashSet<>(List.of("Ivan", "Anna", "Lidia", "Antony")));
        projects.put("VVaS", new HashSet<>(List.of("Mary", "Ben", "Max")));
        projects.put("LJA", new HashSet<>(List.of("Oleg", "Ivan", "Alex")));

        new DeveloperProjectFinder().findDeveloperProject(projects, "Ivan");
    }
}
