package com.amckendry.quizappidea.ui;

import android.app.Activity;
import android.content.Intent;

public class CommonUIActions {

    public static void simplyNavigateTo(Class activityToNavigateTo, Activity activityToNavigateFrom) {
        Intent navigationIntent = new Intent(activityToNavigateFrom, activityToNavigateTo);
        activityToNavigateFrom.startActivity(navigationIntent);
    }
}
