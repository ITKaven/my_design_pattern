package com.kaven.design.pattern.structural.flyweight;

public class Manager implements Employee {
    public void report() {
        System.out.println(reportContent);
    }
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
