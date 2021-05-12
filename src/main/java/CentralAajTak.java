import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {
    // Observers observers;
    List<AjTak> observersList = new ArrayList<>();


    public  void register(AjTak observers){
        observersList.add(observers);
    }
    /*public <Delhi1> void unRegister(Delhi1 observers){
        observersList.remove(observers);
    }*/

    public void update(News news){
        for (AjTak ajTak : observersList){
            if(ajTak.getNewsType() == news.newsType)
                ajTak.onUpdate(news);
        }
    }
}
