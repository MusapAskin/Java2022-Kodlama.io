package innerClassAndStatic;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Mouse", 300);
		ProductManager manager = new ProductManager();
		manager.add(product);

		CrudDatabaseHelper.Crud.delete();
		ConnectionDatabaseHelper.Connection.creatConnection();
	}
}
