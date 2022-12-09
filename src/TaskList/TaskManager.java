package TaskList;

import java.util.*;

public class TaskManager {
    Queue<Task> taskQueue = new PriorityQueue<>();
    private Map<String, Queue<Task>> taskMap = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }

    void mainLoop() {
        Option option;
        do {
        System.out.println("Dostępne opcje - wybierz pozycję");
        printOptions();
            option = Option.createFromInt(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Wybrano opcję : " + option);


            switch (option) {
                case ADD:
                    taskQueue.offer(CreateTask());
                    break;
                case SHOW:
                    printAllTasks(getTaskQueue());
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("PAPA");
                    break;
            }

        } while (option != Option.EXIT);

    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.print("Zadanie do wykonania: ");
            System.out.println(nextTask);
        }
    }

    public void printAllTasks(Queue<Task> taskQueue) {
        if (taskQueue.isEmpty()) {
            System.out.println("There is no tasks in the database");
        }

        for (Task task : taskQueue) {
            System.out.println(task.toString());
        }
    }

    private Task CreateTask() {

        System.out.println("Podaj nazwę zadania:");
        String name = scanner.nextLine();

        System.out.println("Podaj opis zadania:");
        String description = scanner.nextLine();

        System.out.println("Podaj priorytet:");
        for (Task.Priority value : Task.Priority.values()) {
            System.out.println(value);
        }

        Task.Priority priority = Task.Priority.valueOf(scanner.nextLine().toUpperCase());


        return new Task(name, description, priority);
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    private enum Option {
        ADD(0, "Dodaj zadanie"),
        SHOW(1,"Wyświetl listę zadań"),
        TAKE(2, "Wykonaj zadanie" ),
        EXIT(3, "Zamknij program");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }

        @Override
        public String toString() {
            return  option + " - " + description;
        }
    }
}
