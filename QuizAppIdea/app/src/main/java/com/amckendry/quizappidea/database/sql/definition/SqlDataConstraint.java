package com.amckendry.quizappidea.database.sql.definition;


public enum SqlDataConstraint {
    NO_CONSTRAINT(""),
    NOT_NULL("NOT NULL");

    private final String sql;

    SqlDataConstraint(String sql) {
        this.sql=sql;
    }

    public String toString() {
        return sql;
    }
}