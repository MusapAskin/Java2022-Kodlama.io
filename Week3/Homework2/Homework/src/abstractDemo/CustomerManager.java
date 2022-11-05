package abstractDemo;

public class CustomerManager {
	private BaseDatabaseManager baseDatabaseManager;

	public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
		this.baseDatabaseManager = baseDatabaseManager;
	}

	public void getCustomer() {
		baseDatabaseManager.getData();
	}
}
