package designPatternAufgabe;

public class TaskManagementApp {

public static void main(String[] args) {
    TaskList TL = new TaskList();

    SimpleTask ST = new SimpleTask();
    SimpleTask.setTitle("Erste Aufgabe");
   

    TaskList subTaskList = new TaskList();
    SimpleTask.add(new SimpleTask("Zweite Aufgabe"));
    SimpleTask.add(new SimpleTask("Dritte Aufgabe"));
}
}