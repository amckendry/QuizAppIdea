package com.amckendry.quizappidea.database.sql.definition;

public enum SqlDataType {
    TEXT("TEXT"),
    INTEGER("INTEGER");

    private final String sql;

    private SqlDataType(String sql) {
        this.sql = sql;
    }

    public String toString() {
        return sql;
    }
}