package com.example.ep.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.example.ep.R;
import com.example.ep.presenter.PlayingPresenter;
import com.example.ep.presenter.PlayingPresenterImpl;
import com.example.ep.ui.view.PlayingView;

public class PlayingActivity extends Activity implements PlayingView
{
    // WYW_TODO:knife
    private TextView mMsgPanel;

    // 不叫IPresenter，mvp之间只操作接口.
    private PlayingPresenter mPresenter;

    // # system methods

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        mMsgPanel = (TextView) findViewById(R.id.tvMsgPanel);

        // WYW_TODO:自动化这个依赖过程，包括mvp+listener
        // WYW_TODO:什么时候解除依赖，确保mvp间不会出现内存溢出
        mPresenter = new PlayingPresenterImpl();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.playing, menu);
        return true;
    }

    // # interface override block

    @Override
    public void updateMessagePanel(String msg)
    {
        mMsgPanel.setText(msg);
    }

    // # listener
    public void onBtnClicked(View v)
    {
        mPresenter.gotoNextPlaying();
    }

}
