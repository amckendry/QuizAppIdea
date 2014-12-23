package com.amckendry.quizappidea.database.definition;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuizDatabaseAccess extends SQLiteOpenHelper {

    private static final String QUIZ_DATABASE_NAME = "quiz.db";
    private static final int QUIZ_DATABASE_VERSION=1;
    private static final SQLiteDatabase.CursorFactory NO_CURSOR_FACTORY = null;

    public QuizDatabaseAccess(Context context) {
        super(context, QUIZ_DATABASE_NAME, NO_CURSOR_FACTORY, QUIZ_DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
