package com.itextpdf.jumpstart;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;

import javax.swing.text.StyleConstants;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by HP on 26.07.2017.
 */
public class NeverGiveUp {
    public static void main(String[] args) {
        String dest = "result/chapter01/never_give_up.pdf";
        PdfWriter writer = null;
        try {
            writer = new PdfWriter(dest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        //Create PDF font
        PdfFont font = null;
        try {
            font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add a Paragraph
        document.add(new Paragraph("iText is:").setFont(font));
        //Create list
        List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font);
        //add ListItem objects
        list.add(new ListItem("Never gonna give up"))
        .add(new ListItem("Never gonna let you down"))
        .add(new ListItem("Never gonna run around"))
        .add(new ListItem("Never gonna make you cry "))
        .add(new ListItem("Never gonna say goodbye"))
        .add(new ListItem("Never gonna tell a lie and hurt you"));
        document.add(list);
        document.close();
    }


}
