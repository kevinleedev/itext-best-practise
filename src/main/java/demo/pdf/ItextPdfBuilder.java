package demo.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;

public class ItextPdfBuilder {

    private static final float random = 2.83F;

    public static void main(String[] args) throws Exception {
        Document document = new Document(new Rectangle(0, 0, 210 * random, 297 * random));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfWriter pdfWriter = PdfWriter.getInstance(document, outputStream);
        pdfWriter.setPdfVersion(PdfWriter.PDF_VERSION_1_7);
        document.open();
        PdfContentByte dc = pdfWriter.getDirectContent();
    }

    public static void drawAbsolutePositionText(PdfContentByte dc) {

    }

}
