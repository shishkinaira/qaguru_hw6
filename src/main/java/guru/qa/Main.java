package guru.qa;

public class Main {

    public static void main(String[] args) {
            // Примитивные типы данных
            // Целочисенные типы данных
            byte variableByte = 100;  // -128  +127     (-) 2^8(-1)
            short variableShort = 100; // -32768  +32767 (-) 2^16(-1)
            int variableInt = 100; //  (-) 2^32(-1)
            long variableLong = 100; // (-) 2^64(-1)
            // Числа с плавающей точкой
            float variableFloat = 100.09F; //32b
            double variableDouble = 100.09; //64b
            // Символьный
            char variableChar = '1';
            //String
            String word = "course";
            // Логический
            boolean variableBoolean = true;
            // Класс как тип данных
            Person Student = new Person("Ivan", "Ivanovich ","Ivanov",25);
            //System.out.println(Student);

            //Операторы
            // Арифметические + - * / %, ++ , -- с переполненим
            System.out.println((variableByte + variableShort) - ((variableInt / variableLong) * variableFloat) % variableDouble*10000000*10000000);
            // Логические операторы &, |, &&, ||, !
            if (word != null && !(word.equals("homework"))) {
                System.out.println("no!");
            }
            System.out.println((10 > 9) && (word.equals("homework hasnt done")));

            // Тернарный оператор
            // если word.equals("homework") то присвоить yes иначе присвоить no
            String compare = word.equals("homework")
                    ? "do you homework"
                    : "yes, its course";
            System.out.println(compare);

            //if else else
            if (compare.equals("course")) {
                compare = "yes";
            } else if (word.equals("homework")) {
                compare = "its homework";
            } else {
                compare = "try again";
            }
            System.out.println(compare);

        }
    }
