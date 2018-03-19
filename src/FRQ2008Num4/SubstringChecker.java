package FRQ2008Num4;

public class SubstringChecker implements Checker {
	 private String substring;

	  public SubstringChecker(String item)
	  {
	    substring = item;
	  }

	  public boolean accept(String text)
	  {
	    return text.indexOf(substring) >= 0;
	  }
}
