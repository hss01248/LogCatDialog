package com.zy.logcat;

import android.content.Context;

/**
 * Created by huangshuisheng on 2018/8/24.
 */

public class LogcatDialogUtil {


    /**
     *
     * @param context 尽量使用activity,或者view.getContext()
     * @param title
     */
    public static void show(Context context,String title){
        LogCatControl.getBuilder(context).clear();
        LogCatControl.getBuilder(context).setTitle(title).show();
    }

}
