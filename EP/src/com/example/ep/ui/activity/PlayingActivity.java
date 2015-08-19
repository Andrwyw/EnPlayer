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

    // ����IPresenter��mvp֮��ֻ�����ӿ�.
    private PlayingPresenter mPresenter;

    // # system methods

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        mMsgPanel = (TextView) findViewById(R.id.tvMsgPanel);

        // WYW_TODO:�Զ�������������̣�����mvp+listener
        // WYW_TODO:ʲôʱ����������ȷ��mvp�䲻������ڴ����
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
