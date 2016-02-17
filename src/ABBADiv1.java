/**
 * Created by BigB on 2/17/16.
 */
public class ABBADiv1{

    public static void main( String[] args ){

        System.out.println( canObtain("AAABBAABB", "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB") );

    }

    public static String canObtain( String initial, String target ){
        if( initial.length() == target.length() ){
            return ( initial.equals(target) ) ? "Possible" : "Impossible";
        }
        else{
                String addA = initial + "A";
                String addB = reverse( initial );

                if( isSubString(addB, target) )
                    return canObtain( addB, target );

                else if( isSubString(addA, target) ){
                    return canObtain( addA, target );
                }
        }

        return "Impossiblee";
    }

    private static String reverse( String addToMe ){
        String returnString = "B";

        for( int i = addToMe.length(); i > 0; i-- ){
            returnString += addToMe.charAt( i - 1 );
        }

        return returnString;
    }

    private static boolean isSubString( String check, String against ){

        return against.toLowerCase().contains(check.toLowerCase());
//
//        System.out.println( "check: " + check + " " + check.length());
//        System.out.println( "against: " + against + " " + against.length());
//        for( int i = 0; i <= (against.length() - check.length()); i++ ){
//
//            System.out.println( i );
//
//            if( against.substring(i, check.length()).equals(check) )
//                return true;
//        }
//
//        return false;
    }

}


