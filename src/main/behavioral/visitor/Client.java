package main.behavioral.visitor;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        FixedPriceContract projectA = new FixedPriceContract(10000);
        SupportContract projectB = new SupportContract(1000);
        TimeAndMaterialsContract projectG = new TimeAndMaterialsContract(150, 10);
        TimeAndMaterialsContract projectD = new TimeAndMaterialsContract(50, 50);

        List<ReportElement> projects = List.of(projectA, projectB, projectD, projectG);

        MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyReport);
            yearlyCost += project.accept(yearlyReport);
        }
        System.out.println("MonthlyCost is: " + monthlyCost);
        System.out.println("YearlyCost is: " + yearlyCost);
    }

}
