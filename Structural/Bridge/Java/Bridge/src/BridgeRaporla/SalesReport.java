/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgeRaporla;

/**
 *
 * @author asus
 */
public class SalesReport extends Report{

    public SalesReport(IReportFormat format) {
        super(format);
    }

    @Override
    void Display() {
       format.genearate();
    }
    
}
