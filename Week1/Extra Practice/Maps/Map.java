import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args){
        HashMap<String, String> idMap = new HashMap<String, String>();

        idMap.put("Gods", "The dog returned to his vomit");
        idMap.put("Of", "the sow returned to her mire");
        idMap.put("Copybook", "the burnt fool's bandaged finger went wobbling back to the fire");
        idMap.put("Headings", "Thus when it happened and the brave new world began, when all men where payed for his suffering, and no man payed for his sins. As surely as water has wet us, as surely as fire has burned. the Gods of the Copybook Headings with terror and slaughter, return.");

        System.out.println(idMap.get("Headings") + "\n\n");
        Set<String> keys = idMap.keySet();
        for(String key : keys) {
            System.out.printf(key + ": " + idMap.get(key) + "\n");
        }
    }
}
