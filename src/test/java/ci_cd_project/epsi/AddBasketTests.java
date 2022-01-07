package ci_cd_project.epsi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AddBasketTests {

    @Test
    public void testAddToBasket(int nbArticlesExpected) {
        Basket basket =  new Basket();
        int nbArticles = basket.getListArticles().size();

        assertEquals(nbArticles, nbArticlesExpected);
    }

    @Test
    public void testValidBasketWithMinimumOneArticle(){
        Basket basket = new Basket();

        Article lait = new Article("Lait", 982987272, 1.21);
        Article fromage = new Article("Fromage", 678238792, 0.99);

        // init list article
        List<Article> list = new ArrayList<>();
        list.add(lait);
        list.add(fromage);

        basket.setListArticles(list);

        assertEquals(basket.getListArticles().size(), 2);
    }
}
