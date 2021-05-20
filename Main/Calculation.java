package TipCalculator.Main;

public class Calculation {
    private double textBill;
    private double textValue;
    private double textPercentiles;
    private double textTotalBill;

    public Calculation(double textBill, double textValue, double textPercentiles, double textTotalBill) {
        this.textBill = textBill;
        this.textValue = textValue;
        this.textPercentiles = textPercentiles;
        this.textTotalBill = textTotalBill;
    }


    public double getTextBill() {
        return textBill;
    }

    public void setTextBill(double textBill) {
        this.textBill = textBill;
    }

    public double getTextValue() {
        return textValue;
    }

    public void setTextValue(double textValue) {
        this.textValue = textValue;
    }

    public double getTextPercentiles() {
        return textPercentiles;
    }

    public void setTextPercentiles(double textPercentiles) {
        this.textPercentiles = textPercentiles;
    }

    public double getTextTotalBill() {
        return textTotalBill;
    }

    public void setTextTotalBill(double textTotalBill) {
        this.textTotalBill = textTotalBill;
    }

    // Bill Calculation
    public double tipValue(double textPercentiles) {
        return textPercentiles/100;
    }

    public double totalBill(double textBill, double textPercentiles) {
        return textBill * tipValue(textPercentiles);
    }

}
