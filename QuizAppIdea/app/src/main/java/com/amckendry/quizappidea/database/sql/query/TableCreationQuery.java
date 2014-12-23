package com.amckendry.quizappidea.database.sql.query;

import com.amckendry.quizappidea.database.sql.definition.SqlColumn;
import com.amckendry.quizappidea.database.sql.definition.SqlPrimaryKeyColumn;

public class TableCreationQuery implements SqlQuery {

    private static final String CREATE_TABLE = "CREATE TABLE";
    private static final String OPEN_BRACKET = "(";
    private static final String CLOSE_BRACKET = ")";

    private final SqlPrimaryKeyColumn primaryKey;

    @Override
    public String toSql() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(CREATE_TABLE).append(" ");
        return null;
    }

    public TableCreationQuery(String tableName, SqlPrimaryKeyColumn primaryKey) {
        this.primaryKey = primaryKey;
    }


}
