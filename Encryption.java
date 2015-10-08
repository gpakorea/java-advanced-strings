/*
 * Encryption.java
 */

import java.util.Scanner;

public class Encryption {
  
  // constructor method
  public Encryption() {
    
  }
  
  // encrypt() method accepts a String and returns babble
  public String encrypt( String msg ) {
    /*
     * all v's (big or small) = "ag',r"
     * all m's (big or small) = "ssad"
     * all g's (big or small) = "jeb..w"
     * all b's (big or small) = "dug>?/"
     */
    String encStr = ""; // to hold our new encrypted String
    
    for( int i=0; i<msg.length(); i++ ) {
      
      char ch = msg.charAt(i);
      
      switch( ch ) {
        case 'v' :
          encStr += "ag',r";
          break;
        case 'm' :
          encStr += "ssad";
          break;
        case 'g' :
          encStr += "jeb..w";
          break;
        case 'b' :
          encStr += "dug>?/";
          break;
        default :
          encStr += ch;
      }
    }
    
    return encStr;
  }
  
  // decrypt() method accepts babble and returns a good String
  public String decrypt( String encStr ) {
    
    String msg = "";
    String v = "ag',r";
    String m = "ssad";
    String g = "jeb..w";
    String b = "dub>?/";
    /*
    for( int i=0; i<encStr.length(); i++ ) {
      
      // find v
      if( encStr.charAt(i) == v.charAt(0) ) {
        for( int j=0; j<v.length(); j++ ) {
          if( encStr.charAt( i+j ) == v.charAt( j ) ) {
            msg += "v";
            break;
          }
        }
      }
      
      // find m
      else if( encStr.charAt(i) == m.charAt(0) ) {
        for( int j=0; j<m.length(); j++ ) {
          if( encStr.charAt( i+j ) == m.charAt( j ) ) {
            msg += "m";
            break;
          }
        }
      }
      
      // find g
      else if( encStr.charAt(i) == g.charAt(0) ) {
        for( int j=0; j<g.length(); j++ ) {
          if( encStr.charAt( i+j ) == g.charAt( j ) ) {
            msg += "g";
            break;
          }
        }
      }
      
      // find b
      else if( encStr.charAt(i) == b.charAt(0) ) {
        for( int j=0; j<b.length(); j++ ) {
          if( encStr.charAt( i+j ) == b.charAt( j ) ) {
            msg += "b";
            break;
          }
        }
      }
      
      else {
        msg += encStr.charAt(i);
      }
    }
    */

    encStr = encStr.replace( "ag',r", "v" );
    encStr = encStr.replace( "ssad", "m" );
    encStr = encStr.replace( "jeb..w", "g" );
    encStr = encStr.replace( "dug>?/", "b" ); 
    
    return encStr;  // return the final message
  }
  
} // end class