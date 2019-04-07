package lodash.test;

import Entity.Test;
import java.util.ArrayList;
import java.util.HashMap;
import rgmatute.lodash.java.__;

/**
 *
 * @author Matute
 */
public class LodashTest {

    public static void main(String[] args) {
        __.eachRight(__.list("a", 1902), (item) -> {
            System.out.println(item);
        });

        __.each(__.list("a", 1902), (item) -> {
            System.out.println(item);
        });

        __.each(__.list("a", 1902), (v) -> {
            System.out.println(v);
        });
        System.out.println(__.isNumeric("a"));
        System.out.println(__.isEmail("rgmatute91@gmail.com"));
        System.out.println(__.currentDateTime());

        ArrayList<Test> lista = new ArrayList<>();
        Test t1 = new Test();
        Test t2 = new Test();
        t1.setFirstName("Ronny");
        t2.setFirstName("Gabriel");
        lista.add(t1);
        lista.add(t2);
        
        __.each(lista, (k, v) -> {
            System.out.println(k + ":" + v.getFirstName());
        });

        __.forEach(lista, (v) -> {
            System.out.println(v.getFirstName());
        });
        
        ArrayList<Test> x =(ArrayList<Test>)__.filter(lista,(obj) -> {
            return (obj.getFirstName() == "Ronny");
        });
        
        __.each(x, (v) -> {
            System.out.println(v.getFirstName());
        });
        
        // ###############################################
        if(__.isEmail("rgmatute91@gmail.com")){
            System.out.println("Email correcto Fecha: " + __.currentDateTime());
        }
        
        // ################################################################
        System.out.println("isPar: " + __.isPar("2999999999921032"));
        System.out.println("currentTime: " + __.currentTime());
        System.out.println("currentDateTime: " + __.currentDateTime());
        System.out.println("currentDateTime: " + __.currentDate("yyyy"));
        System.out.println("isEmail: " + __.isEmail("rgmatute91@gmail.com"));
        System.out.println("isEmail: " + __.isEmail("rgmatute91"));
        // ################################################################
        ArrayList<Object> list = new ArrayList<>();
        list.add("Ronny");
        list.add("Gabriel");
        list.add("Matute");
        list.add("Granizo");
        list.add(2019);
        list.add("rgmatute91@gmail.com");
        list.add("+593981851214");
        System.out.println("Find 1: " + __.findValue(list, "RonnyTest"));
        System.out.println("Find 2: " + __.findValue(list, "Ronny"));
        System.out.println("Find 3: " + __.findValue(list, "rgmatute91@gmail.com"));
        // ################################################################
        HashMap<Object, Object> listMap = new HashMap<>();
        listMap.put("name", "Ronny matute");
        listMap.put("user", "rgmatute");
        listMap.put(2019, "year");
        listMap.put("whatsapp", "+593981851214");
        System.out.println(__.keys(listMap));        
        __.each(list, (item) -> {
                System.out.println(item);
        });
        System.out.println(__.invoke(__.list(" foo", " bar "), "trim"));
        System.out.println(__.max(__.list(10, 5, 100, 2, 1000)));
        System.out.println(__.keys(listMap));
        System.out.println(__.values(listMap));
        System.out.println(__.isEqual("r", "r"));
        System.out.println(__.isEqual("r", 1902));
        // ###############################################################
    }
}
