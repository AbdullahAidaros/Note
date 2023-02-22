import java.lang.reflect.Method;
import java.util.ArrayList; // import the ArrayList class
import java.util.Date;
import java.sql.Timestamp;;
public class note {
    ArrayList<String> page = new ArrayList<String>();
String time = new String();
    public void addPage(String s) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        page.add(s+" "+ timestamp);
    }
    public void printAllNote() {
        System.out.println("Print all notes");
        for(int i = 0; i < page.size();i++)
        {
           System.out.println(i+" - "+page.get(i)); 
        }
        
    }
    //this method will edit a page
    public void editPage(int i, String s) {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis()); 
     
    page.set(i, s+"  "+timestamp);
        
    }
}
