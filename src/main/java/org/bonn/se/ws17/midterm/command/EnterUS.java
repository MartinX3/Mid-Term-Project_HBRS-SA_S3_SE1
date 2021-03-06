package org.bonn.se.ws17.midterm.command;

import org.bonn.se.ws17.midterm.model.Container;
import org.bonn.se.ws17.midterm.utility.InputUtils;

public class EnterUS implements Command {
    private String usid = "";
    
    private void setUsid(String usid) {
        this.usid = usid;
    }
    
    @Override
    public void execute(String[] strings) {
        try {
            usid = InputUtils.eingabe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        Container.getContainer().addHistory(clone());
        InputUtils.againUSEnter();
    }
    
    @Override
    public void undo() {
        Container.getContainer().removeUS(usid);
    }
    
    @Override
    public Command clone() {
        EnterUS cmd = new EnterUS();
    
        cmd.setUsid(usid);
    
        return cmd;
    }
}
