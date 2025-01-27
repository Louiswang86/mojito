package net.mikaelzero.mojito.interfaces;

import android.widget.FrameLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public interface IIndicator {

    void attach(FrameLayout parent);

    void onShow(ViewPager2 viewPager);

    /**
     * 拖动的时候  移动的 X 和 Y 距离
     */
    void move(float moveX, float moveY);

    /**
     * 手指松开后的状态
     */
    void fingerRelease(boolean isToMax, boolean isToMin);
}
