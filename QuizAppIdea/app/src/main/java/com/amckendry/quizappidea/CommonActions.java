package com.amckendry.quizappidea;

import android.app.Activity;
import android.content.Intent;

public class CommonActions {

    public static void simplyNavigateTo(Class activityToNavigateTo, Activity activityToNavigateFrom) {
        Intent navigationIntent = new Intent(activityToNavigateFrom, activityToNavigateTo);
        activityToNavigateFrom.startActivity(navigationIntent);
    }
}
