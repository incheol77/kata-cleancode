// 세로 밀집도
// 줄바꿈이 개념을 분리한다면 세로 밀집도는 연관성을 의미한다.
// 출처 : 클린코드 (로버트 C.마틴)

public class ReporterConfig {
  /**
   * 리포터 리스터의 클래스 이름
   */
  private String m_className;

  /**
   * 리포터 리스터의 속성
   */
  private List<Property> m_properties = new ArrayList<Property>();
  public void addProperty(Property property) {
    m_properties.add(property);
  }
}