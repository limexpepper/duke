package nus.duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {
    protected LocalDate localDate;
    String originalUserInput;

    public Deadline(String userInput) {
        super(userInput);
        // originalUserInput = userInput;
        String description = super.getDescription(userInput);
        super.setDescription(description);
        this.localDate = processDate(userInput);
    }
    @Override
    public String getTaskType(){
        return "D";
    }

    public String getOriginalUserInput(){ return this.originalUserInput; }

    @Override
    public String getTaskDetails(){
        String date = localDate.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        date = "(by: " + date + ")";
        return date;
    }

    public LocalDate getDate(){
        return this.localDate;
    }
}