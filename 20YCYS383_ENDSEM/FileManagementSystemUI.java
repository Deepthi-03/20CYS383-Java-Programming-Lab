package com.amrita.jpl.cys21014.endsem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Deepthi J, CB.EN.U4CYS21014
 * @version 1.0
 */

/**
 *Creating an Abstract class 'com.amrita.jpl.cys21014.endsem.File'
 *Attributes: fileName, fileSize
 *Methods: getters and setters for all attributes, displayFileDetails()
 */
abstract class File{
private String fileName;
    private long fileSize;

    public File(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }
    public void displayFileDetails() {
        System.out.println("File Name: " + fileName);
       System.out.println("File Size: " + fileSize);
    }
}

/**
 * class 'com.amrita.jpl.cys21014.endsem.Document' inherits from com.amrita.jpl.cys21014.endsem.File
 * Attributes: documentType
 * Methods: getters and setters for documentType, displayFileDetails()
 */
class Document extends File {
    private String documentType;

    public Document(String fileName, int fileSize, String documentType) {
        super(fileName, fileSize);
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void displayFileDetails() {
        System.out.println("Document Type: " + documentType);
    }
}

/**
 * Class 'com.amrita.jpl.cys21014.endsem.Image' inherits from com.amrita.jpl.cys21014.endsem.File
 * Attributes: resolution
 * Methods: getters and setters for resolution, displayFileDetails()
 */

class Image extends File {
    private String resolution;

    public Image(String fileName, int fileSize, String resolution) {
        super(fileName, fileSize);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void displayFileDetails() {
        System.out.println("Resolution: " + resolution);
    }
}
/**
 * Class 'com.amrita.jpl.cys21014.endsem.Video' inherits from com.amrita.jpl.cys21014.endsem.File
 * Attributes: duration
 * Methods: getters and setters for duration, displayFileDetails()
 */

class Video extends File {
    private int duration;

    public Video(String fileName, int fileSize, int duration) {
        super(fileName, fileSize);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void displayFileDetails() {
        System.out.println("Duration: " + duration);
    }
}

/**
 * com.amrita.jpl.cys21014.endsem.FileManager: Interface that declares the following methods
 * void addFile(com.amrita.jpl.cys21014.endsem.File file): Add a file to the file management system.
 * void deleteFile(String fileName): Delete a file from the file management system by providing the file name.
 * void displayAllFiles(): Display details of all the files in the file management system.
 */
interface FileManager{
        void addFile(File file);
        void deleteFile(String fileName);
        void saveToFile();
        void loadFromFile();
        ArrayList<File> getFiles();
}

//class FileManagerImpl implements com.amrita.jpl.cys21014.endsem.FileManager {
//    private ArrayList<com.amrita.jpl.cys21014.endsem.File> files;
//
//    public FileManagerImpl() {
//        files = new ArrayList<>();
//    }
//
//    public void addFile(com.amrita.jpl.cys21014.endsem.File file) {
//        files.add(file);
//    }
//
//    public void deleteFile(String fileName) {
//        for (int i = 0; i < files.size(); i++) {
//            if (files.get(i).getFileName().equals(fileName)) {
//                files.remove(i);
//                break;
//            }
//        }
//    }

/**
 * Implementing Main function that demonstrates the functionality of the file management system.
 *
 */
class FileManagementSystemUI extends JFrame{
    private DefaultTableModel tableModel;
    private JTable table;

    public FileManagementSystemUI() {
        setTitle("21UCYS End Semester Assignment File Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);


        tableModel = new DefaultTableModel(new Object[]{"File Name", "File Name", "File Type"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);



        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());

        JLabel fileNameLabel = new JLabel("File Name:");
        JTextField fileNameField = new JTextField(10);

        JLabel fileSizeLabel = new JLabel("File Size:");
        JTextField fileSizeField = new JTextField(5);

        JLabel fileTypeLabel = new JLabel("Document Type:");
        JTextField fileTypeField = new JTextField(10);

        textPanel.add(fileNameLabel);
        textPanel.add(fileNameField);
        textPanel.add(fileSizeLabel);
        textPanel.add(fileSizeField);
        textPanel.add(fileTypeLabel);
        textPanel.add(fileTypeField);
        getContentPane().add(textPanel, BorderLayout.NORTH);

        JButton addButton = new JButton("File");
        JButton deleteButton = new JButton("File");
        JButton refreshButton = new JButton("Refresh");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(refreshButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FileManagementSystemUI file_manager = new FileManagementSystemUI();
                file_manager.setVisible(true);
            }
        });
    }
}




