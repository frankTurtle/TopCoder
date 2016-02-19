/**
 * Created by Barret J. Nobel on 2/19/2016.
 * TopCoder practice
 * takes two Strings, a key and a code
 * it decodes it and gives you the value
 */
public class Substitute {
    public static void main( String [] args ){
        System.out.println( getValue("CRYSTALBUM", "MMA") );
    }

    // Method to do all the work
    // takes in a key and the code
    // spits out the value
    public static int getValue(String key, String code){
        String returnString = ""; //.............................................. variable to concatenate the value to

        for( int i = 0; i < code.length(); i++ ){ //.............................. loop through each character in code
            for( int j = 0; j < key.length(); j++ ){ //........................... compare to each character in the key
                if( code.charAt(i) == key.charAt(j) ) //.......................... if they're equal
                    returnString += ( j == key.length() - 1 ) ? 0 : ( j + 1 ); //. check to see if its the last character first then assign values
            }
        }
        return Integer.parseInt( returnString );
    }
}
