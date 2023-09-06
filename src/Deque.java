import java.util.Scanner;
//Деком (англ. deque – аббревиатура от double-ended queue, двухсторонняя очередь) называется структура данных, в которую
//        можно удалять и добавлять элементы как в начало, так и в конец. Дек хранится в памяти так же, как и очередь.
//        Система команд дека:
//        push_front - Добавить (положить) в начало дека новый элемент
//        push_back - Добавить (положить) в конец дека новый элемент
//        pop_front - Извлечь из дека первый элемент
//        pop_back - Извлечь из дека последний элемент
//        front - Узнать значение первого элемента (не удаляя его)
//        back - Узнать значение последнего элемента (не удаляя его)
//        size - Узнать количество элементов в деке
//        clear - Очистить дек (удалить из него все элементы)
//Реализация дека на Java без использования библиотек и коллекций в ввиде массива значений int
public class Deque {
    public static void main(String[] args) {
        DataBase deque = creationDeque();
        deque.printStack();
        deque.push_back();
        deque.push_front();
        deque.printStack();
        deque.pop_front();
        deque.pop_back();
        deque.printStack();
        deque.back();
        deque.front();
        deque.size();
        deque.clear();
        deque.printStack();
    }
    public static class DataBase {
        int number;
        int myArray[];
        public DataBase(int number, int[] myArray) {
            this.number = number;
            this.myArray = myArray;
        }
        public void printStack(){
            System.out.println("Наш дек:");
            for(int i = 0; i < number; i++){
                System.out.print(myArray[i]+" ");
            }
            System.out.println("");
        }
        public void push_back (){
            Scanner scanner = new Scanner(System.in);
            number++;
            int myArrayNew[] = new int[number];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i] = myArray[i];
            }
            System.out.println("Введи новый элемент в конец дека");
            myArrayNew[number-1] = scanner.nextInt();
            myArray = myArrayNew;
        }
        public void push_front (){
            Scanner scanner = new Scanner(System.in);
            number++;
            int myArrayNew[] = new int[number];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i+1] = myArray[i];
            }
            System.out.println("Введи новый элемент в начало дека");
            myArrayNew[0] = scanner.nextInt();
            myArray = myArrayNew;
        }
        public void pop_front (){
            int myArrayNew[] = new int[number-1];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i] = myArray[i+1];
            }
            System.out.println("Вы удалили первый элемент = " + myArray[0] );
            myArray = myArrayNew;
            number--;
        }
        public void pop_back (){
            int myArrayNew[] = new int[number-1];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i] = myArray[i];
            }
            System.out.println("Вы удалили последний элемент = " + myArray[number-1] );
            myArray = myArrayNew;
            number--;
        }
        public void back (){
            System.out.println("Последний элемент = " + myArray[number-1] );
        }
        public void front (){
            System.out.println("Первый элемент = " + myArray[0] );
        }
        public void size (){
            System.out.println("Длина дека = " + number );
        }
        public void clear (){
            number=1;
            myArray = new int[]{0};
            System.out.println("Вы очистили дек ");
        }
    }
    public static DataBase creationDeque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер дека");
        int x = scanner.nextInt();
        System.out.println("Введи элементы дека");
        int array[] = new int[x];
        for(int i = 0; i < x; i++){
            array[i] = scanner.nextInt();
        }
        return new DataBase(x,array);
    }
}
