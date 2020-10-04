package cse360assignment02;

/**
 *
 * @author Hutchinson-personal
 * This class can add, subtract from starting number 0
 */
public class AddingMachine 
{
  private int total;
  private String addUp;
  
  // constructor; sets total to 0
  public AddingMachine () 
  {
    total = 0;  		// not needed - included for clarity
    addUp = "0";
  }
  
  /**
  * purpose: returns total 
  * accessors method
  * return type: int (0)
  * parameters: none
  */
  public int getTotal () 
  {
    return total;
  }

  /**
  * purpose: adds a number to total; adds number to addUp as a string
  * assumptions: user is entering valid, positive number
  * mutator  method
  * return type: void
  * parameters: 1: int(value)
  */
  public void add (int value) 
  {
    total += value;
    addUp += " + ";
    addUp += String.valueOf(value);
  }

  /**
  * purpose: subtracts a number from total; adds number to addUp as a string
  * assumptions: user is entering valid, positive number
  * mutator  method
  * return type: void
  * parameters: 1: int(value)
  */
  public void subtract (int value) 
  {
    total -= value;
    addUp += " - ";
    addUp += String.valueOf(value);
  }

  /**
  * purpose: returns addUp
  * accessors  method
  * return type: String
  * parameters: none
  */
  public String toString () 
  {
    return addUp;
  }

  /**
  * purpose: none yet; should clear current total/memory
  * mutator  method
  * return type: void
  * parameters: none
  */
  public void clear() 
  {
    total = 0;
    addUp = "0";
  }
}