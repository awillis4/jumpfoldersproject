package corejava.collectionsgenerics;
import java.util.HashMap;import java.util.Map;import java.util.Set;import java.util.TreeMap;

public class MapExample{
   public static void main(String[]args){
   
      Map<Integer,String>mapTree=new TreeMap<Integer,String>();
      Map<Integer,String>mapHash=new HashMap<Integer,String>();
      String[]fruitsArr={"banana","apple","pear","pear","dragonfruit",
         "lychee","mango","pineapple","orange","orange","durian","tomato","watermelon"};
   
      for(int id=1;id<=fruitsArr.length;id++){mapTree.put(id,fruitsArr[id-1]);mapHash.put(id,fruitsArr[id-1]);}
      System.out.println("mapTree="+mapTree);System.out.println("mapHash="+mapHash+"\n");
      for(Map.Entry<Integer,String>fruit:mapTree.entrySet()){System.out.println("KEY: "+fruit.getKey()+" value: "+fruit.getValue());}
      String fruitName=mapTree.get(12);System.out.println("Value for key 12 in maptree==>"+fruitName);
      Set<Integer>fruitIds=mapTree.keySet();System.out.println("keySet()="+fruitIds);
   
      mapTree.remove(11);System.out.println("Called .remove() for element in mapTree w/ the key 11 ="+mapTree);
      mapTree.put(13,null);System.out.println("Called .put()for element 13 in mapTree and set it to null."+mapTree+mapTree.size());
      mapTree.clear();System.out.println("mapTree .clear()"+mapTree+mapTree.isEmpty());}}
