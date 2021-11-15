public class BuilderPattern {
    public static void main(String[] args) {
    final Contact contact = new ContactBuilder()
            .name("Имя")
            .surname("Фамилия")
            .mail("ИмяФамилия@mail.com")
            .address("Ivanova 23")
            .phone("+375293216549")
            .build();

        System.out.println(contact);

    }



    }
