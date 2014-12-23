package com.amckendry.quizappidea.database.sql.definition;

import static com.amckendry.quizappidea.database.sql.definition.SqlDataConstraint.NO_CONSTRAINT;

public class SqlColumn implements SqlConstruct {

    private final String name;
    private final SqlDataType dataType;
    private final SqlDataConstraint dataConstraint;

    public SqlColumn(String name, SqlDataType dataType, SqlDataConstraint dataConstraint) {
        this.name = name;
        this.dataType = dataType;
        this.dataConstraint = dataConstraint;
    }

    public SqlColumn(String name, SqlDataType dataType) {
        this.name = name;
        this.dataType = dataType;
        this.dataConstraint = NO_CONSTRAINT;
    }

    @Override
    public String toSql() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append(name).append(" ")
                .append(dataType).append(" ")
                .append(dataConstraint);

        if(!NO_CONSTRAINT.equals(dataConstraint)) {
            sqlBuilder
                    .append(" ")
                    .append(dataConstraint);
        }

        return sqlBuilder.toString();
    }
}