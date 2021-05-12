public class AssamAajTak implements AjTak {
    @Override
    public void onUpdate(News news){
        System.out.println( "Delhi Branch Today Headline" + news);

    }
    @Override
    public NewsType getNewsType(){
        return NewsType.ASSAM;
    }

}
