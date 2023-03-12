public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Lybov")
                .setSurname("Martinova")
                .setAge(31)
                .setAddress("Pilsijarvi")
                .build();

        Person daughter = mom.newChildBuilder()
                .setName("Nina")
                .build();

        System.out.println(mom + " has a child " + daughter);


        // Не хватает обязательных полей
        try {
            new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        // Недопустимый возраст
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


    }


}
