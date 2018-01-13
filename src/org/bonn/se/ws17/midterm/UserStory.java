package org.bonn.se.ws17.midterm;

public class UserStory {

    private String description;
    private String details;
    private String akzeptanz;
    private int mehrwert;   // 1-5
    private int strafe;     // 1-5
    private int risiko;     // 1-5
    private int aufwand;
    private String epic;
    
    UserStory(String description, String details, String akzeptanz, int mehrwert, int strafe, int risiko, int aufwand, String epic) throws Exception {
        setDescription(description);
        setDetails(details);
        setAkzeptanz(akzeptanz);
        setMehrwert(mehrwert);
        setStrafe(strafe);
        setRisiko(risiko);
        setAufwand(aufwand);
        setEpic(epic);
    }

    public String getDescription() {
        return description;
    }
    
    private void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }
    
    private void setDetails(String details) {
        this.details = details;
    }

    public String getAkzeptanz() {
        return akzeptanz;
    }
    
    private void setAkzeptanz(String akzeptanz) {
        this.akzeptanz = akzeptanz;
    }

    public int getMehrwert() {
        return mehrwert;
    }
    
    private void setMehrwert(int m) throws Exception {
        if (m < 1 || m > 5) {
            throw new Exception("Der Mehrwert liegt im Bereich 1-5, bitte korrigieren sie ihre Eingabe.");
        }
        mehrwert = m;
    }

    public int getRisiko() {
        return risiko;
    }
    
    private void setRisiko(int r) throws Exception {
        if (r < 1 || r > 5) {
            throw new Exception("Das Risiko liegt im Bereich 1-5, bitte korrigieren sie ihre Eingabe.");
        }
        risiko = r;
    }

    public int getStrafe() {
        return strafe;
    }
    
    private void setStrafe(int s) throws Exception {
        if (s < 1 || s > 5) {
            throw new Exception("Der Strafe-Wert liegt im Bereich 1-5, bitte korrigieren sie ihre Eingabe.");
        }
        strafe = s;
    }

    public int getAufwand() {
        return aufwand;
    }
    
    private void setAufwand(int a) {
        aufwand = a;
    }
    
    
    public double getPrio() {
        return Utils.calcPrio(mehrwert, strafe, risiko, aufwand);
    }

    public String getEpic() {
        return epic;
    }
    
    private void setEpic(String e) {
        epic = e;
    }
    
    @Override
    public String toString() {
        return "Beschreibung: " + description + "\n" + "Details: " + details + "\n" + "Akzeptanzkriterien: " + akzeptanz + "\n" + "Epic: " + epic + "\n" + "Mehrwert: " + mehrwert + "\n" + "Strafe: "
                + strafe + "\n" + "Risiko: " + risiko + "\n" + "Aufwand: " + aufwand + "\n" + "-----------------------------------------------------------------------------------------------------------------" + "\n";
    }

}
