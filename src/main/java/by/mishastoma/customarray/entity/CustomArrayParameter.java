package by.mishastoma.customarray.entity;


import java.util.Objects;

public class CustomArrayParameter {

    private double average;
    private int sum;
    private int max;
    private int min;

    public CustomArrayParameter() {

    }

    public CustomArrayParameter(double average, int sum, int max, int min) {
        this.average = average;
        this.sum = sum;
        this.max = max;
        this.min = min;
    }

    public double getAverage() {
        return average;
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayParameter that = (CustomArrayParameter) o;
        return Double.compare(that.average, average) == 0 && sum == that.sum && max == that.max && min == that.min;
    }

    @Override
    public String toString() {
        return "CustomArrayParameter{" +
                "average=" + average +
                ", sum=" + sum +
                ", max=" + max +
                ", min=" + min +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(average, sum, max, min);
    }

}
