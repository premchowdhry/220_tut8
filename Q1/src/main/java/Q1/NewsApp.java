package Q1;

import com.dailymail.DailyMailArticle;

import java.util.*;

public class NewsApp {

  private final DailyMailAdapter dailyMailAdapter = new DailyMailAdapter();

  public List<DailyMailArticle> latestStories() {
    return dailyMailAdapter.latestStories();
  }

  public static void main(String[] args) {
    new NewsApp().latestStories().forEach(a -> System.out.println(a.hline()));
  }

}


