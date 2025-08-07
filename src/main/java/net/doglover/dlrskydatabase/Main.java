package net.doglover.dlrskydatabase;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        launchDatabase();
    }

    public static void launchDatabase() {
        System.out.println("Launching Database...");
        SwingUtilities.invokeLater(MainFrame::new);
    }
}