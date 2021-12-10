package ci_cd_project.epsi;

import java.util.List;

public class Basket {
    
    private List<Article> listArticles;

    public List<Article> getListArticles() {
        return listArticles;
    }

    public void setListArticles(List<Article> listArticles) {
        this.listArticles = listArticles;
    }

    public int Count(){
        int nbArticles = 0;
        for (Article articles : listArticles){
            nbArticles++;
        }

        return nbArticles;
    }
}
