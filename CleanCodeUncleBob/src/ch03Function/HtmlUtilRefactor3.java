package ch03Function;

public class HtmlUtilRefactor3 {
	public static String renderPageWithSetupAndTeardowns(
		PageData pageData, boolean isSuite) throws Exception {
		if (isTestPage(pageData))
			includeSetupAndTeardownPages(pageData, isSuite);
		return pageData.getHtml();
	}
}
