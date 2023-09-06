import java.util.Scanner;
// Очередью (aнгл. queue)) называется структура данных, в которой элементы кладутся в конец, а извлекаются из начала.
//        Таким образом, первым из очереди будет извлечен тот элемент, который будет добавлен раньше других.
//        Элементы очереди хранятся в массиве. При этом из очереди удаляется первый элемент, и, чтобы не сдвигать все
//        элементы очереди, в памяти хранится индекс элемента массива, с которого начинается очередь. При удалении
//        элементов, очередь будет "ползти" дальше от начала массива.
//        Набор функций идентичен стеку, за исключением функции pop, которая выдает первый элемент массива.
// Реализация очереди на Java без использования библиотек и коллекций в ввиде массива значений int
public class Queue {
    public static void main(String[] args) {
        DataBase queue = creationQueue();
        queue.printStack();
        queue.push();
        queue.printStack();
        queue.pop();
        queue.printStack();
        queue.back();
        queue.fist();
        queue.sizesize();
        queue.clear();
        queue.printStack();
    }
    public static class DataBase {
        int number;
        int myArray[];
        public DataBase(int number, int[] myArray) {
            this.number = number;
            this.myArray = myArray;
        }
        public void printStack(){
            System.out.println("Наша очередь:");
            for(int i = 0; i < number; i++){
                System.out.print(myArray[i]+" ");
            }
            System.out.println("");
        }
        public void push (){
            Scanner scanner = new Scanner(System.in);
            number++;
            int myArrayNew[] = new int[number];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i] = myArray[i];
            }
            System.out.println("Введи новый элемент");
            myArrayNew[number-1] = scanner.nextInt();
            myArray = myArrayNew;
        }
        public void pop (){
            int myArrayNew[] = new int[number-1];
            for(int i = 0; i < number-1; i++){
                myArrayNew[i] = myArray[i+1];
            }
            System.out.println("Вы удалили первый элемент = " + myArray[0] );
            myArray = myArrayNew;
            number--;
        }
        public void back (){
            System.out.println("Последний элемент = " + myArray[number-1] );
        }
        public void fist (){
            System.out.println("Первый элемент = " + myArray[0] );
        }
        public void sizesize (){
            System.out.println("Длина очереди = " + number );
        }
        public void clear (){
            number=1;
            myArray = new int[]{0};
            System.out.println("Вы очистили очередь ");
        }
    }
    public static DataBase creationQueue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер очереди");
        int x = scanner.nextInt();
        System.out.println("Введи элементы в очереди");
        int array[] = new int[x];
        for(int i = 0; i < x; i++){
            array[i] = scanner.nextInt();
        }
        return new DataBase(x,array);
    }
}
