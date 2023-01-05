import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("JSF para aplicação web");
        course1.setDescription("Introdução a JSF para aplicação web");
        course1.setWorkload(2);
        System.out.println(course1);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Mentoria Java 11");
        mentoring1.setDescription("Mentoria sobre atributos básico do Java 11");
        mentoring1.setDate(LocalDate.of(2023, 2, 13));

        System.out.println(mentoring1);
    }
}