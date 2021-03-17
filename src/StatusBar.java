/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Asus
 */
public class StatusBar {
    public void loadStatus(int pos,MainFrame mainFrame  ){
            int row = 0;
            int column = 0;
            try {
                row = mainFrame.txtContent.getLineOfOffset(pos);
                column = pos - mainFrame.txtContent.getLineStartOffset(row);
            } catch (Exception e) {
                e.printStackTrace();
                //Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainFrame.lblColAndRow.setText("Ln " + (row + 1) + ", Col " + (column + 1));
    }
}
