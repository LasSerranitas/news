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

import java.util.List;

import cl.ucn.disc.dsm.cgomez.news.model.News;

/**
 *
 * @author Carlos Gomez Pino
 */
public class TestContratos {
    private  static final Logger log = LoggerFactory.getLogger(TestContratos.class);

    @Test
    public void testRetriverNews(){
        log.debug("Testing ..");
        Contratos contrato=new ContratosImplFaker();
        List<News> news=contrato.retrieveNews(5);
        Assertions.assertNotNull(news,"List was null :(");
        Assertions.assertTrue(news.size()!=0, "Emppty list :(");
        Assertions.assertTrue(news.size()==5, "List size !=5 :(");
        log.debug("Done");

    }
    @Test
    public void testFaker(){
        Faker faker=Faker.instance();
        for(int i=0;i<5;i++){
            log.debug("Name: {}",faker.name().fullName());
            System.out.println("Name: "+faker.name().fullName());
        }
    }
}
