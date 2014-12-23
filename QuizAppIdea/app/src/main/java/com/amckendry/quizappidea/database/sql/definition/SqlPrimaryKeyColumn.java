package com.amckendry.quizappidea.database.sql.definition;


public class SqlPrimaryKeyColumn extends SqlColumn {
    public SqlPrimaryKeyColumn(String name, SqlDataType dataType, SqlDataConstraint dataConstraint) {
        super(name, dataType, dataConstraint);
    }

    @Override
    public String toSql() {
        return super.toSql() + " " + SqlKeyType.PRIMARY;
    }
}
