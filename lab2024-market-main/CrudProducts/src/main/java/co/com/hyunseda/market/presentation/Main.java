
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.service.Factory;
import co.com.hyunseda.market.service.ProductRepository;
import co.com.hyunseda.market.service.Service;
import co.com.hyunseda.market.service.iCategory;
import co.com.hyunseda.market.service.iProductRepository;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iProductRepository repository = Factory.getInstance().getRepository("default");
        Service service = new Service(repository);
        GUIProducts instance = new GUIProducts(service);
        instance.setVisible(true);
    }
    
}
