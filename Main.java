class Main {
  public static void main(String[] args) {

   int myAge = 15;
   int myBirthday = 0617;
   int todaysDate = 0612;

    if (myBirthday == todaysDate)
    {
      System.out.print("Happy Birthday!!");
      System.out.println(" I am now " + (myAge + 1));  
    }
    else
    {
      System.out.print("It is not my birthday");
      System.out.println(" and I am still " + myAge);
    }
  }
}