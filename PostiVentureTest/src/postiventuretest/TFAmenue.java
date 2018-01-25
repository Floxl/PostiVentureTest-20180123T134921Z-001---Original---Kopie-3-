package postiventuretest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import postiventuretest.menue.Strings;

public class TFAmenue {

    public static void main(String[] args) throws IOException {
// INTs 
        int highscore = 0;
        int iLvlSelCounter = 1;
        int iLevelSelect = 0;
        int iFinishedLvl = 0;
        int iTotalLvl = 3;
        int b = 0;
        int iAddHscPoints = 0;
        int iMisspellCounter = 0;
        int iTotalMisspellCounter = 0;
        int iEasterggCounter = 0;
        int iFoundEastereggs = 0;
        int iTotalEastereggs = 4;
             
        System.out.println("b = " + b);
        
// STRINGS         
        String sGender = "t";
        String sUsername = "Number 5 Lives";
        String sLevelSelect = "MAP31\nHappy Eastern!";
        String sLevelRange = "(1 - 1)";
        String sEastereggTable = "MAP31";
        String sFoundEggs = "";
        String sFirstname = "Number 5";
        String sLastname = "Lives";

// MIXED i / s / b
        
        boolean bSpellSwitch = false;
        boolean bLvlRerun = false;
                
// ### Beginn INTRO 
        JOptionPane.showMessageDialog(null, Strings.mStTitleProducer());
        JOptionPane.showMessageDialog(null, Strings.mStTitleGameName());

// LEVEL Strings
        String sLVL01 = "notStarted";
        String sLVL02 = "notStarted";
        String sLVL03 = "notStarted";
        String sTutorial = "notStarted";
        
        String sEaster1234 = "notFound";
        String sEasterMessage = "notFound";
        String sLvlSelCountAch = "notFound";
        String sAllCompleteAch = "notFound";
        
        String sRateOfCompletion = "";
        
// Gender       
        boolean bGenderEmpty = true;
        while (bGenderEmpty == true) {
            sGender = JOptionPane.showInputDialog(Strings.mStTitleGender(), "w");
            sGender = sGender.toLowerCase().trim();

            bGenderEmpty = sGender.isEmpty();
        }

// Username 
        boolean bUsernameEmpty = true;
        while (bUsernameEmpty == true) {

            if (sGender.equals("m")) {
                sUsername = JOptionPane.showInputDialog(Strings.mStInputNameMale(), "Roger Wilco");

            } else if (sGender.equals("w")) {
                sUsername = JOptionPane.showInputDialog(Strings.mStInputNameFemale(), "Jane Jensen");
            }
            
            else {
                sUsername = JOptionPane.showInputDialog(Strings.mStInputNameOther(), "Nummer 5 lebt");
            }

            bUsernameEmpty = sUsername.isEmpty();
        }
        sUsername = sUsername.trim();
        System.out.println(
                "sUsername = " + sUsername);
        if (sUsername.contains(" ")){
        int iNameLength = sUsername.length();
        int iSpaceBeforeLastname = sUsername.lastIndexOf(" ");
        sFirstname = sUsername.substring(0, iSpaceBeforeLastname);
        sLastname = sUsername.substring(iSpaceBeforeLastname, iNameLength);

        System.out.println("sFirstname = " + sFirstname + " sLastname = " + sLastname);
        } else {
            sFirstname = sUsername.substring(0);
            System.out.println("sFirstname = " + sFirstname);
        }
// ### End of INTRO 
// ### Beginn LEVELDATA 
JOptionPane.showMessageDialog(null, Strings.mLine() 
        +"Posti exklusive WELTPREMIERE!\n"
        + "Michels erstes 1 Week 1 Game Videospiel"
        + "\n& sein erstes Spiel EVER!!!111!1!1!!!\n"
        + Strings.mLine()
);
        for (b = 0; b < 10000; b++) {
            
// EasterEggMessage
  if (iEasterggCounter == 3 || iTotalMisspellCounter == 9){
      System.out.println("// EasterEggMessage");
                       JOptionPane.showMessageDialog(null, sFirstname + " du hast schon " + iTotalMisspellCounter + "x eine ungültige Eingabe gemacht.\n"
                            + "Das muss natürlich belohnt werden " + sFirstname + " !!! ;)\n"
                            + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                            + "Die Codes für ein paar der verfügbaren Eastereggs sind:\n" + sEastereggTable
                            + "\n\nMögst du lang und in Frieden leben."
                            + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''"
                            + "\n"
                            + "Übrigens: Du musst jetzt nur noch 3x etwas falsch eingeben um in diese Secretansicht zu gelangen."); 
                       
                       iMisspellCounter = 0;
                       iEasterggCounter = 2;
                       
                    while (sEasterMessage == "notFound"){
                       iFoundEastereggs++;
                    iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        if (iFoundEastereggs < 2){
                            JOptionPane.showMessageDialog(null, Strings.mLine() + sFirstname + " du hast gerade ein Easteregg gefunden!\n"
                                        + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        } else {
                        JOptionPane.showMessageDialog(null, Strings.mLine() + sFirstname + " du hast erneut ein Easteregg gefunden!\n"
                                        + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        }
                        
                        sEasterMessage = "found";
                    }
                       
            }          
            
// LEVELSELECT  
           
            boolean bLVLselEmpty = true;
            while (bLVLselEmpty == true) {
// ACHIEVEMENTS 
// ACHIEVEMENTS 25x Menue
                if (iLvlSelCounter == 25) {
                    JOptionPane.showMessageDialog(null, Strings.mStAchLvlSelEINS() + iLvlSelCounter + Strings.mStAchLvlSelZWEI());
                    while (sLvlSelCountAch == "notFound"){
                        iFoundEastereggs++;
                       
                        iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        sLvlSelCountAch = "found";
                    }
                }
// ACHIEVEMENTS All Lvl Finished       
                if (iFinishedLvl == iTotalLvl) {
                    JOptionPane.showMessageDialog(null, Strings.mLine() + "HERZLICHEN GLÜCKWUNSCH!\n\n" + Strings.mStAchLvlSelEINS() +"\nAlle Level erfolgreich abgeschlossen!\n" + Strings.mLine() );
                    while (sAllCompleteAch == "notFound"){
                        iFoundEastereggs++;
                        
                        iAddHscPoints = 42;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iEasterggCounter++;
                        sAllCompleteAch = "found";
                    }
                }
// LEVELSELECT Finished LVL
if (iFinishedLvl >= 1){
    sRateOfCompletion = iFinishedLvl + " von " + iTotalLvl + " abgeschlossen.";
}
// LEVELSELECT Input 
                sLevelSelect = JOptionPane.showInputDialog("Highscore = " + highscore +  sFoundEggs 
                        + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n" + sFirstname
                        + " tippe die Nummer eines Levels " + sLevelRange + " ein.\n\nTippe \"Tutorial\" \\ t für ein Tutorial und \"Exit\" \\ x zum beenden ein." 
                                + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n" + sRateOfCompletion, "2");
                sLevelSelect = sLevelSelect.toLowerCase().replace("exit", "42").replace("x", "42").replace("tutorial", "33")
                        .replace("t", "33").replace("MAP31", "1942").replace("Happy Eastern!", "1234").trim();
                bLVLselEmpty = sLevelSelect.isEmpty();
            }
// LEVELSELECT Misspelling

            
            boolean bSpellingCorrect = sLevelSelect.matches("[0-9]*");
            //boolean bMisspelling = sLevelSelect.equals("1") || sLevelSelect.equals("2") || sLevelSelect.equals("33") || sLevelSelect.equals("42");
            // System.out.println("bMisspelling = " + bMisspelling);
            if (bSpellingCorrect == false) {
                sLevelSelect = sLevelSelect.replace(sLevelSelect, "1987654321");

                iMisspellCounter++;
                iTotalMisspellCounter++;
                bSpellSwitch = iTotalMisspellCounter > 9 && iMisspellCounter == 3;
                
                System.out.println("iMisspellCounter = " + iMisspellCounter);
                if (iMisspellCounter == 3 & iTotalMisspellCounter == 3) {
                    JOptionPane.showMessageDialog(null, sFirstname + " du hast schon 3x eine ungültige Eingabe gemacht.\n"
                            + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                            + "Tippe die Nummer eines passenden Levels zB. \" 2 \" ein.\n"
                            + "Die verfügbaren Level sind: " + sLevelRange + "\n\n"
                            + "Tippe \"Tutorial\" für ein Tutorial und \"Exit\" zum beenden ein."
                                    + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                    
                    iMisspellCounter = 0;
                    }
                else if (iTotalMisspellCounter > 5 && iTotalMisspellCounter < 7 || bSpellSwitch == true) {
                    JOptionPane.showMessageDialog(null, sFirstname + " du hast erneut 3x eine ungültige Eingabe gemacht.\n"
                            + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                            + "Tippe die Nummer eines passenden Levels zB. \" 2 \" ein.\n"
                            + "Die verfügbaren Level sind: " + sLevelRange + "\n\n"
                            + "Tippe \"Tutorial\" für ein Tutorial und \"Exit\" zum beenden ein."
                                    + "\n''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                                    + "Oder machst du das etwa... extra? ;)");
                    iEasterggCounter++;
                    iMisspellCounter = 0;
                    bSpellSwitch = false;
                                                           
                    }
                }
// LEVELSELECT Too Long?
            int iLvlSelLength = sLevelSelect.length();
            if (iLvlSelLength > 10){
                sLevelSelect = sLevelSelect.substring(0, 10);
            }
            System.out.println("String sLevelSelect = " + sLevelSelect + "\n");

// LEVELSELECT Parse            
            iLevelSelect = Integer.parseInt(sLevelSelect);
            System.out.println("iLevelSelectLoop = " + iLevelSelect);

// LEVELSELECT Counter           
            iLvlSelCounter++;
            System.out.println("iLvlSelCounter = " + iLvlSelCounter);

// LEVEL 1 
            if (iLevelSelect == 1) {

                System.out.println("// LEVEL 1");
                boolean b33Loop = true;
                
                boolean bLoesung = false;
                // TUTORIAL Ready?
                int iReady = JOptionPane.showConfirmDialog(null, Strings.mLine() +
                        "Willkommen zum ersten Level!\n"
                                + Strings.mLine()
                        + "Bist du bereit dich der Aufgabe zu stellen?\n"
                                );
                System.out.println("iReady = " + iReady);
                
                if (iReady == 0) {
                    while (sLVL01 == "notStarted"){
                        iAddHscPoints = 10;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade "+ iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        
                        sLVL01 = "started";                        
                    }
                } else if ((iReady == 1 || iReady == 2)){
                    b33Loop = false;
                } 
                
// LEVEL1 content
// LEVEL1 Loop 1
                while (b33Loop == true) {
                    
                    if (bLvlRerun == false){
                        JOptionPane.showMessageDialog(null, "Na dann legen wir mal los!"
                        + "\nJetzt kommt das feindliche Zeichen!");
                        bLvlRerun = true;
                       }
                    
                    
                    String blah = JOptionPane.showInputDialog(Strings.mLine()
                              + "\n" 
                              + "                     ;\n" 
                              + "\n\n"
                             + Strings.mLine() );
                    
                    char cLetter0 = blah.trim().charAt(0);
                    
                    if (cLetter0 == '.') {
                         
                        JOptionPane.showMessageDialog(null, "DU HAST ES ERFASST!\n"
                              + Strings.mLine()
                              + "\n" 
                              + "                     ,\n" 
                              + "\n\n"
                             + Strings.mLine() );
                        
                        while (sLVL01 == "started"){
                            iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iFinishedLvl++;
                        
                        System.out.println("sLVL01 = " + sLVL01);
                        sLVL01 = "finished";
                        b33Loop = false;
                        }
                        b33Loop = false;
                    }
                    else if (cLetter0 == ',') {
                         
                        JOptionPane.showMessageDialog(null, "DU HAST ES ERFASST!\n"
                              + Strings.mLine()
                              + "\n" 
                              + "                     .\n" 
                              + "\n\n"
                             + Strings.mLine() ); 
                        
                        while (sLVL01 == "started"){
                            iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iFinishedLvl++;
                                              
                        System.out.println("sLVL01 = " + sLVL01);
                        sLVL01 = "finished";
                        b33Loop = false;
                        }
                        b33Loop = false;
                    } 
                    else {
                        
                        iReady = JOptionPane.showConfirmDialog(null, 
                                Strings.mLine() + "\" " + blah + " \" war leider nicht die richtige Lösung.\n" 
                                        + sFirstname + ", willst du es nochmal probieren?\n" + Strings.mLine());
                System.out.println("iAgain = " + iReady);
                
                if (iReady == 0) {
                          
                    }
                else if ((iReady == 1 || iReady == 2)){
                    b33Loop = false;
                }
                    }
                
// LEVEL1 Loop 1 End  
                }

                
// LEVEL 2 

            } else if (iLevelSelect == 2) {
                JOptionPane.showMessageDialog(null, "Hey das zweite Level :)");
                sLVL02 = "started";
                while (sLVL02 == "started"){
                            iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iFinishedLvl++;
                                              
                        System.out.println("sLVL02 = " + sLVL02);
                        sLVL02 = "finished";
                        
                        }

// TUTORIAL 
            } else if (iLevelSelect == 33) {
                System.out.println("// Tutorial");
                boolean b33Loop = true;
                bLvlRerun = false;
                boolean bLoesung = false;
                // TUTORIAL Ready?
                int iReady = JOptionPane.showConfirmDialog(null, Strings.mLine() +
                        "Willkommen zum Tutorial!\n"
                                + Strings.mLine()
                        + "Bist du bereit dich der Aufgabe zu stellen?\n"
                                );
                System.out.println("iReady = " + iReady);
                
                if (iReady == 0) {
                    while (sTutorial == "notStarted"){
                        iAddHscPoints = 10;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade "+ iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        
                        sTutorial = "started";                        
                    }
                } else if ((iReady == 1 || iReady == 2)){
                    b33Loop = false;
                } 
                
// TUTORIAL content
// TUTORIAL Loop 1
                while (b33Loop == true) {
                    
                    if (bLvlRerun == false){
                        JOptionPane.showMessageDialog(null, "Na dann legen wir mal los!"
                        + "\nSchließlich ist noch kein Held vom Himmel gefallen...");
                        bLvlRerun = true;
                       }
                    
                    
                    String blah = JOptionPane.showInputDialog("Tippe 1 ein", "0");
                    bLoesung = blah.matches("1");

                    if (bLoesung == true) {
                        
                        JOptionPane.showMessageDialog(null, "DU HAST ES ERFASST!");
                        iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iAddHscPoints = -20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine()
                                + "So leicht ist es natürlich nicht ;)\n"
                                        + "Auch die Punkte erhälst du erst später...\n"
                                        + "Jetzt wirds ernst.\n"
                                        + Strings.mLine() );
                        JOptionPane.showMessageDialog(null, Strings.mLine() + "In TYPEQUEST geht es darum die feindlichen Zeichen aufzulösen!"
                        + "\nDie feindlichen Zeichen löst du auf " + sFirstname + ", indem du ein Zeichen eintippst,"
                                + "\nwelches ein Teil des feindlichen Zeichens darstellt."
                                + "\n\n"
                                + "Das Eingabefeld ist dabei deine Waffe!\n" + Strings.mLine() 
                        + "Probieren wir es gleich mal aus"
                                );
                        bLoesung = false;
// TUTORIAL Loop 2
                        while (bLoesung == false){
                        blah = JOptionPane.showInputDialog( 
                                "ACHTUNG! HIER IST DAS ERSTE FEINDLICHE ZEICHEN\n"
                                + Strings.mLine() 
                                + "\n"
                                + "                     !" 
                                + "\n\n\n"
                                + Strings.mLine() 
                                + "Uff! Na ob du dich das zutraust?" 
                        + "\nGebe mal ganz mutig einen Punkt \" . \" in das Eingabefeld ein.");
                        char cLetter0 = blah.trim().charAt(0);
                    
                        if (cLetter0 == '.') {

                            JOptionPane.showMessageDialog(null, Strings.mLine() + "In TYPEQUEST geht es darum die feindlichen Zeichen aufzulösen!"
                        + "\nDas hast du gerade getan " + sFirstname + "!"
                                + "\n\n"
                                + "Dem feindlichen Zeichen \" ! \" hast du gerade den \" . \" geklaut!\n"
                                + "\nJetzt ist es nur noch ein jämmerliches \" | \"\n" + Strings.mLine() 
                        + "HERZLICHEN GLÜCKWUNSCH " + sFirstname + "!"
                                + "\nDu hast das Tutorial erfolgreich abgeschlossen!"
                                );
// TUTORIAL Loop 3                            
                        while (sTutorial == "started"){
                        iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        JOptionPane.showMessageDialog(null, Strings.mLine() 
                                + "Jetzt hast du wirklich " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        iFinishedLvl++;
                        sTutorial = "finished";                        
                    }
// TUTORIAL Loop 3 End
                        bLoesung = true;
                        }
                        else {
                        
                        iReady = JOptionPane.showConfirmDialog(null, 
                                Strings.mLine() + "\" " + blah + " \" war leider nicht die richtige Lösung.\n" 
                                        + sFirstname + ", willst du es nochmal probieren?\n");
                System.out.println("iAgain = " + iReady);
                
                if (iReady == 0) {
                          JOptionPane.showMessageDialog(null, "Okay " + sFirstname + ", jetzt aber!");
                    }
                else if (iReady == 1 || iReady == 2){
                    bLoesung = true;
                }
                        }
// TUTORIAL Loop 2 End
                        }
                        b33Loop = false;
                    } 
                    
                    else {
                        
                        iReady = JOptionPane.showConfirmDialog(null, 
                                Strings.mLine() + "\" " + blah + " \" war leider nicht die richtige Lösung.\n" 
                                        + sFirstname + ", willst du es nochmal probieren?\n");
                System.out.println("iAgain = " + iReady);
                
                if (iReady == 0) {
                          
                    }
                else if ((iReady == 1 || iReady == 2)){
                    b33Loop = false;
                }
                    }
// TUTORIAL Loop 1 End  
                }
            }
// HAPPY EASTERN!
                else if (iLevelSelect == 1234) {
                JOptionPane.showMessageDialog(null, Strings.mLine() + "HAPPY EASTERN!\n" + Strings.mLine());
                iEasterggCounter = 3;
                
                while (sEaster1234 == "notFound"){
                    iFoundEastereggs++;
                    iAddHscPoints = 20;
                        highscore = highscore + iAddHscPoints;
                        if (iFoundEastereggs < 2){
                            JOptionPane.showMessageDialog(null, Strings.mLine() + sFirstname + " du hast gerade ein Easteregg gefunden!\n"
                                        + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        } else {
                        JOptionPane.showMessageDialog(null, Strings.mLine() + sFirstname + " du hast erneut ein Easteregg gefunden!\n"
                                        + "Du hast gerade " + iAddHscPoints + " Punkte erhalten!\n"
                                + Strings.mLine() + "\n Dein neuer Highscore liegt bei \"" 
                                + highscore + "\" Punkten.");
                        }
                sEaster1234 = "found";
            } 

            System.out.println("b ist " + b);

        }
// EXIT                
                else if (iLevelSelect == 42) {

                break;
            }
            if (iFoundEastereggs > 0){
                sFoundEggs = " | Eastereggs = " + iFoundEastereggs + " von " + iTotalEastereggs;
            }
            System.out.println("iFoundEastereggs = " + iFoundEastereggs);
            }
// #### End of LEVELDATA 

// Script HIGHSCORELISTE 
        Path pfad = Paths.get(System.getProperty("user.home"))
                .resolve("Desktop").resolve("Highscore.txt");

        String inhalt = "";

        if (Files.exists(pfad)) {
            inhalt = new String(Files.readAllBytes(pfad));
        }

        inhalt +="\r\n" + " #<3# " + sUsername + " ### " + "Highscore= " + highscore + " ";

        Files.write(pfad, inhalt.getBytes());

// ENDMASSAGE 
        JOptionPane.showMessageDialog(null, "Danke fürs spielen :)");

    }

}
