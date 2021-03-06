
import DAO.FileDAO;
import com.ozten.font.JFontChooser;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;


import java.io.File;
import java.io.IOException;
import java.net.URI;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.text.Font.font;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    StatusBar statusBar= new StatusBar();
    UndoManager undoManage= new UndoManager();        
    boolean lastDelete = false;
    boolean lastSave=false;
    int Col = 1;
    int Ln = 1;
    boolean lastBack = false;
    boolean lastCtrl = false;
    boolean fileExisted = false;
    Stack<Character> charRepository = new Stack();
    File fMain = null;
    HashMap<Integer, HashMap<Integer, Character>> count = new HashMap<>();
    
    
    public MainFrame() {
        
        initComponents();
        setIcon();
        undoTest();
    }

    private void setIcon() {
        ImageIcon img = new ImageIcon("icon3.png");
        this.setIconImage(img.getImage());
       
        this.setTitle("Untiled-Notepad");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        mnUnDo = new javax.swing.JMenuItem();
        mnCut = new javax.swing.JMenuItem();
        mnCopy = new javax.swing.JMenuItem();
        mnPaste = new javax.swing.JMenuItem();
        mnDelete = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();
        lblColAndRow = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnNewWindow = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnEditUndo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnEditCut = new javax.swing.JMenuItem();
        mnEditCopy = new javax.swing.JMenuItem();
        mnEditPaste = new javax.swing.JMenuItem();
        mnEditDelete = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnFindNext = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnSelectAll = new javax.swing.JMenuItem();
        mnTime = new javax.swing.JMenuItem();
        mnFormat = new javax.swing.JMenu();
        mnFont = new javax.swing.JMenuItem();
        mnView = new javax.swing.JMenu();
        mnZoomIn = new javax.swing.JMenuItem();
        rdoDarkTheme = new javax.swing.JRadioButtonMenuItem();
        mnHelp = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        mnFeedBack = new javax.swing.JMenuItem();

        mnUnDo.setText("UnDo");
        mnUnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUnDoActionPerformed(evt);
            }
        });
        popupMenu.add(mnUnDo);

        mnCut.setText("Cut");
        mnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCutActionPerformed(evt);
            }
        });
        popupMenu.add(mnCut);

        mnCopy.setText("Copy");
        mnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCopyActionPerformed(evt);
            }
        });
        popupMenu.add(mnCopy);

        mnPaste.setText("Paste");
        mnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPasteActionPerformed(evt);
            }
        });
        popupMenu.add(mnPaste);

        mnDelete.setText("Delete");
        mnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDeleteActionPerformed(evt);
            }
        });
        popupMenu.add(mnDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtContent.setColumns(20);
        txtContent.setRows(5);
        txtContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContentMouseClicked(evt);
            }
        });
        txtContent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContentKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtContent);

        lblColAndRow.setText("Ln 1, Col 1");

        mnFile.setText("File");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        mnFile.add(mnNew);

        mnNewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnNewWindow.setText("New Window");
        mnNewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewWindowActionPerformed(evt);
            }
        });
        mnFile.add(mnNewWindow);

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnOpen.setText("Open");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        mnFile.add(mnOpen);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        mnFile.add(mnSave);

        mnSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnSaveAs.setText("Save As");
        mnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveAsActionPerformed(evt);
            }
        });
        mnFile.add(mnSaveAs);
        mnFile.add(jSeparator1);

        mnExit.setText("exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        mnFile.add(mnExit);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");
        mnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnEditMousePressed(evt);
            }
        });

        mnEditUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mnEditUndo.setText("Undo");
        mnEditUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditUndoActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditUndo);
        mnEdit.add(jSeparator2);

        mnEditCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnEditCut.setText("Cut");
        mnEditCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditCutActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditCut);

        mnEditCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnEditCopy.setText("Copy");
        mnEditCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditCopyActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditCopy);

        mnEditPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnEditPaste.setText("Paste");
        mnEditPaste.setToolTipText("");
        mnEditPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditPasteActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditPaste);

        mnEditDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        mnEditDelete.setText("Delete");
        mnEditDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditDeleteActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditDelete);
        mnEdit.add(jSeparator3);

        mnFindNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        mnFindNext.setText("Find Next");
        mnFindNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFindNextActionPerformed(evt);
            }
        });
        mnEdit.add(mnFindNext);
        mnEdit.add(jSeparator4);

        mnSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnSelectAll.setText("Select All");
        mnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSelectAllActionPerformed(evt);
            }
        });
        mnEdit.add(mnSelectAll);

        mnTime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnTime.setText("Time Date");
        mnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTimeActionPerformed(evt);
            }
        });
        mnEdit.add(mnTime);

        jMenuBar1.add(mnEdit);

        mnFormat.setText("Format");

        mnFont.setText("font");
        mnFont.setToolTipText("");
        mnFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFontActionPerformed(evt);
            }
        });
        mnFormat.add(mnFont);

        jMenuBar1.add(mnFormat);

        mnView.setText("View");

        mnZoomIn.setText("Zoom In");
        mnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnZoomInActionPerformed(evt);
            }
        });
        mnView.add(mnZoomIn);

        rdoDarkTheme.setText("Dark Theme");
        rdoDarkTheme.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoDarkThemeStateChanged(evt);
            }
        });
        mnView.add(rdoDarkTheme);

        jMenuBar1.add(mnView);

        mnHelp.setText("Help");
        mnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHelpActionPerformed(evt);
            }
        });

        mnAbout.setText("About");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        mnHelp.add(mnAbout);

        mnFeedBack.setText("Send FeedBack");
        mnFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFeedBackActionPerformed(evt);
            }
        });
        mnHelp.add(mnFeedBack);

        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblColAndRow, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColAndRow)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (lastSave==false) {
            //saveFile();
            
            popUpSave();
        }
        else{
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing
    private void popUpSave() {
        int answer = JOptionPane.showConfirmDialog(null, "Do you want to save ?", "NotePad", JOptionPane.YES_NO_CANCEL_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            saveFile();
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        else if (answer == JOptionPane.NO_OPTION) {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        else if (answer == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        else{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
               
    }


    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        lastSave=true;
        if (!txtContent.getText().isEmpty()) {
            popUpSave();
        }
        int choice=-100;
        JFileChooser fChoice = new JFileChooser();
        try{
            
            FileNameExtensionFilter filter=new FileNameExtensionFilter("TEXT FILES","txt","text");
            fChoice.setFileFilter(filter);
            
            choice= fChoice.showOpenDialog(this);
        }catch(Exception e){
            choice=-100;
            JOptionPane.showMessageDialog(this,"Can not found find");
        }
        
        if (choice == JOptionPane.OK_OPTION) {
            File f = fChoice.getSelectedFile();
            //System.out.println(f.getAbsoluteFile());
            if (f != null && f.getName().matches("(.)*[.txt]")) {
                String content = FileDAO.readFile(f, this);
                txtContent.setText(content);
                fileExisted = true;
                fMain = f;
                statusBar.loadStatus(txtContent.getCaretPosition(), this);
            }
        }
    }//GEN-LAST:event_mnOpenActionPerformed

    private void txtContentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContentMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();

        if (evt.getButton() == 3) {
            popupMenu.show(jScrollPane1, x, y);
        } else {
            popupMenu.setVisible(false);
        }
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_txtContentMouseClicked

    private void mnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCutActionPerformed
        // TODO add your handling code here:
        txtContent.cut();
    }//GEN-LAST:event_mnCutActionPerformed

    private void mnFindNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFindNextActionPerformed
        // TODO add your handling code here:
        FindAndReplace dlgFind = new FindAndReplace(this, true);
        dlgFind.setVisible(true);
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_mnFindNextActionPerformed

    private void mnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCopyActionPerformed
        // TODO add your handling code here:
        txtContent.copy();
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_mnCopyActionPerformed

    private void mnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPasteActionPerformed
        // TODO add your handling code here:
        txtContent.paste();
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_mnPasteActionPerformed

    private void mnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtContent.getSelectedText() != null) {
            BackSpace(null);
            txtContent.replaceRange("", txtContent.getText().indexOf(txtContent.getSelectedText()), txtContent.getText().indexOf(txtContent.getSelectedText()) + txtContent.getSelectedText().length());
        }
        statusBar.loadStatus(txtContent.getCaretPosition(), this);

    }//GEN-LAST:event_mnDeleteActionPerformed

    private void mnFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFontActionPerformed
        // TODO add your handling code here:
        //String s="hello";
//        JFontChooser fontChooser = new JFontChooser();
//        //fontChooser.setPreviewText("hello");
//        //System.out.println(fontChooser.getPreviewText());
//
//        JOptionPane.showConfirmDialog(null, fontChooser, "please choice font", JOptionPane.PLAIN_MESSAGE);
//        fontChooser.setPreviewText("hello");
        Font myFont = JFontChooser.showDialog(this, "choose a font", "test font");
        txtContent.setFont(myFont);


    }//GEN-LAST:event_mnFontActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        // TODO add your handling code here:
        if (txtContent.getText().isEmpty()) {
            txtContent.setText("");
            fileExisted = false;
        } else {
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to save ?", "NotePad", JOptionPane.YES_NO_CANCEL_OPTION);
            switch(answer){
                case JOptionPane.YES_OPTION:{
                    saveFile();
                    fileExisted=false;
                    txtContent.setText("");
                    break;
                }
                case JOptionPane.NO_OPTION:{
                    fileExisted=false;
                    txtContent.setText("");
                    break;
                }
                case JOptionPane.CANCEL_OPTION:{
                    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                    break;
                }
            }
        }
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnUnDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUnDoActionPerformed
        // TODO add your handling code here:

        if (lastBack = true) {
            if (lastDelete == true) {
                getRecovery(true);
                lastDelete = false;
            } else {
                getRecovery(false);
            }

        }
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_mnUnDoActionPerformed
    private void getRecovery(boolean isDeleted) {
        Iterator<Character> it = charRepository.iterator();
        int start = txtContent.getCaretPosition();
        if (isDeleted == true) {

            Stack<Character> tmp = new Stack<>();
            while (it.hasNext()) {
                tmp.push(charRepository.pop());
            }
            Iterator<Character> itTmp = tmp.iterator();
            while (itTmp.hasNext()) {
                txtContent.replaceRange(String.valueOf(tmp.pop()),
                txtContent.getCaretPosition(), txtContent.getCaretPosition());
            }
            int end = txtContent.getCaretPosition();
            txtContent.select(start, end);
        } else {

            while (it.hasNext()) {
                txtContent.replaceRange(String.valueOf(charRepository.pop()),
                txtContent.getCaretPosition(), txtContent.getCaretPosition());
            }
            int end = txtContent.getCaretPosition();
            txtContent.select(start, end);
        }

        lastBack = false;
    }
    private void txtContentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContentKeyPressed
        // TODO add your handling code here:
        //System.out.println(evt.getKeyCode());
        lastSave=false;
        if (evt.getKeyCode() == 8 || evt.getKeyCode() == 127) {
            BackSpace(evt);
        } else {
            if (evt.getKeyCode() == 17) {
                lastCtrl = true;
            } else if (lastCtrl == true && evt.getKeyCode() > 0 && evt.getKeyCode() < 32) {
                lastBack = true;
                /// b???m nh???m crtl shift xong b???m l???i ctrl z v???n ??n
                // System.out.println("hello");
            } 
            else if (lastCtrl == true && lastBack == true && evt.getKeyCode() == 90) {
//                if (lastDelete == true) {
//                    getRecovery(true);
//                    lastDelete = false;
//                } else {
//                    getRecovery(false);
//                }

            } else {
                //System.out.println(evt.getKeyCode());
                charRepository.clear();
                lastBack = false;
            }
        }
       
       
        int pos=txtContent.getCaretPosition();
        statusBar.loadStatus(pos, this);
       


    }//GEN-LAST:event_txtContentKeyPressed

    private void mnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveAsActionPerformed
        // TODO add your handling code here:
        fileExisted = false;
        
        saveFile();
    }//GEN-LAST:event_mnSaveAsActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        // TODO add your handling code here:
        
        saveFile();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTimeActionPerformed
        Calendar c = Calendar.getInstance();
        txtContent.replaceRange(c.getTime().toString(), txtContent.getCaretPosition(), txtContent.getCaretPosition());
        statusBar.loadStatus(txtContent.getCaretPosition(), this);
    }//GEN-LAST:event_mnTimeActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        // TODO add your handling code here:
        About aboutDiaLog = new About(this, true);
        aboutDiaLog.setLocation(((this.getX()+this.getWidth())/2),((this.getY()+this.getHeight())/2));
        aboutDiaLog.setVisible(true);
        
    }//GEN-LAST:event_mnAboutActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        if (fileExisted == true && txtContent.getText().isEmpty()) {
            popUpSave();
        }
        if (!txtContent.getText().isEmpty()) {
            popUpSave();
        }
        System.exit(0);

    }//GEN-LAST:event_mnExitActionPerformed

    private void mnEditDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditDeleteActionPerformed

        if (txtContent.getSelectedText() != null) {
            mnDeleteActionPerformed(evt);
        }

    }//GEN-LAST:event_mnEditDeleteActionPerformed

    private void mnEditUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditUndoActionPerformed
        // TODO add your handling code here:
        mnUnDoActionPerformed(evt);
        
//        if(charRepository.size()>0){
//            undoManage.setLimit(charRepository.size());
//        }
       // undoManage.setLimit(txtContent.getText().length());
       //int start=txtContent.getCaretPosition();
//       if(charRepository.size()>0){
//           undoManage.setLimit(charRepository.size());
//       }
//        while(undoManage.canUndo()){
//            
//            undoManage.undo();
//        }
//        
       
        
    }//GEN-LAST:event_mnEditUndoActionPerformed

    private void mnNewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewWindowActionPerformed
        // TODO add your handling code here:
        MainFrame newWindow = new MainFrame();
        newWindow.setVisible(true);
        newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnNewWindowActionPerformed

    private void mnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnEditMousePressed
        // TODO add your handling code here:
        //setEnableEditMenu();

    }//GEN-LAST:event_mnEditMousePressed

    private void mnEditCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditCutActionPerformed
        // TODO add your handling code here:
        mnCutActionPerformed(evt);
    }//GEN-LAST:event_mnEditCutActionPerformed

    private void mnEditCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditCopyActionPerformed
        // TODO add your handling code here:
        mnCopyActionPerformed(evt);
    }//GEN-LAST:event_mnEditCopyActionPerformed

    private void mnEditPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditPasteActionPerformed
        // TODO add your handling code here:
        mnPasteActionPerformed(evt);
    }//GEN-LAST:event_mnEditPasteActionPerformed

    private void mnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnZoomInActionPerformed
        // TODO add your handling code here:
        //Point2D.    
        //txtContent.get
    }//GEN-LAST:event_mnZoomInActionPerformed

    private void mnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnHelpActionPerformed

    private void mnFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFeedBackActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/canlong.pham.7"));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnFeedBackActionPerformed

    private void mnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSelectAllActionPerformed
        // TODO add your handling code here:
        txtContent.selectAll();
    }//GEN-LAST:event_mnSelectAllActionPerformed

    private void rdoDarkThemeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoDarkThemeStateChanged
        // TODO add your handling code here:
        if(rdoDarkTheme.isSelected()){
            txtContent.setBackground(Color.BLACK);
            txtContent.setForeground(Color.green);
            //this.set
        }
        else{
            txtContent.setBackground(Color.white);
            txtContent.setForeground(Color.black);
            this.setBackground(Color.white);
        }
    }//GEN-LAST:event_rdoDarkThemeStateChanged
    private void setEnableEditMenu() {
        if (lastBack == false) {
            mnEditUndo.setEnabled(false);

        } else {
            mnEditUndo.setEnabled(true);
        }
        if (txtContent.getSelectedText() == null) {
            mnEditCopy.setEnabled(false);
            mnEditCut.setEnabled(false);
            mnEditDelete.setEnabled(false);
        } else {
            mnEditCopy.setEnabled(true);
            mnEditCut.setEnabled(true);
            mnEditDelete.setEnabled(true);
        }

    }

    private void BackSpace(java.awt.event.KeyEvent evt) {
        if (txtContent.getText().length() != 0 && txtContent.getSelectedText() == null) {
            lastBack = true;
            if (evt.getKeyCode() == 8) {
                charRepository.push(txtContent.getText().charAt(txtContent.getCaretPosition() - 1));
            }
            if (evt.getKeyCode() == 127) {
                lastDelete = true;
                charRepository.push(txtContent.getText().charAt(txtContent.getCaretPosition()));
            }

        }
        if (txtContent.getSelectedText() != null && txtContent.getSelectedText().length() > 0) {
            lastBack = true;
            for (int i = txtContent.getSelectedText().length() - 1; i >= 0; i--) {
                charRepository.push(txtContent.getSelectedText().charAt(i));
            }
        }
    }

    private void saveFile() {
        // mo thu muc cho user chon
        if (fileExisted == false) {
            JFileChooser fChoice = new JFileChooser();
            int choice = fChoice.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File f = fChoice.getSelectedFile();
                //
                if(!f.getName().contains(".txt")){
                    File fN=new File(f.getParent(), f.getName()+".txt");
                    FileDAO.writeFile(fN, txtContent);
                    fMain = fN;
                    fileExisted = true;
                    lastSave=true;
                    this.setTitle(fN.getName());
                }
                else{
                    
                    FileDAO.writeFile(f, txtContent);
                    fMain = f;
                    fileExisted = true;
                    lastSave=true;
                    this.setTitle(f.getName());
                }    
   
            }
        } else if (fileExisted == true) {
            FileDAO.writeFile(fMain, txtContent);
            lastSave=true;
        }

    }

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
       
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainFrame().setVisible(true);
                    
            }
        });
    }
    public void undoTest(){
        
        txtContent.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManage.addEdit(e.getEdit());
                
            }
        });
        //undoManage.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    public javax.swing.JLabel lblColAndRow;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnCopy;
    private javax.swing.JMenuItem mnCut;
    private javax.swing.JMenuItem mnDelete;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenuItem mnEditCopy;
    private javax.swing.JMenuItem mnEditCut;
    private javax.swing.JMenuItem mnEditDelete;
    private javax.swing.JMenuItem mnEditPaste;
    private javax.swing.JMenuItem mnEditUndo;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnFeedBack;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnFindNext;
    private javax.swing.JMenuItem mnFont;
    private javax.swing.JMenu mnFormat;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnNewWindow;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnPaste;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnSaveAs;
    private javax.swing.JMenuItem mnSelectAll;
    private javax.swing.JMenuItem mnTime;
    private javax.swing.JMenuItem mnUnDo;
    private javax.swing.JMenu mnView;
    private javax.swing.JMenuItem mnZoomIn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JRadioButtonMenuItem rdoDarkTheme;
    public javax.swing.JTextArea txtContent;
    // End of variables declaration//GEN-END:variables
}
