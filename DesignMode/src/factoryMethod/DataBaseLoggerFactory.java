package factoryMethod;

public class DataBaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		Logger logger=new DataBaseLogger();
		return logger;
	}

}
