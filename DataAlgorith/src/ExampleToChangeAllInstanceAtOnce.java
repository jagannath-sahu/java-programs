import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleToChangeAllInstanceAtOnce {

  private static List<ExampleToChangeAllInstanceAtOnce> all = Collections.synchronizedList(
      new ArrayList<>());

  public volatile int _x; //_x and _y are NOT static
  public volatile int _y;

  ExampleToChangeAllInstanceAtOnce (int x, int y) {
      this._x = x;
      this._y = y;
      ExampleToChangeAllInstanceAtOnce.all.add(this);
  }

  public void zeroThem() {
      _x = 0;
      _y = 0;
  }

  @Override
  public String toString() {
    return "Example [_x=" + _x + ", _y=" + _y + "]";
  }

  public static void zeroAll() {
      synchronized(ExampleToChangeAllInstanceAtOnce.all) {
        ExampleToChangeAllInstanceAtOnce.all.forEach(ExampleToChangeAllInstanceAtOnce::zeroThem);
      }
  }

  public static void main(String[] args) {
    ExampleToChangeAllInstanceAtOnce e1 = new ExampleToChangeAllInstanceAtOnce(5,6);
    ExampleToChangeAllInstanceAtOnce e2 = new ExampleToChangeAllInstanceAtOnce(1,2);
    System.out.println("Intial Values: " + e1 + "->" + e2);
    ExampleToChangeAllInstanceAtOnce.zeroAll();
    System.out.println("Updated Values: " + e1 + "->" + e2);
  }

}
