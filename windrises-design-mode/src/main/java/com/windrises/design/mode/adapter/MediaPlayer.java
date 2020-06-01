package com.windrises.design.mode.adapter;

/**
 * 媒体播放器接口
 *
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 15:56
 */
public interface MediaPlayer {
    /**
     * 播放方法
     *
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
