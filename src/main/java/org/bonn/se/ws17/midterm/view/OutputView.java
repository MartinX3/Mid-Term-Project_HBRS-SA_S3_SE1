package org.bonn.se.ws17.midterm.view;

import org.bonn.se.ws17.midterm.dto.UserStoryDTO;

import java.util.Collections;
import java.util.List;

public class OutputView implements OutputList {
    @Override
    public void display(List<UserStoryDTO> listDTO) {
        if (listDTO.isEmpty()) {
            System.out.println("Keine Userstory vorhanden.");
        } else {
            System.out.println("Userstories:");
    
            Collections.sort(listDTO);
    
            listDTO.forEach(us -> {
                System.out.println(us.toString());
                if (listDTO.indexOf(us) != listDTO.size() - 1) {
                    System.out.println("---------------------------------------------------------");
                }
            });
        }
    }
}
