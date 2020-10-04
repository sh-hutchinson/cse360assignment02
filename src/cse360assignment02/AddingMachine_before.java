package cse360assignment02;

/**
 *
 * @author Hutchinson-personal
 * This class can add, subtract from starting number 0
 */
public class AddingMachine_before 
{
    private int total;

      // constructor; sets total to 0
      public AddingMachine_before () {
        total = 0;  		// not needed - included for clarity
      }

      /**
      * purpose: now: returns 0; should return total 
      * accessors method
      * return type: int (0)
      * parameters: none
      */
      public int getTotal () {
        return 0;
      }

      /**
      * purpose: none yet; should add to total
      * mutator  method
      * return type: void
      * parameters: 1: int(value)
      */
      public void add (int value) {
      }

      /**
      * purpose: none yet; should subtract from total
      * mutator  method
      * return type: void
      * parameters: 1: int(value)
      */
      public void subtract (int value) {
      }

      /**
      * purpose: now: returns ""; should return total
      * accessors method
      * return type: String
      * parameters: none
      */
      public String toString () {
        return "";
      }

      /**
      * purpose: none yet; should clear current total/memory
      * mutator  method
      * return type: void
      * parameters: none
      */
      public void clear() {
      }

}
