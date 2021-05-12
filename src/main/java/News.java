public class News {
    public String news;
    NewsType newsType;

    @Override
    public String toString() {
        return newsType + "s News{\nNews:" + news + "\n}";
    }
}
enum NewsType {
    DELHI,
    BIZ ,
    ASSAM,
    /*DELHI1;*/

}
