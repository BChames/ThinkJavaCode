/**
 * Fruit exercise.
 */

/*
The purpose of this exercise is to practice reading code and recognizing the traversal
patterns in this chapter. The following methods are hard to read, because instead of using
meaningful names for the variables and methods, they use names of fruit.
For each method, write one sentence that describes what the method does, without getting
 into the details of how it works. For each variable, identify the role it plays.
 */
public class Fruit {
//Int method defining an int array named "a". one param
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        //While 'i' is less than the array length
        while (i < a.length) {
            kiwi = kiwi * a[i]; //array counting by 1
            i++;// allows i to traverse through the index by 1
        }
        return kiwi; // ==3
    }
    //Two params. Int method defining an int array named "a". param for an int variable # of grapes
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) { // As long as 'i' is below the array length run the code below.
            if (a[i] == grape) { // When the index i is equal to grape
                return i; //return i's index
            }
        }
        return -1; // return once the loop is complete
    }
   // Two params. Int method defining an int array named "a". param for an int variable # of apple
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) { //for each pine value in the a[] run this loop
            if (pine == apple) {
                pear++; //pear adds one every time the if statement is true
            }
        }
        return pear; //return the new value after the loop is done
    }

}
