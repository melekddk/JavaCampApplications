
public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger emailLogger = new EmailLogger();
		 * emailLogger.Log("Loglama i�lemi ger�ekle�ti!!");
		 * 
		 * DatabaseLogger logger = new DatabaseLogger();
		 * logger.Log("Loglama i�lemi ger�ekle�ti!!");
		 */
		
		/*
		 * BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(), new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger: loggers) { logger.Log("Log mesaj�");
		 * 
		 * }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
