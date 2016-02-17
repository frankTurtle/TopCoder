/**
 * Created by BigB on 2/17/16.
 */
public class ABBADiv1{
    public String canObtain( String initial, String target ){
        String initialCopy = initial;

        if( initialCopy.length() == target.length() ){
            return ( initialCopy.equals(target) ) ? "Possible" : "Impossible";
        }
        else{
            if( isSubString(reverse(initialCopy), target) ) return canObtain( reverse(initialCopy), target );
            if( isSubString(initialCopy += "A", target) ) return canObtain( initialCopy += "A", target );
        }

        return "here";
    }

    private String reverse( String addToMe ){
        String returnString = "B";

        for( int i = addToMe.length(); i > 0; i-- ){
            returnString += addToMe.charAt( i - 1 );
        }

        return returnString;
    }

    private boolean isSubString( String check, String against ){
        for( int i = 0; i <= (against.length() - check.length()); i++ ){
            if( against.substring(i, (check.length()) ).equals(check) )
                return true;
        }
        return false;
    }

}


