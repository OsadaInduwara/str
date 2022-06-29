package strategypattern;

public interface Strategies {
    public void executeParameters();
    
    public class Play implements Strategies {
        @Override
	public void executeParameters() {
		System.out.println("Play");
	}
    }
    public class Points implements Strategies {
        @Override
	public void executeParameters() {
		System.out.println("Points");
	}
    }
    public class Instructions implements Strategies {
        @Override
	public void executeParameters() {
		System.out.println("Instructions");
	}
    }
    public class Quit implements Strategies {
        @Override
	public void executeParameters() {
		System.out.println("Quit");
	}
    }
}
    
    

