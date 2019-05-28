package ru.job4j.exam;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentSorter {

    private Set<String> departments = new TreeSet<>();

    public void addDepartment(String dep) {
        String[] parts = dep.split("\\\\");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part);
            departments.add(sb.toString());
            sb.append("\\");
        }
    }

    public String[] getDepartments() {
        return departments.toArray(new String[departments.size()]);
    }

    public String[] getReverseDepartments() {
        Set<String> reverseSet = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int min = Math.min(o1.length(), o2.length());
                int result = o2.substring(0, min).compareTo(o1.substring(0, min));
                return result != 0 ? result : Integer.compare(o1.length(), o2.length());
            }
        });
        reverseSet.addAll(departments);
        return reverseSet.toArray(new String[departments.size()]);
    }
}
