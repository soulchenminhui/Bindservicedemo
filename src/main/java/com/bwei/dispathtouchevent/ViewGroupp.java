package com.bwei.dispathtouchevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * 陈敏慧
 * Created by d on 2017/11/8.
 */

public class ViewGroupp extends LinearLayout{
    public ViewGroupp(Context context) {
        super(context);
    }

    public ViewGroupp(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupp(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        System.out.println("我是viewgroup的拦截============onInterceptTouchEvent");
        return true;
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean result = super.dispatchTouchEvent(event);
        System.out.println("我是viewgroup的分发============dispatchTouchEvent");
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("我是viewgroup的消费============onTouchEvent");
        return super.onTouchEvent(event);
    }
}
