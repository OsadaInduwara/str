package strategypattern;

import strategypattern.Strategies.Play;
import strategypattern.Strategies.Points;
import strategypattern.Strategies.Instructions;
import strategypattern.Strategies.Quit;

public class Context {
	    private final Strategies str1 = new Play();
        private final Strategies str2 = new Points();
        private final Strategies str3 = new Instructions();
        private final Strategies str4 = new Quit();
        
	public void execute(){
		        str1.executeParameters();
                str2.executeParameters();
                str3.executeParameters();
                str4.executeParameters();
	}
}




