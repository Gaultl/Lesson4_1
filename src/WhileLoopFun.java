/*
Learning Targets:
Students will be able to:

    *Represent iterative processes using a while loop
    *Execute a return or break statement inside an iteration statement to halt the loop and exit the method
    *Develop an algorithm
    *Identify if an integer is or is not evenly divisible by another integer
    *Determine a minimum or maximum value
    *Compute a sum, average, or mode
 */
/*
    Template for while loop

    //initialize loop control variable
    while ( some boolean expression) {
        //loop stuff accessed if boolean expression true
        //more loop stuff
        ...
        //update loop control variable
 */


public class WhileLoopFun {

    public static void main(String[] args) {
        //count to 10
        int count = 1;
        while(count < 10){
            System.out.print(count + " ");
            count ++;
        }

        System.out.println("");

        //what does this code loop do? Do this without running it
        count = 2;
        while(count <= 100){
            System.out.print(count + " ");
            count *= 2;
        }
        System.out.println();
        //write a loop that counts by 5 until you get to 100
        count = 0;
        while (count <= 100){
            System.out.print(count + " ");
            count += 5;
        }
        System.out.println(" ");
        //write a loop that counts down from 10 to 1 then prints "Blast off!"
        count = 10;
        while (count > 0){
            System.out.print(count + " ");
            count --;
        }
        System.out.print("Blast Off!!");
        //loop mistakes and while vs do while loop
        //make an infinite loop happen
        count = 5;
        do{
            System.out.println("Do something at least once");
        } while (count >= 10);


    }
}
