package com.example.ep.presenter;

import com.example.ep.model.PlayingModule;
import com.example.ep.ui.view.PlayingView;

public class PlayingPresenterImpl implements PlayingPresenter
{

    // 肯定要依赖view来更新UI
    PlayingView mPlayingView;
    // 肯定要依赖module来获取数据
    PlayingModule mPlayingModule;

    @Override
    public void gotoNextPlaying()
    {
        mPlayingModule.loadNextPlaying();
    }

    // WYW_TODO:一个更common贴切的listener类名： OnPlayingFinishedListener
    // WYW_TODO: 这种方式可否 抽象通用化
    // m通知p通过callback的方式
    public void onLoadNextPlayingCallback(String msg)
    {
        mPlayingView.updateMessagePanel(msg);
    }
}
