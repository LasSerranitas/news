/*
 * Copyright  2020 Carlos Gomez Pino carlos.gomez@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.cgomez.news.model;

import java.time.ZonedDateTime;

/**
 *
 * @author Carlos Gomez Pino
 */
public final class News {
    /**
     * Unique id
     */
    private final Long id;
    /**
     * The Title
     * Restictions: not null, size > 2
     */
    private final String title;
    /**
     * The Source
     */
    private final String source;
    /**
     * The Author
     */
    private final String author;
    /**
     * The URL
     */
    private final String url;
    /**
     * The URL of image
     */
    private final String urlImage;
    /**
     *  The Description
     */
    private final String content;

    public ZonedDateTime getPublishedAt() {
        return publishedAt;
    }

    /**
     * The Date of publish
     */
    private final ZonedDateTime publishedAt;
    private final String descripcion;


    public String getDescripcion() {
        return descripcion;
    }

    /**
     *  @param id
     * @param title
     * @param source
     * @param author
     * @param url
     * @param urlImage
     * @param content
     * @param descripcion
     * @param publishedAt
     */
    public News(Long id, String title, String source, String author, String url, String urlImage, String content, String descripcion, ZonedDateTime publishedAt) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.author = author;
        this.url = url;
        this.urlImage = urlImage;
        this.content = content;
        this.descripcion=descripcion;
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return the ID
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the Source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @return the Author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @return the Url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @return the UrlImage
     */
    public String getUrlImage() {
        return urlImage;
    }

    public String getContent() {
        return content;
    }




}
