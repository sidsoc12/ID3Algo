import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Driver {
 static final String filepath = "play8.csv";

 public static void main(String[] args) throws FileNotFoundException {
  
  ID3 id3 = new ID3();
  id3.rawdata = id3.loadCSV(filepath);
  id3.printArrayList(id3.rawdata);
  
  id3.runID3(id3.rawdata,null);
  
  
  System.out.println("\nDisplaying Tree\n");
  Node rootnode = id3.tree.getRoot();
  rootnode.print("",true);
  


 }

}
