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
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "s onInterceptTouchEvent#event:" + event.getAction());
        }
        boolean result = super.onInterceptTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "e onInterceptTouchEvent#event:" + event.getAction());
        }
        return result;
//        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "s dispatchTouchEvent#event:" + event.getAction());
        }
        boolean result = super.dispatchTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "e dispatchTouchEvent#event:" + event.getAction());
        }
        return result;
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "s onTouchEvent#event:" + event.getAction());
        }
        boolean result = super.onTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "e onTouchEvent#event:" + event.getAction());
        }
        return result;
//        return false;
    }
}
