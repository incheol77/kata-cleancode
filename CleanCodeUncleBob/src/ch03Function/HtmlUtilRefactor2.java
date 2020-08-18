package ch03Function;

public class HtmlUtilRefactor2 {
	public static String renderPageWithSetupAndTeardowns (
		PageData pageData, boolean isSuite
	) throws Exception {
		boolean isTestPage = pageData.hasAttribute("Test");
		if (isTestPage) {
			WikiPage testPage = pageData.getWikiPage();
			StringBuffer newPageContent = new StringBuffer();
			includeSetupPages(testPage, newPageContent, isSuite);
			newPageContent.append(pageData.getContent());
			includeTeardownPages(testPage, newPageContent, isSuite);
			pageData.setContent(newPageContent.toString());
		}
		return pageData.getHtml();
	}
}
