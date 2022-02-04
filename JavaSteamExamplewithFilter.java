public class CommonObject(){
 public static void main(String[] args){
    List<Object> object = new ArrayList<Object>();
    object.add("animal");
    object.add("dog");
    object.add(1);
    object.add(23);
    filterList(object);
 }
  
  private static void filterList(List<Object> object){
    
    Predicate<Object> condition = new Predicate<Object>(){
    
    @Override
    public boolean test(Object ob){
        if(ob instanceof Integer) {
            return true;
        }
      else if( ob instanceof String) {
            return true; 
      }
      
      return false;
    }
  };
  
    object.stream().
      filter(condition).forEach(Sytem.out ::print);
  } 
}
