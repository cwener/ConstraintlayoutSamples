package com.example.mydemo.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class GroupHelper extends Group {
    private float mScaleX;
    public GroupHelper(Context context) {
        super(context);
    }

    public GroupHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void updatePreLayout(ConstraintLayout container) {
        super.updatePreLayout(container);
        float scaleX = this.getScaleX();
        float scaleY = this.getScaleY();
        float translateX = this.getTranslationX();
        float translateY = this.getTranslationY();
        for(int i = 0; i < this.mCount; ++i) {
            int id = this.mIds[i];
            View view = container.getViewById(id);
            if (view != null) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                view.setTranslationX(translateX);
                view.setTranslationY(translateY);
            }
        }
    }

    @Override
    public void setTranslationX(float translationX) {
        super.setTranslationX(translationX);
        requestLayout();
    }
}
