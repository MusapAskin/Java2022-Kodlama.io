package innerClassAndStatic;

public class CrudDatabaseHelper {
	public static class Crud {
		public static void delete() {
			System.out.println("Deleted.");
		}

		public static void update() {
			System.out.println("Updated");
		}
	}
}
