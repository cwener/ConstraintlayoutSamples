package com.example.mydemo.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class RedBg extends Drawable {

    private Paint mPaint;
    private Path mPath;

    public RedBg() {
        mPaint = new Paint();
        mPaint.setColor(Color.parseColor("#ff2d4b"));
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPath = new Path();
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        mPath.reset();
        mPath.moveTo(0, 0);
        mPath.lineTo(bounds.width() / 2, 0);
        RectF rect = new RectF(bounds.width() / 2, 0, bounds.width() / 2 + 50, 50);
        mPath.arcTo(rect, 270f, 135);
        mPath.lineTo(bounds.width() / 4, bounds.height() / 2);
        mPath.lineTo(0, bounds.height() / 2);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
