package com.github.arknote02.query.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data // TODO uuidない状態のインスタンスは認めないように変更する
@Accessors(fluent=true)
public class Account {

    private UUID uuid;
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDateTime signUpDateTime;
    private Country country;
    private Language language;
    private String gender;
    private LocalDate birthDate;
}
