import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();

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


        //将从键盘接收到的todo添加进todo list
        todoList.add(todo);

        //打印出todo list里的每一个todo
        for(Todo t : todoList) {
            System.out.println("todo id:" + todo.id + ",todo title:" + todo.title + ",state:" + todo.completed);

        }

        scan.close();
    }
}