package com.windrises.design.mode.adapter;

/**
 * 高级媒体播放器接口
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 15:57
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
