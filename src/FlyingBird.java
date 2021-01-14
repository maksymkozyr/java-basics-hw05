public abstract class FlyingBird extends Bird {

  public void checkWings() {
    System.out.println("Wings are checked");
  }
  @Override
  public void eat(){
    System.out.println("FlyingBird eat");

  }
}
