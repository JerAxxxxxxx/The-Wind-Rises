package com.windrises.design.mode.adapter;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 16:00
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //
    }
}
