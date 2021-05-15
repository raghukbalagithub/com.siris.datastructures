package com.siris.javaconcepts.projects.mortgagecalculator;

public class MortgageCalculator {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        Mortgage calculator = new Mortgage(principal, annualInterest, years);
        MortgageReport reporter = new MortgageReport(calculator);

        reporter.printMortgage();
        reporter.printPaymentSchedule();
    }
}
