package com.amckendry.quizappidea.database.definition;


import android.provider.BaseColumns;

public class QuizDatabaseContract {


    private static final String COMMA = ",";

   private QuizDatabaseContract() {
   }
    public static abstract class Quiz implements BaseColumns {
        public static final String QUIZ_TABLE_NAME = "quiz";
        public static final String COLUMN_QUIZ_ID = "quizId";

        public static final String COLUMN_QUIZ_TITLE = "quizTitle";
        //TODO Add Builder Pattern Here.
        public static final String CREATION_SQL=new StringBuilder()
                .append(CREATE_TABLE).append(QUIZ_TABLE_NAME).append(OPEN_BRACKET)
                .append(_ID).append(INTEGER).append(PRIMARY_KEY).append(COMMA)
                .append(COLUMN_QUIZ_ID).append(TEXT).append(COMMA)
                .append()
    }
}
