/*
 * Copyright  2020 Carlos Gomez Pino carlos.gomez@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.cgomez.news.services;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import cl.ucn.disc.dsm.cgomez.news.model.News;

public final class TestContratosImplFaker {
    private static final Logger log = LoggerFactory.getLogger(TestContratosImplFaker.class);

    @Test
    public void testRetrieveNews() {
        Contratos contratos = new ContratosImplFaker();
        List<News> news = contratos.retrieveNews(5);
        Assertions.assertNotNull(news, "La lista no existe");
        Assertions.assertFalse(news.isEmpty(), "Lista vacia");
        Assertions.assertEquals(5, news.size(), "La lista no tiene 5 elementos");
        for (News n : news) {
            log.debug("News: {}", n);
        }
        Assertions.assertEquals(0, contratos.retrieveNews(0).size(), "Lista distinta de 0");
        Assertions.assertEquals(3, contratos.retrieveNews(3).size(), "Lista distinta de 3");
        Assertions.assertTrue(contratos.retrieveNews(10).size() <= 10, "Lista distinta de 10");
        log.debug("Done");
    }
    public void testSaveNews(){
        ContratosImplFaker nuevo=new ContratosImplFaker();
        final Faker faker = Faker.instance();
        int tamano=nuevo.retrieveNews(0).size();
        News notica=new News(

                faker.book().title(),
                faker.name().username(),
                faker.name().fullName(),
                faker.internet().url(),
                faker.internet().avatar(),
                faker.harryPotter().quote(),
                faker.lorem().paragraph(3),
                ZonedDateTime.now(ZoneId.of("-3"))
        );
        nuevo.save(notica);
        if(tamano+1==nuevo.retrieveNews(0).size()){
            log.debug("No Se pudo agregar");
        }
    }
}
