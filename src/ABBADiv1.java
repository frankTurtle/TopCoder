/**
 * Created by Barret J. Nobel on 2/17/16.
 * TopCoder Practice
 * Takes two Strings
 * determines if ( based on the rules ) the second String is able to be produced
 * rules:
 * 1. Add an A to the end
 * 2. Add a B to the end, then reverse the entire string
 */
public class ABBADiv1{

    public static void main( String[] args ){

        System.out.println( canObtain("AAABAAABB", "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB") );

    }

    // Requied method
    // takes two strings and returns "Possible" if it's possible and "Impossible" if not!
    public static String canObtain( String initial, String target ){
        if( initial.length() == target.length() ){ //...................................... if the strings are equal length compare
            return ( initial.equals(target) ) ? "Possible" : "Impossible";
        }
        else{ //........................................................................... if they're not the same length
            String addA = initial + "A"; //................................................ create a temp string with the A at the end
            String addB = "B" + reverse( initial ); //..................................... create a temp string, reversed with a B at the front

            if( isSubString(addB, target) || isSubString(reverse(addB), target) ) //....... if addB string ( as well as the reversed version ) is a substring of the goal
                return canObtain( addB, target ); //....................................... recursively call with the new value of the string

            else if( isSubString(addA, target) || isSubString(reverse(addA), target)){ //.. same for addA string
                return canObtain( addA, target );
            }
        }

        return "Impossible"; //............................................................ if they're not substrings and not equal length its not possible
    }

    // Method to reverse the string passed in
    private static String reverse( String addToMe ){
        String returnString = ""; //...................... temp string to be returned

        for( int i = addToMe.length(); i > 0; i-- ){ //... loop through each char in the string starting from the end
            returnString += addToMe.charAt( i - 1 ); //... concatenate to the return string
        }

        return returnString;
    }

    // Method to determine if a string is a substring of another
    private static boolean isSubString( String check, String against ){
        return against.toLowerCase().contains(check.toLowerCase());
    }
}


