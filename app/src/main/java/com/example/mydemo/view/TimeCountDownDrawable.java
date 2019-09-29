package com.example.mydemo.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by chengwen on 2019-09-29
 */
public class TimeCountDownDrawable extends Drawable {

    private Paint mProgressPaint;
    private Paint mBgPaint;
    private RectF mRectF = new RectF();
    private float mStrokeWidth = 5;
    private float mProgress;

    public TimeCountDownDrawable() {
        mProgressPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        mProgressPaint.setStrokeWidth(mStrokeWidth);
        mProgressPaint.setStyle(Paint.Style.STROKE);
        mProgressPaint.setColor(Color.parseColor("#FF2C55"));
        mBgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBgPaint.setColor(Color.parseColor("#1AFF2C55"));
        mBgPaint.setStyle(Paint.Style.STROKE);
        mBgPaint.setStrokeWidth(mStrokeWidth);
    }

    public void setProgress (int progress){
        this.mProgress = progress / 30f;
        invalidateSelf();
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        mRectF.set(mStrokeWidth / 2f,
                mStrokeWidth / 2f,
                right - left - mStrokeWidth / 2f,
                bottom - top - mStrokeWidth / 2f);
    }

    @Override
    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override
    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawArc(mRectF, 0, 360, false, mBgPaint);
        canvas.drawArc(mRectF,  - 90, 360 * mProgress - 360, false, mProgressPaint);
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
