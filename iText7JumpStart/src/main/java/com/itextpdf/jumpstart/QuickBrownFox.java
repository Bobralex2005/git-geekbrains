package com.itextpdf.jumpstart;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 26.07.2017.
 */
public class QuickBrownFox{

    public static final String PIC1 = "src/main/resources/img/Screenshot_1.png";
    public static final String PIC2 = "src/main/resources/img/Screenshot_2.png";

    public static final String DEST = "result/chapter01/imagesSample.pdf";

    public static void main(String[] args) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new QuickBrownFox().createPdf(DEST);
    }

    public void createPdf(String dest) throws IOException{
        //Initialize PDF Writer
        PdfWriter writer = new PdfWriter(DEST);
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
        //Initialize document
        Document document = new Document(pdf);
        //Compose paragraph
        Image pic1 = new Image(ImageDataFactory.create(PIC1));
        Image pic2 = new Image(ImageDataFactory.create(PIC2));

        Paragraph p = new Paragraph("The very first picture ")
                .add(pic1)
                .add(" and the second one ")
                .add(pic2);
        //add all Paragraphs to document
        document.add(p);
        document.close();
    }
}
