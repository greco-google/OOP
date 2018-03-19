package FRQ2008Num4;

public class AndChecker implements Checker{

	private Checker checkerv1, checkerv2;

	  public AndChecker(NotChecker notChecker, NotChecker notChecker2)
	  {
	    checkerv1 = (Checker) notChecker;
	    checkerv2 = (Checker) notChecker2;
	  }

	  public boolean accept(String text)
	  {
	    return checkerv1.accept(text) && checkerv2.accept(text);
	  }
}
