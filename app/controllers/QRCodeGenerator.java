package controllers;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.ByteMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
 
 
public class QRCodeGenerator 
{
    public static BufferedImage generateQR(String qrString)
    {
        int size = 350;
        try {
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            ByteMatrix byteMatrix = qrCodeWriter.encode(qrString,BarcodeFormat.QR_CODE, size, size, hintMap);
            int matrixWidth = byteMatrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth,
                    BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
 
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, matrixWidth, matrixWidth);
            graphics.setColor(Color.BLACK);
 
            for (int i = 0; i < matrixWidth; i++) 
            {
                for (int j = 0; j < matrixWidth; j++)
                {
                	Byte b = byteMatrix.get(i, j);
                    if (b.intValue() != -1) 
                    {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            System.out.println("\n\nYou have successfully created a QR Code.");
            return image;
        } 
        catch (WriterException e) 
        {
            e.printStackTrace();
            return null;
        } 
		
    }       
}