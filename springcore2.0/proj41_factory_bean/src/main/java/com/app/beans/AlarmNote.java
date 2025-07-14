package com.app.beans;

import java.util.Date;

public class AlarmNote {

    private Date date;

    public AlarmNote(Date date) {
        System.out.println("AlarmNote.AlarmNote()");
        this.date = date;
    }

    // business method

    public void scheduler() {
        System.out.println("AlarmNote.scheduler()");
        Date currentDate = new Date();
        if (currentDate.getDate() == date.getDate()) {
            System.out.println("Import meeting schedule.....");
        } else {
            System.out.println("No meeting today");
        }
    }

}
