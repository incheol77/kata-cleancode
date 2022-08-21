// 패키지 선언부, import 문, 각 함수 사이에 빈 행이 들어간다.
// 간단한 규칙이지만 코드의 세로 레이아웃에 심오한 영향을 미친다.
// 빈 행은 새로운 개념을 시작한다는 시각적 단서다. 
// 코드를 읽어 내려가다 보면 빈 행 바로 다음 줄에 눈길이 멈춘다.
// 출처 : 클린코드 (로버트 C.마틴)

package fitnesse.wikitext.widgets;

import java.util.regex.*;

public class BoldWidget extends ParentWidget {
  public static final String REGEXP = "'''.+?'''";
  private static final Pattern pattern = Pattern.compile("'''(.+?)'''"
    Pattern.MULTILINE + Pattern.DOTALL
  );

  public BoldWidget(ParentWidget parent, String text) throws Exception {
    super(parent);
    Matcher match = pattern.matcher(text);
    match.find();
    addChildWidgets(match.group(1));
  }

  public String render() throws Exception {
    StringBuffer html = new StringBuffer("<b>");
    html.append(childHtml()).append("</b>");
    return html.toString();
  }
}