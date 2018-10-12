package com.mycompany.bill;

import junit.framework.TestCase;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculateNetBillTest extends TestCase{
    public CalculateNetBillTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @see CalculateNetBill#calculateNetBill(String,String,String)
     */
    @Test
    public void testCalculateNetBill_EGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Employee discount with grocery and over 100
        assertEquals("180.50",testObj.calculateNetBill("250", "50", "E"));
        
        
    }
    @Test
    public void testCalculateNetBill_ENGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Employee discount without grocery and over 100
        assertEquals("133.00",testObj.calculateNetBill("200", "0", "E"));
        
    }
    @Test
    // test Employee discount without grocery and less than 100
    public void testCalculateNetBill_ENGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Employee discount without grocery and less than 100
        assertEquals("84.00",testObj.calculateNetBill("120", "0", "E"));       
           
    }
    
    public void testCalculateNetBill_EGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Employee discount with grocery and lessthan 100
        assertEquals("85.00",testObj.calculateNetBill("100", "50", "E"));
        
        
    }
    
    public void testCalculateNetBill_AGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Affiliate discount with grocery and over 100
        assertEquals("218.50",testObj.calculateNetBill("250", "50", "C"));
        
        
    }
    @Test
    public void testCalculateNetBill_ANGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Affiliate discount without grocery and over 100
        assertEquals("171.00",testObj.calculateNetBill("200", "0", "C"));
        
    }
    @Test
    // test Affiliate discount without grocery and less than 100
    public void testCalculateNetBill_ANGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Affiliate discount without grocery and less than 100
        assertEquals("90.00",testObj.calculateNetBill("100", "0", "C"));       
           
    }
    
    public void testCalculateNetBill_AGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Affiliate discount with grocery and lessthan 100
        assertEquals("95.00",testObj.calculateNetBill("100", "50", "C"));
        
        
    }
    
    public void testCalculateNetBill_LGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test LongTermCustomer discount with grocery and over 100
        assertEquals("228.00",testObj.calculateNetBill("250", "50", "L"));
        
        
    }
    @Test
    public void testCalculateNetBill_LNGO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test Employee discount without grocery and over 100
        assertEquals("180.50",testObj.calculateNetBill("200", "0", "L"));
        
    }
    @Test
    // test LongTermCustomer discount without grocery and less than 100
    public void testCalculateNetBill_LNGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test LongTermCustomer discount without grocery and less than 100
        assertEquals("95.00",testObj.calculateNetBill("100", "0", "L"));       
           
    }
    
    public void testCalculateNetBill_LGLO() {
        CalculateNetBill testObj = new CalculateNetBill();
        // test LongTermCustomer discount with grocery and lessthan 100
        assertEquals("97.50",testObj.calculateNetBill("100", "50", "L"));
        
        
    }





    /**
     * @see CalculateNetBill#main(java.lang.String[])
     */
   
}
