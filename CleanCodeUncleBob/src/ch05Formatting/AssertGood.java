// 개념적 유사성
// 어떤 코드는 서로 끌어당긴다. 개념적인 친화도가 높기 때문이다.
// 친화도가 높을수록 코드를 가까이 배치한다.
// 친화도가 높은 요인 : 
//  - 한 함수가 다른 함수를 호출해 생기는 직접적인 종속성
//  - 변수와 그 변수를 사용하는 함수
//  - 비슷한 동작을 수행하는 일군의 함수 (다음의 예)
// 다음 함수들은 개념적인 친화도가 매우 높다. 명명법이 똑같고 기본 기능이 유사한고 간단하다.
// 종속적인 관계가 없더라도 가까이 배치할 함수들이다. 
//
// 출처 : 클린코드 (로버트 C.마틴)

public class Assert {
  static public void assertTrue(String message, boolean condition) {
    if (!condition)
      fail(message);
  }

  static public void assertTrue(boolean condition) {
    assertTrue(null, condition);
  }

  static public void assertFalse(String message, boolean condition) {
    assertTrue(message, !condition);
  }

  static public void assertFalse(boolean condition) {
    assertFalse(null, condition);
  }
}