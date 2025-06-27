class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask(new Task(1, "Design", "Pending"));
        tm.addTask(new Task(2, "Develop", "Ongoing"));
        tm.displayTasks();
        tm.searchTask(2);
        tm.deleteTask(1);
        tm.displayTasks();
    }
}