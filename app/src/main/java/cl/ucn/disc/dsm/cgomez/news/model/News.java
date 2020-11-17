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
    private long id;
    /**
     * The Title
     * Restictions: not null, size > 2
     */
    private String title;
    /**
     * The Source
     */
    private String source;
    /**
     * The Author
     */
    private String author;
    /**
     * The URL
     */
    private String url;
    /**
     * The URL of image
     */
    private String urlImage;
    /**
     *  The Description
     */
    private String content;
    /**
     * The Date of publish
     */
    private ZonedDateTime publishedAt;
    private String descripcion;


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

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
    public News(long id, String title, String source, String author, String url, String urlImage, String content, String descripcion, ZonedDateTime publishedAt) {
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
    public long getId() {
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

    public ZonedDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishedAt(ZonedDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }
}
