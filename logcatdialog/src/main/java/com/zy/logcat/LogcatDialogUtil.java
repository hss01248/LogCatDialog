package com.zy.logcat;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.lang.ref.WeakReference;

/**
 * Created by huangshuisheng on 2018/8/24.
 */

public class LogcatDialogUtil {


    private static WeakReference<Activity> ref;

    public static void init(Application application){
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {
                ref = new WeakReference<Activity>(activity);

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }


    /**
     *
     * @param context 尽量使用activity,或者view.getContext()
     * @param title
     */
    public static void show(Context context,String title){
        if(!(context instanceof  Activity)){
            if(ref !=null && ref.get() !=null){
                context = ref.get();
            }
        }
        if(!(context instanceof Activity)){
            Log.d("logcatdialog",context +" not instance of activity!");
            return;
        }
        Activity activity = (Activity) context;
        if(activity.isFinishing()){
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if(activity.isDestroyed()){
                return;
            }
        }

        LogCatControl.getBuilder(context).clear();
        LogCatControl.getBuilder(context).setTitle(title).show();
    }

}
