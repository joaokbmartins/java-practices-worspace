package section5;

public class Switch {

  public static void main(String[] args) {
    char variable = 'C';
    switch (variable) {
      case 'A':
        System.out.println(variable + " was found");
        break;
      case 'B':
        System.out.println(variable + " was found");
        break;
      case 'C':
        System.out.println(variable + " was found");
        break;
      case 'D':
        System.out.println(variable + " was found");
        break;
      case 'E':
        System.out.println(variable + " was found");
        break;
      default:
        System.out.println(variable + " was not found");
        break;
    }
  }

}
