package com.example.zzj.fragmenttab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/20.
 */

public abstract class BaseFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_content,container,false);
        TextView content = (TextView)view.findViewById(R.id.txt_content);
        content.setText(initContent());
        return view;
    }
    public abstract String initContent();
}
