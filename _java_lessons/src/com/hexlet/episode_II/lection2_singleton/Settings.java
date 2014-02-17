package com.hexlet.episode_II.lection2_singleton;

/**
 * Created with IntelliJ IDEA.
 * User: maksym.tashchuk
 * Date: 2/17/14
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Settings {
    private static final String GAME_NAME = "NFS Most Wanted";

    private int playersCount;

    public synchronized static Settings getInstance() {
        return Settings.SettingInstanceHolder.INSTANCE;
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    private Settings() {
        System.out.println("Default constructor in Settings()");
    }

    public static class SettingInstanceHolder {
        private static Settings INSTANCE = new Settings();

        private SettingInstanceHolder() {
        }
    }
}
