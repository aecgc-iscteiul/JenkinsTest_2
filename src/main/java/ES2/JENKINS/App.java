package ES2.JENKINS;

/**
 * Hello world!
 *
 */
public class App {
	
	private boolean testable;
	
    public App() {
		super();
		this.testable = true;
	}

    

	public boolean isTestable() {
		return testable;
	}



	public void setTestable(boolean testable) {
		this.testable = testable;
	}



	public static void main( String[] args ) {
        System.out.println( "Hello Ana!" );
    }
}
