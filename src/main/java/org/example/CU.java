package org.example;

import java.util.ArrayList;

public class CU {

    private String nameCU;
    private int totalStudents;
    private ArrayList<Mark> marks;

    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }

    public void insertMarkCU(int numStudent, double mark) {
        if (marks.size() < totalStudents) {
            Mark newMark = new Mark(numStudent, mark);
            marks.add(newMark);
        }
    }

    public double searchStudent(int numStudent) {
        for (Mark mark : marks) {
            if (mark.getNumStudent() == numStudent) {
                return mark.getMark();
            }
        }
        return -1;
    }

    public double averageCU() {
        if (marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMark();
        }
        return sum / marks.size();
    }

    public boolean isApproved(int numStudent) {
        double studentMark = searchStudent(numStudent);
        return studentMark >= 9.5;
    }

}
