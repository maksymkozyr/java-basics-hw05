public abstract class Bird {

  public void eat() {
    System.out.println("bird eat");
  }
  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
