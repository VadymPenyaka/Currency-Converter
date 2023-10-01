package penyaka.currency.converter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    private UUID id;
    private String firstName;
    private String lastName;
    private Document document;
}
