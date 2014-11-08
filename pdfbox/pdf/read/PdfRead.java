//package pdf.read;
//
//import java.awt.List;
//import java.io.File;
//import java.util.Arrays;
//
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.util.PDFTextStripper;
//
//public class PdfRead
//{
//	public static void main(String[] args)
//	{
//		PDFTextStripper stripper;
//		PDDocument doc;
//		try
//		{
//			doc = PDDocument.load(filePath + File.separator + fileName);
//			stripper = new PDFTextStripper();
//			stripper.setStartPage(1);
//			stripper.setEndPage(Integer.MAX_VALUE);
//			String x1 = stripper.getText(doc);
//			// break up the file content returned as a string into individual lines
//			List<String> ans = Arrays.asList(x1.split("\r\n"));
//			return ans;
//		}
//		finally
//		{
//			if (doc != null)
//				doc.close();
//		}
//	}
//}
