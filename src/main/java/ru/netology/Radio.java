package ru.netology;

public class Radio {
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }
    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel)
            return;
        if (currentChannel < minChannel)
            return;
        this.currentChannel = currentChannel;
    }
    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        } else {
            currentChannel++;
        }
    }
    public void previousChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        } else {
            currentChannel --;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }
    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}
