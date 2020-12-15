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

import androidx.annotation.NonNull;

import net.openhft.hashing.LongHashFunction;

import org.threeten.bp.ZonedDateTime;

import cl.ucn.disc.dsm.cgomez.news.utils.Validation;

/**
 * @author Carlos Gomez Pino
 */
public final class News {
    /**
     * Unique id
     */

    /**
     * The Title
     * Restictions: not null, size > 2
     */
    private final Long id;
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
     * The Description
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

    public Long getId() {
        return id;
    }

    /**
     * @param title
     * @param source
     * @param author
     * @param url
     * @param urlImage
     * @param content
     * @param descripcion
     * @param publishedAt
     */
    public News(String title, String source, String author, String url, String urlImage, String content, String descripcion, ZonedDateTime publishedAt) {

        Validation.minSize(title, 2, "title");
        this.title = title;
        Validation.minSize(source, 2, "source");
        this.source = source;
        Validation.minSize(author, 2, "author");
        this.author = author;
        this.id = LongHashFunction.xx().hashChars(title + "|" + source + "|" + author);
        this.url = url;
        this.urlImage = urlImage;
        Validation.notNull(content, "content");
        this.content = content;
        this.descripcion = descripcion;
        Validation.notNull(publishedAt, "publishedAt");
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return the ID
     */


    /**
     * @return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the Source
     */
    public String getSource() {
        return source;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the Url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the UrlImage
     */
    public String getUrlImage() {
        return urlImage;
    }

    public String getContent() {
        return content;
    }

    @NonNull
    @Override
    public String toString() {
        return this.title;
    }
}
