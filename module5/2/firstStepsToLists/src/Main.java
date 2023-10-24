import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();

        todoList.add("First todo");
        todoList.add(1, "Second todo");
        todoList.add(0, "Zero todo: ");

        todoList.set(0, "Zero todo -  not todo today");
        todoList.remove(0);

        int i = 1;
        for (String todo: todoList) {
            System.out.println(i + " - " + todo);
            i++;
        }
        /**
         * Разработайте список дел, который управляется командами в консоли. Команды: LIST, ADD, EDIT, DELETE.
         * Принцип работы команд:
         * •	LIST — выводит дела с их порядковыми номерами;
         * •	ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер;
         * •	EDIT — заменяет дело с указанным номером;
         * •	DELETE — удаляет.
         * •
         * Примеры команд
         * •	LIST
         * •	ADD Какое-то дело
         * •	ADD 4 Какое-то дело на четвёртом месте
         * •	EDIT 3 Новое название дела
         * •	DELETE 7
         * Команды вводятся одной строкой пользователем в консоль.
         */
    }
}