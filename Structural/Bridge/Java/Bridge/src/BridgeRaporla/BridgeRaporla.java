
package BridgeRaporla;

/**
 *
 * @author asus
 */
public class BridgeRaporla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Report rapor= new SalesReport(new WebFormat());
        rapor.Display();
    }
    
}
