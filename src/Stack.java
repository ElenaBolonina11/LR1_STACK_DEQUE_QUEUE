import java.util.Scanner;
//        Стек
//        Стеком (англ. stack) называется хранилище данных, в котором можно работать только с одним элементом: тем,
//        который был добавлен в стек последним. Стек должен поддерживать следующие операции:
//        push - Добавить (положить) в конец стека новый элемент
//        pop - Извлечь из стека последний элемент
//        back - Узнать значение последнего элемента (не удаляя его)
//        size - Узнать количество элементов в стеке
//        clear - Очистить стек (удалить из него все элементы)
// Реализация стека на Java без использования библиотек и коллекций в ввиде массива значений int

public class Stack {
    public static void main(String[] args) {
        DataBase stack = creationStack();
        stack.printStack();
        stack.push();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.back();
        stack.sizesize();
        stack.clear();
        stack.printStack();
    }
    public static class DataBase {
        int number;
        int myArray[];
        public DataBase(int number, int[] myArray) {
            this.number = number;
            this.myArray = myArray;
        }
        public void printStack(){
            System.out.println("Наш стек");
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
                myArrayNew[i] = myArray[i];
            }
            System.out.println("Вы удалили последний элемент = " + myArray[number-1] );
            myArray = myArrayNew;
            number--;
        }
        public void back (){
            System.out.println("Последний элемент = " + myArray[number-1] );
        }
        public void sizesize (){
            System.out.println("Длина стека = " + number );
        }
        public void clear (){
            number=1;
            myArray = new int[]{0};
            System.out.println("Вы очистили стек ");
        }
    }
    public static DataBase creationStack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер стека");
        int x = scanner.nextInt();
        System.out.println("Введи элементы стека");
        int array[] = new int[x];
        for(int i = 0; i < x; i++){
            array[i] = scanner.nextInt();
        }
        return new DataBase(x,array);
    }
}