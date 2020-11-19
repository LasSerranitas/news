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

import cl.ucn.disc.dsm.cgomez.news.model.News;

public class TestNews {

    public TestNews (){
    }
    private boolean VerificarDatos(News news){
        if(news.getId()<0)
            return false;
        if(news.getTitle()=="")
            return false;
        if(news.getSource()=="")
            return false;
        if(news.getAuthor()=="")
            return false;
        if(news.getUrl()=="")
            return false;
        if(news.getUrlImage()=="")
            return false;
        if(news.getDescripcion()=="")
            news.setDescripcion("No se proporciono una descripcion");
        if(news.getContent()=="")
            news.setContent("No se agrego contenido");
        return true;
    }
}
