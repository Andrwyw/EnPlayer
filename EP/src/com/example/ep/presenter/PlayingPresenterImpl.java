package com.example.ep.presenter;

import com.example.ep.model.PlayingModule;
import com.example.ep.ui.view.PlayingView;

public class PlayingPresenterImpl implements PlayingPresenter
{

    // �϶�Ҫ����view������UI
    PlayingView mPlayingView;
    // �϶�Ҫ����module����ȡ����
    PlayingModule mPlayingModule;

    @Override
    public void gotoNextPlaying()
    {
        mPlayingModule.loadNextPlaying();
    }

    // WYW_TODO:һ����common���е�listener������ OnPlayingFinishedListener
    // WYW_TODO: ���ַ�ʽ�ɷ� ����ͨ�û�
    // m֪ͨpͨ��callback�ķ�ʽ
    public void onLoadNextPlayingCallback(String msg)
    {
        mPlayingView.updateMessagePanel(msg);
    }
}
