package VistaJefeAlmacén;
import Modelo.ConsultasRecursos;
import Modelo.Recursos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class Reporte_PDF {

    String nombre, fecha, rutaImagen;
    //static String dni;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    static ConsultasRecursos modeloR;
    //static ConsultasAlumno modeloA;

    public Reporte_PDF(String nombre, String fecha, String rutaImagen) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        documento = new Document();
        titulo = new Paragraph("REPORTE DE RECURSOS FALTANTES");
    }

    public Reporte_PDF(ConsultasRecursos modeloR) {
        this.modeloR = modeloR;
        //this.modeloA = modeloA;
        //this.dni = dni;
    }

    public void crearPlantilla() {
        try {
            archivo = new FileOutputStream(nombre + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(Element.TITLE);
            Image image = null;
            try {
                image = Image.getInstance(rutaImagen);
                image.scaleAbsolute(100, 100);
                image.setAbsolutePosition(30, 740);
            } catch (Exception e) {
            }
            documento.add(image);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("****************************************************************************************************************"));
            documento.add(new Paragraph("Nombre y apellidos: Renzo Miguel, Paredes Franco"+"    \t                             "+"Cargo: Jefe de Almacén"));
            documento.add(new Paragraph("****************************************************************************************************************"));
            documento.add(Chunk.NEWLINE);            
            Paragraph texto = new Paragraph("El presente documento es un reporte de los recursos y/o materiales faltantes en el Almacén de la empresa. Por este medio se da constancia del control realizado por el sistema CATO.");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            PdfPTable tabla = new PdfPTable(7);
            tabla.setWidthPercentage(100);
            PdfPCell recurso = new PdfPCell(new Phrase("Recurso"));
            recurso.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell desc = new PdfPCell(new Phrase("Descripción"));
            desc.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell costo = new PdfPCell(new Phrase("Costo Unitario"));
            costo.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell cant = new PdfPCell(new Phrase("Cantidad"));
            cant.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell dia = new PdfPCell(new Phrase("Fecha"));
            dia.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell hora = new PdfPCell(new Phrase("Hora"));
            hora.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell obs = new PdfPCell(new Phrase("Observación"));
            obs.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(recurso);
            tabla.addCell(desc);
            tabla.addCell(costo);
            tabla.addCell(cant);
            tabla.addCell(dia);
            tabla.addCell(hora);
            tabla.addCell(obs);

            for (Recursos n : modeloR.listar()) {
                if(n.getCantrec()<=10){
                    tabla.addCell(n.getNomrec());
                    tabla.addCell(n.getDescrec()+""+Chunk.NEWLINE+" ");
                    tabla.addCell(n.getCostorec()+"");
                    tabla.addCell(n.getCantrec()+"");
                    tabla.addCell(n.getFecharec()+"");
                    tabla.addCell(n.getHorarec()+"");
                    if(n.getCantrec()==0){
                        PdfPCell obs1 = new PdfPCell(new Phrase("SIN STOCK"));
                        obs1.setBackgroundColor(BaseColor.RED);
                        tabla.addCell(obs1);
                    }else{
                        PdfPCell obs1 = new PdfPCell(new Phrase("EN ESCASEZ"));
                        obs1.setBackgroundColor(BaseColor.YELLOW);
                        tabla.addCell(obs1);
                    }
                }
            }
            tabla.addCell(" "+Chunk.NEWLINE+" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
