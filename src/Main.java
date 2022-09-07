public class Main {
    public static void main(String[] args) {

        Employee[] objects = new Employee[]{createObject(Professions.ACCOUNTANT),
                createObject(Professions.SECURITY), createObject(Professions.DRIVER)};

        for (Employee obj : objects) {
            obj.print();
        }

       /* createObject(Professions.ACCOUNTANT).print();
        createObject(Professions.SECURITY).print();
        createObject(Professions.DRIVER).print();*/


    }


    public static Employee createObject(Professions professions) {

        switch (professions) {
            case ACCOUNTANT:
                return new Accountant("Бухгалтер", "Geeg Tech", "Экономический");
            case SECURITY:
                return new Security("Охранник", "Банк Оптима", 80, 175);
            case DRIVER:
                return new Driver("Водитель", "Шоро", "A,B,C,D", 10);
        }



        return null;
    }

}



