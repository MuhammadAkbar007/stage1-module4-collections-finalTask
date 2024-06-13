package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            Set<String> devs = entry.getValue();

            if (devs.contains(developer)) devProjects.add(projectName);
        }

        devProjects.sort((project1, project2) -> {
            int lengthComparison = Integer.compare(project1.length(), project2.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            } else {
                return project1.compareTo(project2);
            }
        });

        System.out.println(devProjects);
        return devProjects;
    }
}
