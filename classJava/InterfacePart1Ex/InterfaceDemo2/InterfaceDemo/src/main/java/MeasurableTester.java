/**
   This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
      // Calling the average method with an array of BankAccount objects
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);

      double averageBalance = Data.average(accounts);
      System.out.println("Average balance: " + averageBalance);
      System.out.println("Expected: 4000");

      // Calling the average method with an array of Country objects
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      double averageArea = Data.average(countries);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 239950");
      
      Measurable[] employees = new Measurable[3];
      employees[0] = new Employee(77000, "Mark", 55);
      employees[1] = new Employee(56000, "Sarah", 45);
      employees[2] = new Employee(35000, "Emily", 27);
       System.out.println(Data.average(employees));
       BankAccount acc = (BankAccount)accounts[0];
       //BankAccount acc1 = (BankAccount)countries[0]; //Error
       System.out.println(acc.getBalance());
       
       Measurable lagerItem = Data.larger(employees[0], employees[1]);
       Employee higherSalary = (Employee)lagerItem;
       System.out.println(higherSalary.getName());
       //or
       Employee MaxSalary = (Employee)Data.larger(employees[0], employees[1]);
       //or
       Measurable largerItem2 = Data.larger(employees[0], employees[1]);
       System.out.println(((Employee)largerItem2).getName());
   }
}
