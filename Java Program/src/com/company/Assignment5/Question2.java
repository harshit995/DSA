package com.company.Assignment5;

public class Question2 {

    public static class TV {
        int channel = 1;
        int volumeLevel = 1;
        boolean on = false;

        public TV() {

        }

        public void turnOn() {
            on = true;
        }

        public void turnOff() {
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 120) {
                channel = newChannel;
            }
        }

        public void setVolume(int newVolumeLevel) {
            if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
                volumeLevel = newVolumeLevel;
            }
        }

        public void channelUp() {
            if (on && channel < 120) {
                channel++;
            }
        }

        public void channelDown() {
            if (on && channel > 1) {
                channel--;
            }
        }

        public void volumeUp() {
            if (on && volumeLevel < 7) {
                volumeLevel++;
            }
        }

        public void volumeDown() {
            if (on && volumeLevel > 1) {
                volumeLevel--;
            }
        }


        public static class testTV {
            public static void main(String[] args) {
                TV tv1 = new TV();
                tv1.turnOn();
                tv1.setChannel(53);
                tv1.setVolume(3);

                TV tv2 = new TV();
                tv2.turnOn();
                tv2.setChannel(18);
                tv2.channelUp();
                tv2.channelUp();
                tv2.channelDown();

                System.out.println("TV-1's channel is " + tv1.channel + "and volume level is" + tv1.volumeLevel);

                System.out.println("TV-2's channel is " + tv2.channel + "and volume level is" + tv2.volumeLevel);
            }}}
}












