package factoryMethod;

public class Client {

	public static void main(String[] args) {
		LoggerFactory factory1;
		Logger logger1;
		factory1=new FileLoggerFactory();
		logger1=factory1.createLogger();
		logger1.writeLog();
		
		LoggerFactory factory2;
		Logger logger2;
		factory2 =(LoggerFactory) XMLUtil.getBean();
		logger2= factory2.createLogger();
		logger2.writeLog();
	}

}
