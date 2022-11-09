package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product = new Product(1, "Iphone Xr", 1000);
		Logger[] logger = { new DatabaseLogger(), new FileLogger() };
		ProductManager manager = new ProductManager(new HibernateProductDao(), logger);
		manager.add(product);
	}

}
