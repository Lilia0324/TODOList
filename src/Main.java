import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Todo> todoList = new ArrayList<>();

    public static void main(String[] args) {

        //从键盘接受todo
        Scanner scan = new Scanner(System.in);
        System.out.println("please input things you want to do:");

        //从键盘输入任务标题
        String title = scan.next();

        //创建一个Todo object
        Todo todo = new Todo();
        todo.id = 1;
        todo.title = title;
        todo.completed = false;

        String task1 = "1 add tasks";
        String task2 = "2 view tasks";
        String task3 = "3 delete tasks";
        String task4 = "4 exit";

        System.out.print(task1);
        System.out.print( task2);
        System.out.print( task3);
        System.out.print( task4);

        switch(){
            case "task1" :
                addTask(todo);
                break;
            case "task2" :
                viewTask();
                break;
            case "task3":
                System.out.println("Which task you want to delete?");
                deleteTask(scan.nextInt());
            case "task4" :
                scan.close();
        }

        scan.close();
    }

    //add task
    public static void addTask(Todo todo) {
        //将从键盘接收到的todo添加进todo list
        todoList.add(todo);
    }

    //view tasks
    public static String viewTask(){
        //打印出todo list里的每一个todo
        for(Todo t : todoList) {
            System.out.println("todo id:" + todo.id + ",todo title:" + todo.title + ",state:" + todo.completed);
        }
        return "That's all tasks";
    }

    // delete tasks
    public static void deleteTask(int id) {
        todoList.remove(id);
        viewTask();
    }
}