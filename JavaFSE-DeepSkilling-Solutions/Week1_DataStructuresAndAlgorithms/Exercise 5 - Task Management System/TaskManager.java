public class TaskManager {
    Task head;

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = task;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task temp = head;
        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Found: " + temp.taskName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    public void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.taskId + ": " + temp.taskName + " [" + temp.status + "]");
            temp = temp.next;
        }
    }
}