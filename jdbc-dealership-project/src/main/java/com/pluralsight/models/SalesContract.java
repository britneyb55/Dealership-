package com.pluralsight.models;

public class SalesContract
{
    private int salesId;
    private int VIN;
    private  double SalesTaxAmount;
    private  int RecordingFee ;
    private  double ProcessingFee ;
    private boolean finance;
    private double interestRate;

    public SalesContract(int salesId, int VIN, double salesTaxAmount, int recordingFee, double processingFee, boolean finance, double interestRate) {
        this.salesId = salesId;
        this.VIN = VIN;
        SalesTaxAmount = salesTaxAmount;
        RecordingFee = recordingFee;
        ProcessingFee = processingFee;
        this.finance = finance;
        this.interestRate = interestRate;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getSalesTaxAmount() {
        return SalesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        SalesTaxAmount = salesTaxAmount;
    }

    public int getRecordingFee() {
        return RecordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        RecordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return ProcessingFee;
    }

    public void setProcessingFee(double processingFee) {
        ProcessingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
