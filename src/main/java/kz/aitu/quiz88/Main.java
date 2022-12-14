package kz.aitu.quiz88;

public class Main {

        public static void main(String[] args) {
            List list = new List();

            list.add(new Student("Lilly", 31, 1.01));
            list.add(new Student("Summer", 19, 2.34));
            list.add(new Student("Dee", 18, 3.06));
            list.add(new Student("Riley", 19, 0.3));
            list.add(new Student("Odonnell", 28, 0.38));
            list.add(new Student("Jayne", 36, 2.57));
            list.add(new Student("Jennings", 38, 3.84));
            list.add(new Student("Barton", 33, 1.56));
            list.add(new Student("Aguirre", 26, 2.81));
            list.add(new Student("Vickie", 31, 3.36));
            list.add(new Student("Hazel", 30, 0.79));
            list.add(new Student("Dalton", 28, 3.02));
            list.add(new Student("Burke", 31, 3.14));
            list.add(new Student("Small", 36, 0.19));
            list.add(new Student("May", 23, 0.94));
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("name_a", "asc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("name_a", "desc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("name_l", "asc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("name_l", "desc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("age", "asc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("age", "desc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("gpa", "asc");
            list.print();
            System.out.println("sortde by -----------------------------------------------------------------------");
            list.sort("gpa", "desc");
            list.print();
        }
    }
