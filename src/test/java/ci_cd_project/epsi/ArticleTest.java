package ci_cd_project.epsi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ArticleTest {

    public Article article = new Article("Lait", 982987272, 1.21);

    @Test
    public void articleIsNotEmpty() {
        assertEquals(article.getName(), "Lait");
        assertNotNull(article);
    }







}
