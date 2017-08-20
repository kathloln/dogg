package com.example.zzj.fragmenttab;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/8/20.
 */

public class FragmentFactory {
    public static Fragment getInstanceByIndex(int index){
        Fragment fragment = null;
        switch (index){
            case 1:
                fragment = new HomeFragment();
                break;
            case 2:
                fragment = new CateFragment();
                break;
            case 3:
                fragment = new InfoFragment();
                break;
            case 4:
                fragment = new CheFragment();
                break;
            case 5:
                fragment = new MyFragment();
                break;
        }
        return fragment;
    }
}
