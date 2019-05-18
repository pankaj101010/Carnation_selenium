package pomTesting;

public class TestCases {
public  void Tc_01() {
	Keyword.openBrowser();
	Keyword.openUrl();
	HomePage.enterTextinSearchBox("samples test");
}
public static void main(String[] args) {
	
	TestCases cs = new TestCases();
	cs.Tc_01();
}
}
