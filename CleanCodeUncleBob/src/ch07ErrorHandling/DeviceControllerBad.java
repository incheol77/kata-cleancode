// 뭔가 잘못될 가능성은 늘 존재한다. 
// 뭔가 잘못되면 바로 잡을 책임은 바로 우리 프로그래머에게 있다.
// 깨끗한 코드와 오류 처리는 확실히 연관성이 있다.
// 여기저기 흩어진 오류 처리 코드 때문에 실제 코드가 하는 일을 파악하기가 
// 거의 불가능하다는 의미이다. 오류 처리는 중요하다.
// 하지만 오류 처리 코드로 인해 프로그램 논리를 이해하기 어려워진다면 깨끗한 코드라 부르기 어렵다.
//


// 오류 코드보다 예외를 사용하라.
//
// 얼마 전까지만 해도 예외를 지원하지 않는 프로그래밍 언어가 많았다. 예외를 지원하지 
// 않는 언어는 오류를 처리하고 보고하는 방법이 제한적이었다. 
// 오류 플래그를 설정하거나 호출자에게 오류 코드를 반환하는 방법이 전부였다.
// 다음은 이와 같은 방법을 보여준다. 
public class DeviceController {
  ...
  public void sendShutDown() {
    DeviceHandle handle = getHandle(DEV1);
    // 디바이스 상태를 점검한다.
    if (handle != DeviceHandle.INVALID) {
      // 레코드 필드에 디바이스 상태를 저장한다.
      DeviceRecord record = retrieveDeviceRecord(handle);
      // 디바이스가 일시정지 상태가 아니라면 종료한다.
      if (record.getStatus() != DEVICE_SUSPENDED) {
        pauseDevice(handle);
        clearDeviceWorkQueue(handle);
        closeDevice(handle);
      } else {
        logger.log("Device suspended. Unable to shutdown");
      }
    } else {
      logger.log("Invalid handle for: " + DEV1.toString());
    }
  }
  ...
}


// 최소한 이 정도는... (by ickim)
public class DeviceController {
  ...
  public void sendShutDown() {
    DeviceHandle handle = getHandle(DEV1);
    // 디바이스 상태를 점검한다.
    if (handle == DeviceHandle.INVALID) {
      logger.log("Invalid handle for: " + DEV1.toString());
    }
    // 레코드 필드에 디바이스 상태를 저장한다.
    DeviceRecord record = retrieveDeviceRecord(handle);
    if (record.getStatus() == DEVICE_SUSPENDED) {
      logger.log("Device suspended. Unable to shutdown");
    }
    // 디바이스가 일시정지 상태가 아니라면 종료한다.
    pauseDevice(handle);
    clearDeviceWorkQueue(handle);
    closeDevice(handle);
  }
  ...
}

// 위와 같은 방법을 사용하면 코드가 복잡해진다. 함수를 호출한 즉시 오류를 확인해야 하기 때문이다.
// 그래서 오류가 발생하면 예외를 던지는 편이 낫다. 
// (코드가 더 깔끔해짐. 논리가 오류 처리 코드와 뒤섞이지 않으니까)

