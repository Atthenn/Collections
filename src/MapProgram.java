import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String > languages = new HashMap<>();
        if(languages.containsKey("java")){
            System.out.println("java is already in map");
        }else{
            languages.put("java", "a highlevel language");
            System.out.println("successfully added");
        }
        languages.put("python","an iterpreted language");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("Basic","Beginner languafge"));
        System.out.println(languages.put("Lisp", "hhhhhh"));
      //  System.out.println(languages.get("java"));
      //  System.out.println(  languages.put("java", "second a highlevel language"));
     //   System.out.println(languages.get("java"));


       // languages.remove("lisp");
        languages.replace("Lisp", "blah blahblah");
        languages.replace("scala", "bal blah blah ");

        if( languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol was removed");
        }else{
            System.out.println("Algol was not removed");
        }

        for(String key : languages.keySet()){
            System.out.println(languages.get(key));
        }
    }
}
