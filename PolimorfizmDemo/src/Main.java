
public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger emailLogger = new EmailLogger();
		 * emailLogger.Log("Loglama iþlemi gerçekleþti!!");
		 * 
		 * DatabaseLogger logger = new DatabaseLogger();
		 * logger.Log("Loglama iþlemi gerçekleþti!!");
		 */
		
		/*
		 * BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(), new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger: loggers) { logger.Log("Log mesajý");
		 * 
		 * }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
