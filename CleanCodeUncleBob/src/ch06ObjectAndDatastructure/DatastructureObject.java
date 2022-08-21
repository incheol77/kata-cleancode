import org.w3c.dom.css.Rect;

// 절차적인 도형
//
// 세 가지 도형 클래스를 다룸. 
// 각 도형 클래스는 간단한 자료 구조 (아무 메서드도 제공하지 않는다.)
// 도형이 동작하는 방식은 Geometry 클래스에서 구현한다.

public class Square {
  public Point topLeft;
  public double side;
}

public class Rectangle {
  public Point topLeft;
  public double height;
  public double width;
}

public class Circle {
  public Point center;
  public double radius;
}

public class Geometry {
  public final double PI = 3.141592653589793;

  public double area(Object shape) throws NoSuchShapeException {
    if (shape instanceof Square) {
      Square s = (Square)shape;
      return s.side * s.side;
    }
    else if (shape instanceof Rectangle) {
      Rectangle r = (Rectangle)shape;
      return r.height * r.width;
    }
    else if (shape instanceof Circle) {
      Circle c = (Circle)shape;
      return PI * c.radius * c.radius;
    }
    throw new NoSushShapeException();
  }
}
// 이 클래스가 절차지향적이라 비판한다면 맞는 말이다.
// 하지만 그런 비판이 100% 옳다고 말하기는 어렵다.
// Geometry 클래스에 새 함수를 추가하면 도형 클래스는 아무 영향을 받지 않는다.
// 반면 새 도형을 추가한다면 Geometry 클래스에 속한 모든 함수를 고쳐야 한다.
// 두 조건은 완전히 정반대이다.


// 다음은 객체지향적인 도형 클래스이다. 
// 여기서 area()는 polymorphic 메서드이다. 
// 따라서 새 도형을 추가해도 기존 함수에 아무런 영향을 미치지 않는다.
// 반면 새 함수를 추가하고 싶다면 도형 클래스를 전부 고쳐야 한다.

public class Square implements Shape {
  private Point topLeft;
  private double side;

  public double area() {
    return side * side;
  }
}

public class Rectangle implements Shape {
  private Point topLeft;
  private double height;
  private double width;

  public double area() {
    return height * width;
  }
}

public class Circle implements Shape {
  private Point center;
  private double radius;
  public final double PI = 3.141592653589793;

  public double area() {
    return PI * radius * radius;
  }
}
// 상속없이 클래스에 메서드를 효과적으로 추가하기 위해 사용하는 visitor 패턴을 사용할 수도 있으나
// 합성 객체의 내부 구조가 visitor 에 열리게 되므로 캡슐화를 위반한다는 문제점이 있다.


// --- 결론 --- //
// 두 예제는 상호 보완적인 특질이 있다. (사실상 반대다!)
// 그래서 객체와 자료 구조는 근본적으로 양분된다.
// (자료구조는 사용하는) 절차적인 코드는 기존 자료 구조를 변경하지 않으면서 새 함수를 추가하기 쉽다.
// 반면, 객체 지향 코드는 기존 함수를 변경하지 않으면서 새 클래스를 추가하기 쉽다.
// 
// 절차적인 코드는 새로운 자료 구조를 추가하기 어렵다. 그러려면 모든 함수를 고쳐야 한다.
// 객체 지향 코드는 새로운 함수를 추가하기 어렵다. 그러려면 모든 클래스를 고쳐야 한다.


// 다시 말해, 객체 지향 코드에서 어려운 변경은 절차적인 코드에서 쉬우며, 
// 절차적인 코드에서 어려운 변경은 객체 지향 코드에서 쉽다!
// 
// 복잡한 시스템을 짜다 보면 새로운 함수가 아니라 새로운 자료 타입이 필요한 경우가 생긴다.
// 이때는 클래스와 객체 지향 기법이 가장 적합하다.
// 반면, 새로운 자료 타입이 아니라 새로운 함수가 필요한 경우도 생긴다. 
// 이때는 절차적인 코드와 자료구조가 좀 더 적합하다.
//
// 분별 있는 프로그래머는 모든 것이 객체라는 생각이 미신임을 잘 안다.
// 때로는 단순한 자료 구조와 절차적인 코드가 가장 적합한 상황도 있다.

// (새로운 자료 타입을 추가하는 유연성이 필요하면 객체가 더 적합)
// (새로운 동작을 추가하는 유연성이 필요하면 자료주고와 절차적인 코드가 더 적합)
// 
// 우수한 소프트웨어 개발자는 편견없이 이 사실을 이해해 직면한 문제에 최적인 해결책을 선택한다.
//
// 출처 : 클린코드 (로버트 C.마틴)