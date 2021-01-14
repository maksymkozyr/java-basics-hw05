import java.util.List;

public class Zoo {

  public static String aaa;

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO feed birds in the cycle
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {

    list.add(bird);
    System.out.println(bird);
    System.out.println("Accepting a bird to a section");
    for (Object o: list) {
      if (o instanceof FlyingBird) {
        ((FlyingBird) o).checkWings();
      }
    }
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<Bird> list, Bird newBird) {

    list.add(newBird);
    System.out.println("Adding a bird to the birds list");

    for (Bird b: list){
      System.out.println(b);
    }
  }
}