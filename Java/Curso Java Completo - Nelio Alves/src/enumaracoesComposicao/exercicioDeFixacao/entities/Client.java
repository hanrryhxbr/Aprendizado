package enumaracoesComposicao.exercicioDeFixacao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private static final DateTimeFormatter formatterBithday = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final String name;
    private final String email;
    private final LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {

        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

    }

    public String getName() {

        return name;

    }

    public String getEmail() {

        return email;

    }

    public String getBirthDate() {

        return "(" + birthDate.format(formatterBithday) + ")";

    }

}
