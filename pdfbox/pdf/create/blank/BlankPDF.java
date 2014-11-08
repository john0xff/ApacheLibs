package pdf.create.blank;

import org.apache.pdfbox.pdmodel.*;
import java.io.*;

public class BlankPDF
{
	public static void main(String[] args)
	{
		PDDocument doc = null;
		doc = new PDDocument();
		doc.addPage(new PDPage());
		
		try
		{
			doc.save("pdfbox/pdf/create/blank/Empty PDF.pdf");
			doc.close();
		}
		catch (Exception io)
		{
			System.out.println(io);
		}
	}
}