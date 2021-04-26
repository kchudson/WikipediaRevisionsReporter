package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public class UserRevisionFormatter implements InterfaceFormatter{
    public String format(Revision revision){
        String olddatetime = DateTimeFormatter.ISO_INSTANT.format(revision.timestamp);
        String newdatetime = olddatetime
                .replace("T"," edited at ")
                .replace("Z", "");
        return String.format("At date %s, a chance by %s", newdatetime, revision.name);

    }
}
