package com.android.api23;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * description
 *
 * @author hejing
 * @time 2019/3/19
 */
public class MyViewGroup extends LinearLayout {
    public final String TAG = this.getClass().getName();

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.i(TAG, "onInterceptTouchEvent#event:"+event.getAction());
        return super.onInterceptTouchEvent(event);
//        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            Log.i(TAG, "dispatchTouchEvent#event:"+event.getAction());
        }
        return super.dispatchTouchEvent(event);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "onTouchEvent#event:"+event.getAction());
        }
        return super.onTouchEvent(event);
//        return true;
    }
}
