public class Main {
    public static void main(String[] args) {
        Human human = new Human( //человек
                "Montana", "Antonio", 30);
        System.out.println(human);

        Student student = new Student( //студент
                "Pinlman", "Jessie", 25,
                "Chemistry", "WW_22",
                90, 95); //Объект класса Student
        System.out.println(student);

        Teacher teacher = new Teacher( // учитель
                "Pinl", "Jes", 25,
                "Chemistry", 50);
        System.out.println(teacher);

        Graduate graduate = new Graduate( //Выпускник
                "Chris", "Jes", 40,
                "Chemistry", "OBN", 70, 50,
                "HoW");
        System.out.println(graduate);

        Specialist specialist = new Specialist(//дипломник который защитил проект
                "Петров", "Иван", 23,
                "Экономист", "E2018", 85, 100,
                "Государственная поддержка малого предпринимательства", 5);
        System.out.println(specialist);

      Bookkeeper bookkeeper = new Bookkeeper( //бухгалтер
                "Беспалова", "Валентина", 60,
                 1983, 100000);
        System.out.println(bookkeeper);

        Master master = new Master ("Тырыгина", "Галина", "Степановна",
                80,  "Кафедра иностранных языков",
                150,  50); //заведующий кафедрой
        System.out.println(master);
    }
}


