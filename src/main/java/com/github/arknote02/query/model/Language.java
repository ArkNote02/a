package com.github.arknote02.query.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@RequiredArgsConstructor
@Accessors(fluent=true)
public enum Language {

    EN("English"),
    JA("日本語");

    private final String displayName;
}
