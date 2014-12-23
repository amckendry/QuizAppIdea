package com.amckendry.quizappidea.database.sql.definition;

public enum SqlKeyType {
    NOT_A_KEY(""),
    PRIMARY("PRIMARY"),
    FOREIGN("FOREIGN");

    private final String sql;
    SqlKeyType(String sql) {
        this.sql=sql;
    }

    public String toString() {
        return sql;
    }
}
