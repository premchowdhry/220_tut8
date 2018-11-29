package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContext {

  private List<String> content = new ArrayList<>();

  public ListContext(String... items) {
    content.addAll(Arrays.asList(items));
  }

  public void add(String item) {
    content.add(item);
  }

  public void print(ListFormatter listStrategy) {
    System.out.println(listStrategy.formatHeader());
    for (String item : content) {
      System.out.println(listStrategy.formatItem(item));
    }
    System.out.println(listStrategy.formatFooter());
  }
}