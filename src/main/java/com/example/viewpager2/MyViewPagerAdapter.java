package com.example.viewpager2;

/**
 * Created by Administrator on 2016/5/20.
 */

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class MyViewPagerAdapter extends PagerAdapter {
    private List<View> viewList;
    private List<String> titleList;
    /**
     * 构造函数
     * @param viewList
     * @param titleList
     */
    public MyViewPagerAdapter(List<View> viewList, List<String> titleList) {
        this.viewList = viewList;
        this.titleList = titleList;
    }

    /**
     *
     * @return  页卡数量
     * */
    public int getCount() {
        return this.viewList.size();
    }

    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    /**
     *
     * @param container
     * @param position
     * @return 实例化一个页卡
     */
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView((View)this.viewList.get(position));
        return this.viewList.get(position);
    }

    /**
     * 销毁一个页卡
     * @param container  添加到viewGroup中 position表示当前页卡
     * @param position 页卡的位置
     * @param object
     */
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)this.viewList.get(position));
    }

    /**
     * 获得标题
     * @param position 页卡位置
     * @return
     */
    public CharSequence getPageTitle(int position) {
        return (CharSequence)this.titleList.get(position);
    }
}


