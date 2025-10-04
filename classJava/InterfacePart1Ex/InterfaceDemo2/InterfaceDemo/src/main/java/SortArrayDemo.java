
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class SortArrayDemo {
    public static void main(String[] args) {
      BankAccount[] accounts = new BankAccount[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);
      
      Arrays.sort(accounts);
      for(int i =0; i<accounts.length; i++){
          System.out.println(accounts[i]);
      }
      
      Country[] countries = new Country[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      
      Arrays.sort(countries);
      for(Country country : countries){
          System.out.println(country);
      }
        System.out.println(accounts[0].compareTo(countries[0]));//Will throw a run time error
       // System.out.println(countries[0].compareTo(accounts[0])); // Will generate a compile error
    }
}
