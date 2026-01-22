package static_access_modifier;

class TestStaticBlocks {
  private static int count = 0;

  /**
   * I don't know common usages of this, but this runs after 
   * the static variables declaration process, allowing some code
   * to be executed.
   */
  static {
    count += 1;
    count += 1;
    count += 1;
  }

  public static void main(String[] args){
    IO.println(TestStaticBlocks.count);
  }
}
