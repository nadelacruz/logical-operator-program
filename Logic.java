import java.util.Scanner;

class Logic {
  public static void main(String[] args) {
    Logic logic = new Logic();
    Scanner input = new Scanner(System.in);
    int choice = 0;

    while (true) {

      System.out.println("Welcome to the logical operator program!");
      System.out.println("Please select your logical operator.");
      System.out.println("1. Negation (NOT)");
      System.out.println("2. Conjunction (AND)");
      System.out.println("3. Disjunction (OR)");
      System.out.println("4. Exclusive OR (XOR)");
      System.out.println("5. Conditional");
      System.out.println("6. Biconditional");
      System.out.println();
      System.out.print("Your Choice? ");

      choice = input.nextInt();

      if (choice >= 1 && choice <= 6) {
        break;
      }

    }

    boolean propositionOne = false;
    boolean propositionTwo = false;

    System.out.print("Please enter proposition 1 (Enter either true or false): ");
    propositionOne = input.nextBoolean();

    if (choice != 1) {
      System.out.print("Please enter proposition 2 (Enter either true or false): ");
      propositionTwo = input.nextBoolean();
    }

    System.out.println();

    switch (choice) {
      case 1:
        System.out.println("The result of NOT proposition 1 is: " + !propositionOne);
        break;
      case 2:
        System.out.println("The result of proposition 1 AND proposition 2 is: " + (propositionOne && propositionTwo));
        break;
      case 3:
        System.out.println("The result of proposition 1 OR proposition 2 is: " + (propositionOne || propositionTwo));
        break;
      case 4:
        System.out.println(
            "The result of propositioin 1 XOR proposition 2 is: " + logic.xorOperator(propositionOne, propositionTwo));
        break;
      case 5:
        System.out.println("The result of proposition 1 conditional proposition 2 is: "
            + logic.conditionalOperator(propositionOne, propositionTwo));
        break;
      case 6:
        System.out.println("The result of proposition 1 biconditional proposition 2 is: "
            + !logic.xorOperator(propositionOne, propositionTwo));
        break;
      default:
        break;
    }

    input.close();
  }

  public boolean xorOperator(boolean operandOne, boolean operandTwo) {
    if ((operandOne == true && operandTwo == false) || (operandOne == false && operandTwo == true)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean conditionalOperator(boolean operandOne, boolean operandTwo) {
    if (operandOne == true && operandTwo == false) {
      return false;
    } else {
      return true;
    }
  }
}