public class Main {

    public void display() {
        System.out.println("Calculating Method execution time:");
    }

    public static void main(String[] args){
        System.out.println("Hello World!");

        Main obj = new Main();
        long start = System.nanoTime();
        obj.display();
        long end = System.nanoTime();

        News newsBiz = new News();
        newsBiz.news = "Good Morning! BIHAR";
        newsBiz.newsType = NewsType.BIZ;


        News newsAssam = new News();
        newsAssam.news = "Good Morning! ASSAM";
        newsAssam.newsType = NewsType.ASSAM;

        News newsDelhi = new News();
        newsDelhi.news = "Good Morning! DELHI";
        newsDelhi.newsType = NewsType.DELHI;

      /*  News newDelhi1 = new News();
        News newDelhi1 = new News();
        newDelhi1 = "new message";
        newDelhi1.news = "Good Morning! DELHI1";
        newsDelhi1.news = NewsType.DELHI1;*/

        BizAajTak bizAajTak = new BizAajTak();
        AssamAajTak assamAajTak = new AssamAajTak();
        DelhiAajTak delhiAajTak = new DelhiAajTak();
        CentralAajTak centralAajTak = new CentralAajTak();



        centralAajTak.register(delhiAajTak);
        centralAajTak.register(bizAajTak);
        centralAajTak.register(assamAajTak);

        centralAajTak.update(newsDelhi);
        centralAajTak.update(newsAssam);
        centralAajTak.update(newsBiz);


        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");



      /*  centralAajTak.unRegister(delhiAajTak);*/


    }
}
