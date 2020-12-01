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

import com.kwabenaberko.newsapilib.models.Article;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import cl.ucn.disc.dsm.cgomez.news.model.News;
import cl.ucn.disc.dsm.cgomez.news.utils.Validation;

/**
 * @author
 */
public class ContratosImplNewsApi implements Contratos {
    private static final Logger log = LoggerFactory.getLogger(ContratosImplNewsApi.class);
    private final NewsApiService newsApiService;

    public ContratosImplNewsApi(final String theApiKey) {
        Validation.minSize(theApiKey, 10, "ApiKey !!");
        this.newsApiService = new NewsApiService(theApiKey);
    }

    @Override
    public List<News> retrieveNews(Integer size) {
        try {
            List<Article> articles = newsApiService.getTopHeadlines("tecnhonlogy", size);
            List<News> news = new ArrayList<>();
            for (Article article : articles) {
                News n = article2news(article);
                if (n != null) {
                    news.add(n);
                }
            }
            return news;
        } catch (IOException e) {
            log.error("Error", e);
            return null;
        }

    }

    private static News article2news(Article article) {

        log.debug("Article: {}.", ToStringBuilder.reflectionToString(article, ToStringStyle.MULTI_LINE_STYLE));
        ZonedDateTime publishedAt = ZonedDateTime.parse(article.getPublishedAt()).withZoneSameInstant(ZoneId.of("-3"));
        if (article.getAuthor() == null) {
            log.debug("Article without author !!");
            return null;
        }
        if (article.getDescription() == null) {
            log.warn("Article without description !!");
            return null;
        }

        return new News(
                article.getTitle(),
                article.getSource().getName(),
                article.getAuthor(),
                article.getUrl(),
                article.getUrlToImage(),
                article.getDescription(),
                article.getDescription(),
                publishedAt
        );

    }


    @Override
    public void save(News news) {
        throw new NotImplementedException("Can't save news in NewsAPI");

    }
}
