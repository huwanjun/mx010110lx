package com.bw.xm010110ani;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * author: 斛万珺
 * data: 2020/1/10 18:18:55
 * function:
 */
public class FlowLayout extends ViewGroup {
    int screenWid=50;


    public FlowLayout(Context context) {
        super(context);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        screenWid=displayMetrics.widthPixels;
        screenWid=displayMetrics.heightPixels;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        int wSpace=30;
        int hSpace=20;

        int left=wSpace;
        int top=hSpace;
        int right=0;
        int bottom=0;

        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            child.measure(0,0);
            int measuredWidth = child.getMeasuredWidth();
            int measuredHeight = child.getMeasuredHeight();
            right=left+measuredWidth;

            if (right>screenWid){

                left=wSpace;
                top=bottom+hSpace;
                right=left+measuredWidth;

            }
            bottom=top+measuredHeight;
            child.layout(left,top,right,bottom);
            left=right+wSpace;
        }

    }

    public void addTag(String tag){

        final TextView textView = new TextView(getContext());
        textView.setText(tag);
        textView.setTextColor(Color.RED);
        textView.setBackgroundColor(Color.BLUE);
        addView(textView);

        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator translationX = ObjectAnimator.ofFloat(textView, "translationX",300  );
                ObjectAnimator translationY = ObjectAnimator.ofFloat(textView, "translationY",900);

                AnimatorSet set=new AnimatorSet();
                set.setDuration(3000);
                set.playTogether(translationX,translationY);
                set.start();
            }
        });
    }
    OnTagClickListener onTagClickListener;

    public void setOnTagClickListener(OnTagClickListener onTagClickListener) {
        this.onTagClickListener = onTagClickListener;
    }

    public interface OnTagClickListener{
        void OnTagClick(String tag);


}
}
