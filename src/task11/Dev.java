package task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

record Task(String taskName, Date issueDate, Date completionDate) {
    @Override
    public String taskName() {
        return taskName;
    }

    @Override
    public Date issueDate() {
        return issueDate;
    }

    @Override
    public Date completionDate() {
        return completionDate;
    }
}

public class Dev {
    private String name;
    ArrayList<Task> tasks;

    public Dev(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("name: ").append(name).append("\ntasks:");
        for (var task : tasks) {
            sb.append("\n name: ").append(task.taskName());
            sb.append("\n  issue date: ").append(task.issueDate());
            sb.append("\n  completion date: ").append(task.issueDate());
        }
        return sb.toString();
    }
}

class DevTest {
    public static void main(String[] args) throws ParseException {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("button", new SimpleDateFormat("dd-MM-yyyy").parse("12-10-2022"), new Date()));
        tasks.add(new Task("header", new SimpleDateFormat("dd-MM-yyyy").parse("05-04-2022"), new Date()));
        tasks.add(new Task("server bugs", new SimpleDateFormat("dd-MM-yyyy").parse("24-08-2022"), new Date()));
        Dev dev = new Dev("Ivan Ruzin", tasks);
        System.out.println(dev);
    }
}