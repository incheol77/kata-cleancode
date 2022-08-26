// 다음 두 클래스 모두 2차원 점을 표현한다.
// 그런데 한 클래스는 구현을 외부로 노출하고 다른 클래스는 구현을 완전히 숨긴다.
//

// Point1 은 확실히 직교좌표계를 사용한다.
// 또한 개별적으로 좌표값을 읽고 설정하게 강제하므로 구현을 노출한다.
// 변수를 private 으로 선언하더라도 각 값마다 조회(get) 함수와 설정(set) 함수를 제공한다면
// 구현을 외부로 노출하는 셈이다.

public class Point1 {
  public double x;
  public double y;
}


// 변수 사이에 함수라는 계층을 넣는다고 구현이 저절로 감춰지지 않는다.
// 구현을 감추려면 추상화가 필요하다!
// 조회 함수와 설정 함수로 변수를 다룬다고 클래스가 되지 않는다.
// 그보다는 추상 인터페이스를 제공해 사용자가 구현을 모른 채 자료의 핵심을 조작할 수 있어야
// 진정한 의미의 클래스이다.

public class Point1_1 {
  private double x;
  private double y;

  public void setX(double x) {
    this.x = x;
  }

  public double getX() {
    return this.x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getY() {
    return this.y;
  }
}

// Point2 는 직교좌표계를 사용하는지 극좌표계를 사용하는지 알 길이 없다.
// 둘 다 아닐지도 모른다! 그럼에도 불구하고 인터페이스는 자료구조를 명백하게 표현한다.
// 사실 이것은 자료구조 이상을 표현한다. 클래스 메서드가 접근 정책을 강제한다.
// 좌표를 읽을 때는 각 값을 개별적으로 읽어야 한다. 하지만 좌표를 설정할 때는
// 두 값을 한꺼번에 설정해야 한다.

public interface Point2 {
  double getX();
  double getY();
  void setCartesian(double x, double y);
  double getR();
  double getTheta();
  void setPolar(double r, double theta);
}

////////////////////


// 아래 Vehicle1 은 자동차 연료 상태를 구체적인 숫자값으로 알려준다.
// 따라서 두 함수가 변수값을 읽어 반환할 뿐이라는 사실이 거의 확실하다.
public interface Vehicle1 {
  double getFuelTankCapacityInGallons();
  double getGallonOfGasoline();
}


// Vehicle2 는 자동차 연료 상태를 백분율이라는 추상적인 개념으로 알려준다.
// 따라서 정보가 어디서 오는지 전혀 드러나지 않는다.
public interface Vehicle2 {
  double getPercentFuelRemaining();
}


// Point2 와 Vehicle2 가 더 바람직하다.
// 자료를 세세하게 공개하기보다는 추상적인 개념으로 표현하는 편이 좋다.
// 인터페이스나 조회/설정 함수만으로는 추상화가 이뤄지지 않는다.
// 개발자는 객체가 포함하는 자료를 표현할 가장 좋은 방법을 심각하게 고민해야 한다.
// 아무 생각 없이 조회/설정 함수를 추가하는 방법이 가장 나쁘다.
//
// 출처 : 클린코드 (로버트 C.마틴)