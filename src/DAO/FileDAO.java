/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.rtf.RTFEditorKit;

/**
 *
 * @author Asus
 */

public class FileDAO {
    
    public static void writeFile(File f, JTextArea textPane) {

        PrintWriter pw = null;
        
        try {
            OutputStream out = new FileOutputStream(f);
            
            RTFEditorKit trf= new RTFEditorKit();
            trf.write(out,textPane.getDocument(), 0,textPane.getText().length());
            
//            pw = new PrintWriter(f);
//            pw.print(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static String readFile(File f,JFrame m) {
        String s="";
        
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while (br.ready()) {
                s=(s + br.readLine()+ "\n");
            }
            m.setTitle(f.getName() + "-NotePad");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Can not found file");
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return s;
    }
}
