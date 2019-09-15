package com.example.mydemo.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class GroupHelper extends Group {
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mTranslateX = 1.0f;
    private float mTranslateY = 1.0f;
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
                if (mScaleX != scaleX) {
                    view.setScaleX(scaleX);
                }
                mScaleX = scaleX;
                if (mScaleY != scaleY) {
                    view.setScaleY(scaleY);
                }
                mScaleY = scaleY;
                if (mTranslateX != translateX) {
                    view.setTranslationX(translateX);
                }
                mTranslateX = translateX;
                if (mTranslateY != translateY) {
                    view.setTranslationY(translateY);
                }
                mTranslateY = translateY;
            }
        }
    }

    @Override
    public void setTranslationX(float translationX) {
        super.setTranslationX(translationX);
        requestLayout();
    }

    @Override
    public void setTranslationY(float translationY) {
        super.setTranslationY(translationY);
        requestLayout();
    }

    public void setTranslationXY(float translationX, float translationY) {
        setTranslationY(translationY);
        setTranslationX(translationX);
        requestLayout();
    }
}
