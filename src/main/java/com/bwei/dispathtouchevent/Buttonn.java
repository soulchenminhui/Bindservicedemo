package com.bwei.dispathtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * 陈敏慧
 * Created by d on 2017/11/8.
 */

public class Buttonn extends android.support.v7.widget.AppCompatButton{
    public Buttonn(Context context) {
        super(context);
    }

    public Buttonn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Buttonn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        System.out.println("我是button的分发============dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("我是button的消费============onTouchEvent");
        return super.onTouchEvent(event);
    }
}
