package com.android.api23;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * description
 *
 * @author hejing
 * @time 2019/3/19
 */
@SuppressLint("AppCompatCustomView")
public class MyView extends TextView {
    public final String TAG = this.getClass().getName();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN) {
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
