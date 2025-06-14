package inheritance;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class DemoViewer {
    public static void main(String[] args) {
   System.out.println("Opening video in browser...");
       try {
           // Check if Desktop API is supported
           if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
               Desktop.getDesktop().browse(new URI("https://vimeo.com/449787858"));
           } else {
               System.out.println("Desktop not supported. Cannot open browser.");
           }
       } catch (IOException | URISyntaxException e) {
           System.out.println("Error: " + e.getMessage());
       }

    }}
