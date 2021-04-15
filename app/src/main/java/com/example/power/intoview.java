package com.example.power;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class intoview extends PagerAdapter {
    Context ncontext;
    List<screenitem> nListscreen;

    public intoview(Context ncontext, List<screenitem> nListscreen) {
        this.ncontext = ncontext;
        this.nListscreen = nListscreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ncontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layoutscreen,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.introimg);
        imgSlide.setImageResource(nListscreen.get(position).ScreenImg);

        container.addView(layoutScreen);
        return layoutScreen;
    }



    @Override
    public int getCount() {
        return nListscreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
