/*
 * Copyright (C) 2005  Alexis Miara (alexis.miara@licef.ca)
 *
 * This file is part of LomPad.
 *
 * LomPad is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * LomPad is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LomPad; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package ca.licef.lompad;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.*;
import java.util.*;
import licef.StringUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;
import javax.swing.JFileChooser;
import org.json.*;

class JPanelForm extends JPanel {

    static JPanelForm instance;

    JPanel jPanelProfile;
    JPanel jPanelNormeticProfileIcons;
    JPanel jPanelNormeticLegend;
    JLabel jLabelRequired;
    JLabel jLabelRecommended;
    JLabel jLabelOptional;
    JLabel jLabelConditionalMandatory;
    JLabel jLabelProfileName;
    JLabel jLabelProfileIcon;
    JLabel jLabelProfile;
    JLabel jLabelLegend;

    JSplitPane splitPane;
    FileBrowser browser;
    JPanel jPanelWrapper;

    boolean bInit;
    LomForm lomForm;

    boolean isNormeticProfile = false;
    Icon normeticIcon;

    File file = null;

    public JPanelForm() {
        instance = this;

        setOpaque(false);
        setLayout(new BorderLayout(0, 0));
        lomForm = new LomForm();

        jPanelProfile = new JPanel();
        jPanelProfile.setLayout(new BoxLayout(jPanelProfile, BoxLayout.X_AXIS));
        add(BorderLayout.NORTH, jPanelProfile);
        jPanelProfile.add(Box.createHorizontalStrut(5));
        jLabelProfile = new JLabel("profile");
        jLabelProfile.setFont(new Font("Dialog", Font.PLAIN, 12));
        jPanelProfile.add(jLabelProfile);
        JLabel jLabelColon = new JLabel(" : ");
        jLabelColon.setFont(jLabelProfile.getFont());
        jPanelProfile.add(jLabelColon);
        jLabelProfileName = new JLabel();
        jLabelProfileName.setPreferredSize(new Dimension(300, 28));
        jLabelProfileName.setFont(jLabelProfile.getFont());
        jPanelProfile.add(jLabelProfileName);
        jPanelProfile.add(Box.createHorizontalGlue());
        jLabelProfileIcon = new JLabel();
        jLabelProfileIcon.setHorizontalAlignment(JLabel.RIGHT);
        jLabelProfileIcon.setPreferredSize(new Dimension(40,28));
        jLabelProfileIcon.setVisible(false);
        jPanelProfile.add(jLabelProfileIcon);
        jPanelProfile.add(Box.createHorizontalStrut(5));

        add(BorderLayout.CENTER, lomForm);

        jPanelNormeticLegend = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        add(BorderLayout.SOUTH, jPanelNormeticLegend);
        jLabelLegend = new JLabel("legend");
        jLabelLegend.setFont(jPanelProfile.getFont());
        jPanelNormeticLegend.add(jLabelLegend);
        jLabelRequired = new JLabel("required", Util.redIcon, SwingConstants.LEADING);
        jLabelRequired.setFont(jLabelProfile.getFont());
        jPanelNormeticLegend.add(jLabelRequired);
        jLabelRecommended = new JLabel("recommended", Util.yellowIcon, SwingConstants.LEADING);
        jLabelRecommended.setFont(jLabelProfile.getFont());
        jPanelNormeticLegend.add(jLabelRecommended);
        jLabelOptional = new JLabel("optional", Util.greenIcon, SwingConstants.LEADING);
        jLabelOptional.setFont(jLabelProfile.getFont());
        jPanelNormeticLegend.add(jLabelOptional);
        jLabelConditionalMandatory = new JLabel("conditionalMandatory", Util.greenYellowRedIcon, SwingConstants.LEADING);
        jLabelConditionalMandatory.setFont(jLabelProfile.getFont());
        jPanelNormeticLegend.add(jLabelConditionalMandatory);

        normeticIcon = Util.normeticDisabledIcon;

        browser = new FileBrowser();
        browser.setFont( new Font( "Dialog", Font.PLAIN, 12 ) );  

        browser.addFileBrowserListener( new FileBrowserListener() {

            public void setEnabled( boolean isEnabled ) {
                this.isEnabled = isEnabled;
            }

            public boolean isEnabled() {
                return( this.isEnabled );
            }

            public void fileSelected( FileBrowserEvent e ) {
                if( isEnabled ) {
                    setEnabled( false );
                    if( openFileFromBrowser( e.getFile() + "" ) )
                        browser.setCurrLocation( e.getFile() + "" );
                    else {
                        String currFileLoc = browser.getCurrFileLocation();
                        if( currFileLoc == null )
                            browser.clearSelection();
                        else
                            browser.setCurrLocation( currFileLoc );
                    }
                    setEnabled( true );
                }
            }

            public void directorySelected( FileBrowserEvent e ) {
                if( isEnabled ) {
                    try {
                        Preferences.getInstance().setFileBrowserLocation( e.getFile() ); 
                    }
                    catch( Exception e2 ) {
                        e2.printStackTrace();
                    }
                }
            } 

            public void browserClosed() {
                hideBrowser();
            }

            private boolean isEnabled = true;

        } );

        bInit = true;
        lomForm.init();
        bInit = false;

        updateLocalization();
    }

    public void initBrowser() {
        browser.setCurrLocation( Preferences.getInstance().getFileBrowserLocation() + "" );
        if( Preferences.getInstance().isFileBrowserOpened() )
            showBrowser();
    }

    public void showBrowser() {
        if( splitPane == null ) {
            remove( jPanelProfile );
            remove( lomForm ); 
            remove( jPanelNormeticLegend );
            jPanelWrapper = new JPanel( new BorderLayout( 0, 0 ) );
            jPanelWrapper.add( BorderLayout.NORTH, jPanelProfile );
            jPanelWrapper.add( BorderLayout.CENTER, lomForm );
            jPanelWrapper.add( BorderLayout.SOUTH, jPanelNormeticLegend );
            splitPane = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT, browser, jPanelWrapper ); 
            add( BorderLayout.CENTER, splitPane );
            validate();
        }
        browser.setVisible( true );
        browser.update();
        try {
            Preferences.getInstance().setFileBrowserOpened( true );
        }
        catch( Exception e ) {
            e.printStackTrace();
        }

        int browserWidth = Preferences.getInstance().getFileBrowserWidth();
        if( browserWidth > 0 ) 
            splitPane.setDividerLocation( browserWidth );
    }

    private void hideBrowser() {
        if( splitPane != null ) {
            remove( splitPane );
            browser.setVisible( false );
            try {
                Preferences.getInstance().setFileBrowserOpened( false );
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
            splitPane.remove( browser );
            splitPane.remove( jPanelWrapper );
            splitPane = null;
            add( BorderLayout.NORTH, jPanelProfile );
            add( BorderLayout.SOUTH, jPanelNormeticLegend );
            add( BorderLayout.CENTER, lomForm );
            validate();
        }
    }

    public void updateLocalization() {
        ResourceBundle resBundle = ResourceBundle.getBundle("properties.JFrameFormRes", Preferences.getInstance().getLocale());
        jLabelProfile.setText(resBundle.getString("profile"));
        jLabelLegend.setText(resBundle.getString("legend") + " :");
        jLabelRequired.setText(resBundle.getString("required"));
        jLabelRecommended.setText(resBundle.getString("recommended"));
        jLabelOptional.setText(resBundle.getString("optional"));
        jLabelConditionalMandatory.setText(resBundle.getString("conditionalMandatory"));
        jLabelProfileName.setText(resBundle.getString(Preferences.getInstance().getApplicationProfileView() + "Label"));    

        if( browser != null )
            browser.updateLocalization();
    }

    void doFilter() {
        if (bInit) return;
        if (!Preferences.getInstance().getApplicationProfileView().equals("IEEE"))
            changeStandard(Preferences.getInstance().getApplicationProfileView(), false);
    }

    void changeToIEEE() {
        lomForm.preUpdateVocabularies();

        undo();
        try {
            Preferences.getInstance().setApplicationProfileView( "IEEE" );
        }
        catch( Exception e ) {
            e.printStackTrace();
        }

        bInit = true;
        lomForm.updateVocabularies();
        bInit = false;
    }

    void undo() {
        if (!Preferences.getInstance().getApplicationProfileView().equals("IEEE"))
            changeStandard(Preferences.getInstance().getApplicationProfileView(), true);
    }

    void changeStandardActionPerformed(String profile, boolean isVisible) {
        lomForm.preUpdateVocabularies();
        changeStandard(profile, isVisible);
        Util.setExternalVocabulary(getCurrentSelectedProfile());
        bInit = true;
        lomForm.updateVocabularies();
        bInit = false;
    }

    void changeStandard(String profile, boolean isVisible) {
        if (!isVisible) {
            undo();
            try {
                Preferences.getInstance().setApplicationProfileView( profile );
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
        }

        try {
            ResourceBundle resBundle = ResourceBundle.getBundle("properties." + Preferences.getInstance().getApplicationProfileView());

            StringTokenizer st = new StringTokenizer(resBundle.getString("hideComponent"), ",");
            while (st.hasMoreTokens())
                lomForm.setFormVisible(st.nextToken(), isVisible);
        } 
        catch (Exception ignore) {
        }

        updateIcons();
    }

    public void updateIcons() {
        lomForm.clearFormIcon();
        lomForm.clearFormToolTipText();
        try {
            ResourceBundle resBundle = ResourceBundle.getBundle("properties." + Preferences.getInstance().getApplicationProfileView());
            setFormIcons( resBundle, "mandatoryComponent", Util.redIcon );
            setFormIcons( resBundle, "conditionalMandatoryComponent", Util.greenYellowRedIcon );
            setFormIcons( resBundle, "recommendedComponent", Util.yellowIcon );
            setFormIcons( resBundle, "optionalComponent", Util.greenIcon );
        } 
        catch (Exception ignore) {
        }
    }

    public String getCurrentSelectedProfile() {
        String res = Preferences.getInstance().getApplicationProfileView();
        if (res.startsWith("NORMETIC_1p1"))
            res = "NORMETIC_1p1";
        else if (res.startsWith("NORMETIC_1p2"))
            res = "NORMETIC_1p2";
        return res;
    }

    public boolean isValidNormetic() {
        ResourceBundle resBundle = ResourceBundle.getBundle("properties." + getCurrentSelectedProfile() + "_MandatoryElements");
        StringTokenizer st =
            new StringTokenizer(resBundle.getString("mandatoryComponent"), ",");
        while (st.hasMoreTokens()) {
            boolean res = lomForm.isComplete(st.nextToken());
            if (!res) return false;
        }
        return true;
    }

    boolean manageCurrentLom() {
        if (lomForm.hasChanged()) {
            JDialogQuestion dialog = new JDialogQuestion(Util.getTopJFrame(this), "title", "text1");
            dialog.setVisible( true );
            int res = dialog.res;
            dialog.dispose();
            if (res == JDialogQuestion.CANCEL)
                return false;
            if (res == JDialogQuestion.NO)
                return true;
            else if (res == JDialogQuestion.YES) {
                ResourceBundle resBundle = ResourceBundle.getBundle("properties.JFrameFormRes", Preferences.getInstance().getLocale());
                return saveFile(resBundle.getString("save"));
            }
        }

        return true;
    }

    void updateFrameTitle() {
        String s = "";
        JFrame top = Util.getTopJFrame(this);
        String title = top.getTitle();
        int index = title.indexOf(" -");
        if (index != -1)
            title = title.substring(0, index);
        if (file != null)
            s = " - " + file.getName();

        top.setTitle(title + s);
    }

    void newForm(boolean callFromMenu) {
        if (callFromMenu) {
            if(!manageCurrentLom())
                return;
            if( browser != null )
                browser.clearSelection();
        }

        bInit = true;
        lomForm.init();
        bInit = false;
        doFilter();
        lomForm.update();
        lomForm.initiateHasChanged();

        file = null;

        if (callFromMenu) {
            updateFrameTitle();
            updateNormeticIcon();
        }
    }

    public boolean openFileFromBrowser( String file ) {
        if (!manageCurrentLom())
            return( false );

        newForm(false);

        boolean isValidFile = true;

        try {
            lomForm.fromXML(new FileInputStream(file));
        } catch (Exception e) {
            isValidFile = false;
            JDialogAlert dialog = new JDialogAlert(Util.getTopJFrame(this), "titleErr", "text1");
            dialog.setVisible( true );
            if( browser != null ) {
                browser.clearSelection();
                file = null;
            }
        }

        this.file = ( file == null ? null : new File( file ) );

        lomForm.initiateHasChanged();
        updateFrameTitle();
        updateNormeticIcon();

        if( isValidFile ) {
            try {
                Preferences.getInstance().setFileBrowserLocation( this.file ); 
            }
            catch( Exception e2 ) {
                e2.printStackTrace();
            }
            return( true );
        }

        return( false );
    }

    public void openFile(String label) {
        if (!manageCurrentLom())
            return;

        File fileTmp = selectFile(true, label);
        if (fileTmp == null)
            return;

        newForm(false);

        if( fileTmp.isDirectory() ) {
            showBrowser();
            browser.setCurrLocation( fileTmp + "" ); 
            return;
        }

        file = fileTmp;
        boolean isValidFile = true;

        try {
            lomForm.fromXML(new FileInputStream(file));
        } catch (Exception e) {
            isValidFile = false;
            JDialogAlert dialog = new JDialogAlert(Util.getTopJFrame(this), "titleErr", "text1");
            dialog.setVisible( true );
            if( browser != null ) {
                browser.clearSelection();
                file = null;
            }
        }
        lomForm.initiateHasChanged();
        updateFrameTitle();
        updateNormeticIcon();
        if( browser != null ) {
            if( isValidFile )
                browser.setCurrLocation( file + "" );
            else
                browser.setCurrLocation( browser.getCurrFileLocation() );
        }
    }

    File selectFile(boolean openMode, String label) {
        File f = null;
        JFileChooser fc = new JFileChooser();
        if( openMode )
            fc.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        fc.setCurrentDirectory(Preferences.getInstance().getWorkingDir());
        if (label != null)
            fc.setDialogTitle(" " + label);
        fc.addChoosableFileFilter(new XMLFilter());
        int rVal;
        if (openMode)
            rVal = fc.showOpenDialog(this);
        else {
            String s = "lom.xml";
            if (file != null)
                s = file.getName();
            fc.setSelectedFile(new File(s));
            rVal = fc.showSaveDialog(this);
        }
        if (rVal == JFileChooser.APPROVE_OPTION) {
            f = new File(fc.getCurrentDirectory() + File.separator +
                    fc.getSelectedFile().getName());
        }

        if (f != null) {
            try {
                Preferences.getInstance().setWorkingDir( fc.getSelectedFile().isDirectory() ? f : f.getParentFile() );
            }
            catch( Exception e ) {
                e.printStackTrace();
            }
        }
        return f;
    }

    public boolean saveFile(String label) {
        if (file == null) {
            File selectedFile = selectFile(false, label);

            if (selectedFile == null)
                return false;

            if (selectedFile.exists()) {
                JDialogQuestion dialog = new JDialogQuestion(Util.getTopJFrame(this), "title", "text2");
                dialog.setVisible( true );
                int res = dialog.res;
                dialog.dispose();
                if (res == JDialogQuestion.CANCEL || res == JDialogQuestion.NO)
                    return( false );
            }

            file = selectedFile;
        }

        doSaveFile();
        return true;
    }

    public void saveAsFile(String label) {
        File selectedFile = selectFile(false, label);
        if (selectedFile != null ) {
            if( selectedFile.exists()) {
                JDialogQuestion dialog = new JDialogQuestion(Util.getTopJFrame(this), "title", "text2");
                dialog.setVisible( true );
                int res = dialog.res;
                dialog.dispose();
                if (res == JDialogQuestion.CANCEL || res == JDialogQuestion.NO)
                    return;
            }
            file = selectedFile;

            doSaveFile();
        }
    }

    private void doSaveFile() {
        if( file != null ) {
            writeFile(file);
            lomForm.initiateHasChanged();
            updateFrameTitle();
            updateNormeticIcon();
            if( browser != null )
                browser.setCurrLocation( file + "" );
        }
    }

    void writeFile(File f) {
        try {
            String lom = lomForm.toXML();
            FileOutputStream fos = new FileOutputStream(f);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
            writer.write(lom);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    void viewHTML() {
        popHTML(lomForm.toHTML());
    }

    void viewXML() {
        popXML(lomForm.toXML());
    }

    void popXML(String xml) {
        try {
            popLomFromTempFile( xml, "lom.xml" );
        }
        catch( Exception ignore ) {
            ignore.printStackTrace();
        }
    }

    void popHTML(String html) {
        try {
            popLomFromTempFile( html, "lom.html" );
        }
        catch( Exception ignore ) {
            ignore.printStackTrace();
        }
    }
    
        void convertir(){
    
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                    System.out.println(entrada.nextLine());
                }
            byte[] b=Files.readAllBytes(f.toPath());
            String xml = new String(b);
            JSONObject obj= XML.toJSONObject(xml);
            System.out.println("SALE JSON");
            System.out.println(obj);
            javax.swing.JFileChooser jF1= new javax.swing.JFileChooser();
            String ruta2 = ".json";
            if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){
            ruta2 = jF1.getSelectedFile().getAbsolutePath();
            FileWriter file = new FileWriter(ruta2);
	    file.write(obj.toString());
	    file.flush();
	    file.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    
}

    void changeLanguage(String lang) {
        try {
            if (lang.equals("fr")) {
                Util.setBundleLocale(Locale.FRENCH);
                lomForm.graphicalUpdate();
            }
            else if (lang.equals("en")) {
                Util.setBundleLocale(Locale.ENGLISH);
                lomForm.graphicalUpdate();
            }
            else if (lang.equals("es")) {
                Util.setBundleLocale(new Locale("es"));
                lomForm.graphicalUpdate();
            }

            lomForm.update();
            updateIcons();
        } catch (Exception e) {
        }
    }

    void updateProfile(String profile) {
        isNormeticProfile = profile.startsWith( "Normetic" );
        jPanelNormeticLegend.setVisible( isNormeticProfile );

        //profil name
        jLabelProfileName.setText(profile);

        //Icon
        if (isNormeticProfile) {
            jLabelProfileIcon.setIcon(normeticIcon);
            jLabelProfileIcon.setVisible(true);
        }
        else if ("CanCore".equals(profile)) {
            jLabelProfileIcon.setIcon(Util.cancoreIcon);
            jLabelProfileIcon.setVisible(true);
        }
        else {
            jLabelProfileIcon.setIcon(null);
            jLabelProfileIcon.setVisible(false);
        }
        jLabelProfileIcon.updateUI();

    }

    private void updateNormeticIcon() {
        if (isNormeticProfile) {
            normeticIcon = (isValidNormetic())?Util.normeticIcon:Util.normeticDisabledIcon;
            jLabelProfileIcon.setIcon(normeticIcon);
        }
    }

    private void popLomFromTempFile( String lom, String tempFile ) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String file = null;
        try {
            String tempDir = System.getProperty("java.io.tmpdir").replace('\\', '/');
            if (!tempDir.endsWith("/")) tempDir += "/";
            file = tempDir + tempFile;

            reader = new BufferedReader( new StringReader( lom ) );
            writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file ), "UTF-8" ) );
            Util.copy( reader, writer );
        } 
        catch( FileNotFoundException e ) {
            e.printStackTrace();
        }
        catch( UnsupportedEncodingException e2 ) {
            e2.printStackTrace();
        }
        catch( IOException e3 ) {
            e3.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }
            catch( IOException e ) {
                e.printStackTrace();
            }
            try {
                writer.close();
            }
            catch( IOException e ) {
                e.printStackTrace();
            }
        }
        Util.launchFile(file);
    }

    private void setFormIcons( ResourceBundle bundle, String keyGroupLabel, ImageIcon icon ) {
        if( bundle.containsKey( keyGroupLabel )  ) {
            String keys = bundle.getString(  keyGroupLabel );
            if( !StringUtil.isEmpty( keys ) ) {
                ResourceBundle bundleToolTipText = ResourceBundle.getBundle( "properties." + getCurrentSelectedProfile() + "_ToolTipText", 
                    Preferences.getInstance().getLocale() );
                StringTokenizer st = new StringTokenizer( keys, ",");
                while (st.hasMoreTokens()) {
                    String key = st.nextToken();
                    String toolTipText = ( bundleToolTipText == null || !bundleToolTipText.containsKey( key ) ? null : bundleToolTipText.getString( key ) );
                    lomForm.setFormIcon(key, icon);
                    lomForm.setFormToolTipText(key, toolTipText);
                }
            }
        }
    }

    public void manageLocalClassifications() {
        JDialogManageClassifications dialogManageClassif = new JDialogManageClassifications( Util.getTopJFrame(this) );
        dialogManageClassif.setSize( 660, 400 );
        dialogManageClassif.setVisible( true );
    }

}
