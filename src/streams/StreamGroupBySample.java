package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class StreamGroupBySample {
	public static void main(String[] args) {
	  
      
	  // Sample 1
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("John Sena", 20);
      map.put("Paul", 30);
      map.put("Sara", 40);
      
      System.out.println(map.keySet().stream()
                  .filter(key -> key.length() < 5)
                  .collect(toMap(
                        key -> key +"-" + map.get(key),
                        key -> map.get(key)
                      ))
                  );
      

      
      // Sample 2
		List<Deal> deals = new ArrayList<>();
		
		deals.add(new Deal("Google", "Pixel 3", 399.00));
		deals.add(new Deal("HP", "Envy dv7", 839.00));
		deals.add(new Deal("Apple", "Iphone X", 1099.00));
		deals.add(new Deal("Google", "Chromebook", 299.00));
		deals.add(new Deal("Apple", "MacBook Air", 1199.00));
		deals.add(new Deal("HP", "Printer", 59.00));
		deals.add(new Deal("Chuwii", "Herobook", 199.00));
		
//		Map<String, List<Deal>> storeMapper = 	deals.stream()
//		                                             .collect(groupingBy(Deal::getStore));		
//		storeMapper.forEach((key, value) -> {
//		  System.out.print(key +":"+ value);		  
//		});
		
		System.out.println(
		deals.stream()
		      .collect(groupingBy(Deal::getStore))
       );
		
	   System.out.println(
	          deals.stream()
	               .collect(groupingBy(Deal::getStore, mapping(Deal::getTitle, toList())))
	   );
		
		
		
	}

}
class Deal {
  String store;
  String title;
  double price;
  
  Deal(String store, String title, double price){
    this.store =store;
    this.title= title;
    this.price = price;
  }

  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  
  public String toString(){
    return this.store +":"+ this.title +":"+ this.price;
  }
}