package com.itextpdf.jumpstart;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;


/**
 * Created by HP on 26.07.2017.
 */
public class Helloworld2 {
    public static void main(String[] args) {
        String dest = "result/chapter01/hello_world2.pdf";
        PdfWriter writer = null;
        try {
            writer = new PdfWriter(dest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(new Paragraph("New Hello world"));
        document.close();

    }


}
