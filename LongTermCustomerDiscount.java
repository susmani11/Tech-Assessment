package com.mycompany.bill;

public class LongTermCustomerDiscount implements Discount {
    public static final int discPercent = 5;

    @Override
    public String getDiscountedBill(double totalBill, double groceryBill) {
        double netBill = totalBill - groceryBill;
        double discountedBill = totalBill - netBill * discPercent / 100;
        String strDiscountedBill = String.format("%.2f", new Double(discountedBill));
        return strDiscountedBill;
    }
}
