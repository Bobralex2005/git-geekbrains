package com.itextpdf.jumpstart;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by HP on 26.07.2017.
 */
public class HelloWorld {

    public static final String DEST = "result/chapter01/hello_world.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HelloWorld().createPdf(DEST);
    }

    public void createPdf (String Destenation) throws IOException{
        //initialize PDF writer
        FileOutputStream fos = new FileOutputStream(DEST);
        PdfWriter writer = new PdfWriter(fos);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        //Initialize Document
        Document document = new Document(pdf);

        //Add paragraph to the content
        document.add(new Paragraph("My first PDF file"));

        //close document
        document.close();
    }
}
