package com.mycompany.bill;

public class CalculateNetBill {
    public static final String EMPLOYEE_DISCOUNT = "E";
    public static final String AFFILIATE_DISCOUNT = "C";
    public static final String LONGTERM_DISCOUNT = "L";
    public static final int OVERHUNDRED_DISCOUNT = 5;

    public CalculateNetBill() {

    }

    public String calculateNetBill(String totalBill, String groceryBill, String discountType) {
        Discount discObj = null;
        String discountedBill = "0.00";
        double netBill = 0.00;
        double tBill = 0.00;
        double gBill = 0.00;
        try {
            tBill = Double.parseDouble(totalBill);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid Bill");             
            return null;

        }
        try {
            gBill = Double.parseDouble(groceryBill);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid Grocery Bill");
            return null;

        }
        if (tBill <= 0.00) {
            System.out.println("Enter valid Bill");
            return null;
        }


        if (EMPLOYEE_DISCOUNT.equals(discountType)) {

            discObj = new EmployeeDiscount();

            discountedBill = discObj.getDiscountedBill(tBill, gBill);


        } else if (AFFILIATE_DISCOUNT.equals(discountType)) {
            discObj = new AffiliateDiscount();
            discountedBill = discObj.getDiscountedBill(tBill, gBill);

        } else if (LONGTERM_DISCOUNT.equals(discountType)) {
            discObj = new LongTermCustomerDiscount();
            discountedBill = discObj.getDiscountedBill(tBill, gBill);


        } else {
            discountedBill = totalBill;
        }
        double discountedBillValue = Double.parseDouble(discountedBill);
        
        if (discountedBillValue > 100) {
            discountedBillValue = (discountedBillValue * (100 - OVERHUNDRED_DISCOUNT)) / 100;
            discountedBill = String.format("%.2f", new Double(discountedBillValue));
        }

        return discountedBill;
    }

    public static void main(String args[]) {
        if (args.length <= 2) {
            System.out.println("Please enter all the 3 required arguments");
            return;
        }

        String totalBill = args[0];
        String groceryBill = args[1];
        String disocuntedType = args[2];
        CalculateNetBill objNetBill = new CalculateNetBill();
        String netBill = objNetBill.calculateNetBill(totalBill, groceryBill, disocuntedType);
        
        System.out.println("Net Bill is " + netBill);
    }
}
