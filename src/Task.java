public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getTask(){
        return this.description;
    }

    public void markAsDone(){
        this.isDone = true;
    }
    public void markAsNotDone(){
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public abstract String getTaskType();
}