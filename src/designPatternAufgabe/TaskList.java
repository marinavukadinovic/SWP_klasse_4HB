package designPatternAufgabe;

import java.util.List;

public class TaskList extends Task{
    private List<Task> tasks = new <ArrayList>();

    public void display() {
        for (Task task : tasks) {
            task.display();
        }
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }
}