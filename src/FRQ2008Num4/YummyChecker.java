package FRQ2008Num4;

public class YummyChecker {

	protected Object aChecker;
	protected Object kChecker;
	Checker yummyChecker = new AndChecker(new NotChecker(aChecker), new NotChecker(kChecker));
	
}
