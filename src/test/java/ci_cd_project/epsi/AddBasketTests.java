package ci_cd_project.epsi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AddBasketTests {

    @Test
    public void testAddToBasket(int nbArticlesExpected) {
        Basket basket =  new Basket();
        int nbArticles = basket.getListArticles().size();

        assertEquals(nbArticles, nbArticlesExpected);
    }

}
