package pdf.create;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDFont;

/**
 * http://www.printmyfolders.com/Home/PDFBox-Tutorial
 * @author BartBien
 *
 */
public class PDFWithText
{
	public static void main(String[] args)
	{
		PDDocument doc = null;
		PDPage page = null;

		try
		{
			doc = new PDDocument();
			page = new PDPage();

			doc.addPage(page);
			PDFont font = PDType1Font.HELVETICA_BOLD;

			PDPageContentStream content = new PDPageContentStream(doc, page);
			
			content.beginText();
			content.setFont(font, 12);
			content.moveTextPositionByAmount(100, 700);
			content.drawString("tomcat from phoenixjcam.no-ip.biz:8081");
			content.endText();
			
			content.close();
			doc.save("pdfbox/pdf/create/Empty PDF.pdf");
			doc.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}