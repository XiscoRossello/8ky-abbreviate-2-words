public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String solucion = "";
    solucion = name.charAt(0) + ".";
    for (int i = 1; i < name.length(); i++){
      if (name.charAt(i) == ' '){solucion += name.charAt(i+1); }
      }
    return solucion.toUpperCase();
    } 
  }
