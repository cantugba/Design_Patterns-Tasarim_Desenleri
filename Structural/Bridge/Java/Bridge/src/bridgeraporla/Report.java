/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeraporla;

/**
 *
 * @author asus
 */
public abstract class Report {
    public IReportFormat format;
    
    public Report(IReportFormat format){
        this.format = format;
    }

    public IReportFormat getFormat() {
        return format;
    }

    public void setFormat(IReportFormat format) {
        this.format = format;
    }

    abstract void Display();
}
