package Q1;

import static java.util.Comparator.comparing;

import com.dailymail.DailyMail;
import com.dailymail.DailyMailArticle;
import java.util.List;

public class DailyMailAdapter {

  List<DailyMailArticle> latestStories() {

    List<DailyMailArticle> articles = DailyMail.getArticles();

    articles.sort(comparing(DailyMailArticle::timestamp).reversed());

    return articles;
  }

}
