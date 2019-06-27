/**
 * 
 */
package behavior_pattern.chain_of_responsibility_pattern;

/**
 * @author Administrator
 *
 */
public class ChainPatternDemo {
	private static AbstractLogger getChainAbstractLogger(){
		AbstractLogger consoleAbstractLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileAbstractLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorAbstractLogger = new ErrorLogger(AbstractLogger.ERROR);
		consoleAbstractLogger.setNextLogger(fileAbstractLogger);
		fileAbstractLogger.setNextLogger(errorAbstractLogger);
		return consoleAbstractLogger;
	}
	/**
	 * @Description:责任链模式
	 * 请求一个个传递处理
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-18下午3:07:27
	 */
	public static void main(String[] args) {
		AbstractLogger abstractLogger = getChainAbstractLogger();
		abstractLogger.logMessage(AbstractLogger.ERROR, "info message");
	}

}
