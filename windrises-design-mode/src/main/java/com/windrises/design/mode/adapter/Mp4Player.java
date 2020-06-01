package com.windrises.design.mode.adapter;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/6/1 16:01
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
